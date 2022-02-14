package AAA.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T08:20:13.199+0330")
@StaticMetamodel(Role.class)
public class Role_ {
	public static volatile SingularAttribute<Role, Integer> id;
	public static volatile SingularAttribute<Role, String> ensme;
	public static volatile SingularAttribute<Role, Integer> maxuser;
	public static volatile SingularAttribute<Role, String> name;
	public static volatile ListAttribute<Role, Accecslist> accecslists;
	public static volatile ListAttribute<Role, Auser> ausers;
}
