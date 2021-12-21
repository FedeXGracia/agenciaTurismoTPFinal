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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author FEDEX
 */
@Entity
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int employeeId;
    
    @Basic
    private String fName;
    private String lName;
    private String address;
    private String dni;
    private String nationality;
    private String phoneNumber;
    private String email;
    private String charge;
    private double salary;
    
    @Temporal(TemporalType.DATE)
    private Date bornDate;
        
    @OneToOne
    private User user;
    
    @OneToMany
    private List<Sale> salesList; //new ArrayList<>(Sale);

    public Employee() {
    }

    public Employee(int employeeId, String fName, String lName, String address, String dni, String bornDate, String nationality, String phoneNumber, String email, String charge, double salary, User user, List<Sale> salesList) {
        this.employeeId = employeeId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.dni = dni;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.bornDate = formatDate.parse(bornDate);
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.charge = charge;
        this.salary = salary;
        this.user = user;
        this.salesList = salesList;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getBornDate() {
        SimpleDateFormat stringDF = new SimpleDateFormat("dd/mm/yyyy");
        return stringDF.format(bornDate);
    }

    public void setBornDate(String bornDate) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.bornDate = formatDate.parse(bornDate);
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Sale> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sale> salesList) {
        this.salesList = salesList;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Id Empleado=" + employeeId + ", Nombre=" + fName
                + ", Apellido=" + lName + ", Domicilio=" + address 
                + ", DNI=" + dni + ", Fecha de naciemiento=" + bornDate 
                + ", Nacionalidad=" + nationality 
                + ", Número de teléfono=" + phoneNumber + ", email=" + email 
                + ", Cargo=" + charge + ", Salario=" + salary 
                + ", Usuario=" + user + ", Lsita de ventas=" + salesList + '}';
    }

    
    
}
