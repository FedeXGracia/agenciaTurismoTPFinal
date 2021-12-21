package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Sale;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-21T20:34:03")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> lName;
    public static volatile SingularAttribute<Client, Integer> clientId;
    public static volatile SingularAttribute<Client, String> fName;
    public static volatile SingularAttribute<Client, String> address;
    public static volatile SingularAttribute<Client, String> phoneNumber;
    public static volatile SingularAttribute<Client, String> nationality;
    public static volatile ListAttribute<Client, Sale> salesList;
    public static volatile SingularAttribute<Client, Date> bornDate;
    public static volatile SingularAttribute<Client, String> dni;
    public static volatile SingularAttribute<Client, String> email;

}