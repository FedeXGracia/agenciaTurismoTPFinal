package logica;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author FEDEX
 */
@Entity
public class TouristService implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int serviceCode;
    
    /*@Basic
    private String[] name = {"Hotel", "Auto", "Colectivo", "Avión", "Tren", "Excursiones", "Entradas"};
    private String[] briefDescription = {"Hospedaje", "Alquiler", "Pasajes", "Pasajes", "Pasajes", "Salidas", "Eventos"};
    private String[] serviceDestiny = {"Mendoza", "Buenos Aires", "Córdoba", "Misiones", "Santa Cruz"};
    private double[] serviceCost = {1000, 2000, 3000, 4000, 3500, 1500, 500};*/
    
    @Basic
    private String name;
    private String briefDescription;
    private String serviceDestiny;
    private double serviceCost;
    
    @Temporal(TemporalType.DATE)
    private Date serviceDate;
    
    @ManyToMany
    private List<TouristPackage> packagesList;

    public TouristService() {
    }

    public TouristService(int serviceCode, String briefDescription, String serviceDestiny, String serviceDate, double serviceCost, List<TouristPackage> packagesList) {
        this.serviceCode = serviceCode;
        this.briefDescription = briefDescription;
        this.serviceDestiny = serviceDestiny;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.serviceDate = formatDate.parse(serviceDate);
        } catch (ParseException ex) {
            Logger.getLogger(TouristService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.serviceCost = serviceCost;
        this.packagesList = packagesList;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getServiceDestiny() {
        return serviceDestiny;
    }

    public void setServiceDestiny(String serviceDestiny) {
        this.serviceDestiny = serviceDestiny;
    }

    public String getServiceDate() {
        SimpleDateFormat stringDF = new SimpleDateFormat("dd/mm/yyyy");
        return stringDF.format(serviceDate);
    }

    public void setServiceDate(String serviceDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.serviceDate = formatDate.parse(serviceDate);
        } catch (ParseException ex) {
            Logger.getLogger(TouristService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public List<TouristPackage> getPackagesList() {
        return packagesList;
    }

    public void setPackagesList(List<TouristPackage> packagesList) {
        this.packagesList = packagesList;
    }

    @Override
    public String toString() {
        return "TouristService{" + "serviceCode=" + serviceCode
                + ", name=" + name + ", briefDescription=" + briefDescription 
                + ", serviceDestiny=" + serviceDestiny + ", serviceCost=" 
                + serviceCost + ", serviceDate=" + serviceDate + '}';
    }
     
    
}
