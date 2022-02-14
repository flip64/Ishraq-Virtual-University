package payeh.model;

import AAA.model.Auser;
import heateElmi.model.Sematheateelmi;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.434+0330")
@StaticMetamodel(Member.class)
public class Member_ {
	public static volatile SingularAttribute<Member, Integer> id;
	public static volatile SingularAttribute<Member, String> lastname;
	public static volatile SingularAttribute<Member, Integer> mojodi;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile ListAttribute<Member, Darsakhshodeh> darsakhshodehs;
	public static volatile ListAttribute<Member, Darsclass> darsclasses;
	public static volatile SingularAttribute<Member, Auser> auserBean;
	public static volatile SingularAttribute<Member, Maghtehtahsili> maghtehtahsili;
	public static volatile ListAttribute<Member, Sematheateelmi> sematheateelmis;
}
