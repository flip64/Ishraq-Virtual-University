package AAA.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import payeh.model.Member;

@Generated(value="Dali", date="2022-02-09T08:19:46.788+0330")
@StaticMetamodel(Auser.class)
public class Auser_ {
	public static volatile SingularAttribute<Auser, Integer> id;
	public static volatile SingularAttribute<Auser, String> email;
	public static volatile SingularAttribute<Auser, String> hpasworld;
	public static volatile SingularAttribute<Auser, String> mobile;
	public static volatile SingularAttribute<Auser, String> nikename;
	public static volatile SingularAttribute<Auser, String> username;
	public static volatile SingularAttribute<Auser, Role> roleBean;
	public static volatile ListAttribute<Auser, Member> members;
	public static volatile ListAttribute<Auser, Session> sessions;
}
