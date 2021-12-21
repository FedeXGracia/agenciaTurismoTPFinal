package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Client;
import logica.Employee;
import logica.Sale;
import logica.TouristPackage;
import logica.TouristService;
import logica.User;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author FEDEX
 */
public class PersistenceController {

    EmployeeJpaController employeeJPA = new EmployeeJpaController();
    UserJpaController userJPA = new UserJpaController();
    ClientJpaController clientJPA = new ClientJpaController();
    SaleJpaController saleJPA = new SaleJpaController();
    TouristServiceJpaController tourServiceJPA = new TouristServiceJpaController();
    TouristPackageJpaController tourPackageJPA = new TouristPackageJpaController();

    public void createEmployee(Employee employee, User user) {
        userJPA.create(user);
        employeeJPA.create(employee);
    }

    public void createClient(Client client) {
        clientJPA.create(client);
    }

    public void createSale(Sale sale) {
        saleJPA.create(sale);
    }

    public void createTouristService(TouristService tourService) {
        tourServiceJPA.create(tourService);
    }

    public void createTouristPackage(TouristPackage tourPackage) {
        tourPackageJPA.create(tourPackage);
    }

    public List<Employee> getEmployees() {
        return employeeJPA.findEmployeeEntities();
    }

    public List<User> getUsers() {
        return userJPA.findUserEntities();
    }

    public List<Client> getClients() {
        return clientJPA.findClientEntities();
    }

    public List<Sale> getSales() {
        return saleJPA.findSaleEntities();
    }

    public List<TouristService> getTourServices() {
        return tourServiceJPA.findTouristServiceEntities();
    }

    public List<TouristPackage> getTourPackages() {
        return tourPackageJPA.findTouristPackageEntities();
    }

    public void deleteEmployee(int id) {
        try {
            employeeJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            userJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteClient(int id) {
        try {
            clientJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteSale(int id) {
        try {
            saleJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteTouristService(int id) {
        try {
            tourServiceJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteTouristPackage(int id) {
        try {
            tourPackageJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Employee searchEmployee(int id) {
        return employeeJPA.findEmployee(id);
    }

    public Client searchClient(int id) {
        return clientJPA.findClient(id);
    }
    
    public Sale searchSale(int id) {
        return saleJPA.findSale(id);
    }

    public TouristService searchTouristService(int id) {
        return tourServiceJPA.findTouristService(id);
    }

    public TouristPackage searchTouristPackage(int id) {
        return tourPackageJPA.findTouristPackage(id);
    }

    public void editEmployee(Employee emp) {
        try {
            employeeJPA.edit(emp);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            userJPA.edit(emp.getUser());
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editCient(Client cli) {
        try {
            clientJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editSale(Sale sale) {
        try {
            saleJPA.edit(sale);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editTouristService(TouristService tS) {
        try {
            tourServiceJPA.edit(tS);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editTouristPackage(TouristPackage tP) {
        try {
            tourPackageJPA.edit(tP);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
