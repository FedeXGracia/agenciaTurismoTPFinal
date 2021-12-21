package logica;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author FEDEX
 */
@Entity
public class Sale implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int saleNumber;
    
    @Basic
    String payMethod;
    
    @Temporal(TemporalType.DATE)
    private Date saleDate;
    
    @ManyToOne//(fetch = FetchType.LAZY) (cascade= CascadeType.ALL)
    //@JoinColumn(name="serviceCode)
    private TouristService tourService;

    public Sale() {
    }

    public Sale(int saleNumber, String payMethod, String saleDate, TouristService tourService) {
        this.saleNumber = saleNumber;
        this.payMethod = payMethod;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.saleDate = formatDate.parse(saleDate);
        } catch (ParseException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.tourService = tourService;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getSaleDate() {
        SimpleDateFormat stringDF = new SimpleDateFormat("dd/mm/yyyy");
        return stringDF.format(saleDate);
    }

    public void setSaleDate(String saleDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.saleDate = formatDate.parse(saleDate);
        } catch (ParseException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TouristService getTourService() {
        return tourService;
    }

    public void setTourService(TouristService tourService) {
        this.tourService = tourService;
    }

    @Override
    public String toString() {
        return "Sale{" + "saleNumber=" + saleNumber 
                + ", payMethod=" + payMethod 
                + ", saleDate=" + saleDate 
                + ", tourService=" + tourService + '}';
    }
    
}
