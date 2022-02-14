package payeh.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mohtava.model.Fasle;

@Generated(value="Dali", date="2022-02-09T03:02:10.432+0330")
@StaticMetamodel(Darsclass.class)
public class Darsclass_ {
	public static volatile SingularAttribute<Darsclass, Integer> id;
	public static volatile SingularAttribute<Darsclass, Boolean> active;
	public static volatile SingularAttribute<Darsclass, Integer> darsaghaboli;
	public static volatile SingularAttribute<Darsclass, String> discription;
	public static volatile SingularAttribute<Darsclass, Integer> hazineh;
	public static volatile SingularAttribute<Darsclass, String> name;
	public static volatile SingularAttribute<Darsclass, Date> startdate;
	public static volatile ListAttribute<Darsclass, Darsakhshodeh> darsakhshodehs;
	public static volatile SingularAttribute<Darsclass, Classpayeh> classpayehBean;
	public static volatile SingularAttribute<Darsclass, Member> member;
	public static volatile ListAttribute<Darsclass, Fasle> fasles;
}
