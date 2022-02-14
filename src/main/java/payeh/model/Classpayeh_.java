package payeh.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.428+0330")
@StaticMetamodel(Classpayeh.class)
public class Classpayeh_ {
	public static volatile SingularAttribute<Classpayeh, Integer> id;
	public static volatile SingularAttribute<Classpayeh, String> discription;
	public static volatile SingularAttribute<Classpayeh, String> name;
	public static volatile SingularAttribute<Classpayeh, Reshteh> reshtehBean;
	public static volatile ListAttribute<Classpayeh, Darsclass> darsclasses;
}
