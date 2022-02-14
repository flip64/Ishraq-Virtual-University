package AAA.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T08:01:04.763+0330")
@StaticMetamodel(Page.class)
public class Page_ {
	public static volatile SingularAttribute<Page, Integer> id;
	public static volatile SingularAttribute<Page, String> name;
	public static volatile SingularAttribute<Page, Integer> orders;
	public static volatile SingularAttribute<Page, String> pageename;
	public static volatile SingularAttribute<Page, String> url;
	public static volatile ListAttribute<Page, Accecslist> accecslists;
	public static volatile SingularAttribute<Page, Pagecate> pagecate;
	public static volatile ListAttribute<Page, Pagevisit> pagevisits;
}
