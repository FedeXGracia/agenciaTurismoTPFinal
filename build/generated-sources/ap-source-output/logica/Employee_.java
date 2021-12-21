package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Sale;
import logica.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-21T20:34:04")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> lName;
    public static volatile SingularAttribute<Employee, String> address;
    public static volatile SingularAttribute<Employee, String> charge;
    public static volatile ListAttribute<Employee, Sale> salesList;
    public static volatile SingularAttribute<Employee, Integer> employeeId;
    public static volatile SingularAttribute<Employee, Date> bornDate;
    public static volatile SingularAttribute<Employee, Double> salary;
    public static volatile SingularAttribute<Employee, String> fName;
    public static volatile SingularAttribute<Employee, String> phoneNumber;
    public static volatile SingularAttribute<Employee, String> nationality;
    public static volatile SingularAttribute<Employee, User> user;
    public static volatile SingularAttribute<Employee, String> dni;
    public static volatile SingularAttribute<Employee, String> email;

}