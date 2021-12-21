package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.TouristPackage;
import logica.TouristService;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author FEDEX
 */
public class TouristServiceJpaController implements Serializable {

    public TouristServiceJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public TouristServiceJpaController() { //AGREGAR MANUALMENTE EL CONTRUCTOR VACÍO
        emf = Persistence.createEntityManagerFactory("AgenciaTurismoPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TouristService touristService) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(touristService);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TouristService touristService) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            touristService = em.merge(touristService);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = touristService.getServiceCode();
                if (findTouristService(id) == null) {
                    throw new NonexistentEntityException("The touristService with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TouristService touristService;
            try {
                touristService = em.getReference(TouristService.class, id);
                touristService.getServiceCode();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The touristService with id " + id + " no longer exists.", enfe);
            }
            em.remove(touristService);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TouristService> findTouristServiceEntities() {
        return findTouristServiceEntities(true, -1, -1);
    }

    public List<TouristService> findTouristServiceEntities(int maxResults, int firstResult) {
        return findTouristServiceEntities(false, maxResults, firstResult);
    }

    private List<TouristService> findTouristServiceEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TouristService.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TouristService findTouristService(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TouristService.class, id);
        } finally {
            em.close();
        }
    }

    public int getTouristServiceCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TouristService> rt = cq.from(TouristService.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
        
}
