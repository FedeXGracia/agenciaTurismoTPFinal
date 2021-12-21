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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author FEDEX
 */
@Entity
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int clientId;
    
    @Basic
    private String fName;
    private String lName;
    private String address;
    private String dni;
    private String nationality;
    private String phoneNumber;
    private String email;
    
    @Temporal(TemporalType.DATE)
    private Date bornDate;
    
    @OneToMany
    private List<Sale> salesList;

    public Client() {
    }

    public Client(int clientId, String fName, String lName, String address, String dni, String nationality, String phoneNumber, String email, String bornDate, List<Sale> salesList) {
        this.clientId = clientId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.dni = dni;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.email = email;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.bornDate = formatDate.parse(bornDate);
        } catch (ParseException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.salesList = salesList;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBornDate() {
        SimpleDateFormat stringDF = new SimpleDateFormat("dd/mm/yyyy");
        return stringDF.format(bornDate);
    }

    public void setBornDate(String bornDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.bornDate = formatDate.parse(bornDate);
        } catch (ParseException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Sale> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sale> salesList) {
        this.salesList = salesList;
    }

    @Override
    public String toString() {
        return "Client{" + "clientId=" + clientId + ", fName=" + fName 
                + ", lName=" + lName + ", address=" + address 
                + ", dni=" + dni + ", nationality=" + nationality 
                + ", phoneNumber=" + phoneNumber + ", email=" + email 
                + ", bornDate=" + bornDate + ", salesList=" + salesList + '}';
    }
     
}
