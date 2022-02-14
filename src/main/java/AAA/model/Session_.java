package AAA.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T08:01:04.769+0330")
@StaticMetamodel(Session.class)
public class Session_ {
	public static volatile SingularAttribute<Session, Integer> id;
	public static volatile SingularAttribute<Session, String> client;
	public static volatile SingularAttribute<Session, Boolean> ismanuallogout;
	public static volatile SingularAttribute<Session, Date> logindate;
	public static volatile SingularAttribute<Session, Date> logoutdate;
	public static volatile ListAttribute<Session, Pagevisit> pagevisits;
	public static volatile SingularAttribute<Session, Auser> auserBean;
}
