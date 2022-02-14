package AAA.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T08:01:04.766+0330")
@StaticMetamodel(Pagevisit.class)
public class Pagevisit_ {
	public static volatile SingularAttribute<Pagevisit, Integer> id;
	public static volatile SingularAttribute<Pagevisit, Date> indate;
	public static volatile SingularAttribute<Pagevisit, Page> pageBean;
	public static volatile SingularAttribute<Pagevisit, Session> sessionBean;
}
