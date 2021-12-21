package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.TouristService;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-21T20:34:04")
@StaticMetamodel(Sale.class)
public class Sale_ { 

    public static volatile SingularAttribute<Sale, String> payMethod;
    public static volatile SingularAttribute<Sale, Date> saleDate;
    public static volatile SingularAttribute<Sale, Integer> saleNumber;
    public static volatile SingularAttribute<Sale, TouristService> tourService;

}