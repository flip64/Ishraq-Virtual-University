package AAA.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T08:01:04.765+0330")
@StaticMetamodel(Pagecate.class)
public class Pagecate_ {
	public static volatile SingularAttribute<Pagecate, Integer> id;
	public static volatile SingularAttribute<Pagecate, String> name;
	public static volatile SingularAttribute<Pagecate, Integer> orders;
	public static volatile ListAttribute<Pagecate, Page> pages;
}
