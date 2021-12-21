package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author FEDEX
 */
@Entity
public class TouristPackage implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int packageCode;
    
    @Basic
    Double packageCost;

    public TouristPackage() {
    }

    public TouristPackage(int packageCode, Double packageCost) {
        this.packageCode = packageCode;
        this.packageCost = packageCost;
    }

    public int getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(int packageCode) {
        this.packageCode = packageCode;
    }

    public Double getPackageCost() {
        return packageCost;
    }

    public void setPackageCost(Double packageCost) {
        this.packageCost = packageCost;
    }

    @Override
    public String toString() {
        return "TouristPackage{" + "packageCode=" + packageCode 
                + ", packageCost=" + packageCost + '}';
    }
    
}
