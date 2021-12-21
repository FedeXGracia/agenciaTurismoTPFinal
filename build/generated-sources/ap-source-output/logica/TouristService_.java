package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.TouristPackage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-21T20:34:04")
@StaticMetamodel(TouristService.class)
public class TouristService_ { 

    public static volatile SingularAttribute<TouristService, Date> serviceDate;
    public static volatile SingularAttribute<TouristService, Integer> serviceCode;
    public static volatile SingularAttribute<TouristService, Double> serviceCost;
    public static volatile SingularAttribute<TouristService, String> name;
    public static volatile ListAttribute<TouristService, TouristPackage> packagesList;
    public static volatile SingularAttribute<TouristService, String> briefDescription;
    public static volatile SingularAttribute<TouristService, String> serviceDestiny;

}