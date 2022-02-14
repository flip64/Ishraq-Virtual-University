package heateElmi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import payeh.model.Member;

@Generated(value="Dali", date="2022-02-09T03:02:10.418+0330")
@StaticMetamodel(Sematheateelmi.class)
public class Sematheateelmi_ {
	public static volatile SingularAttribute<Sematheateelmi, Integer> id;
	public static volatile SingularAttribute<Sematheateelmi, String> ename;
	public static volatile SingularAttribute<Sematheateelmi, String> name;
	public static volatile SingularAttribute<Sematheateelmi, String> shrhevazayef;
	public static volatile SingularAttribute<Sematheateelmi, Heateeelmi> heateeelmi;
	public static volatile SingularAttribute<Sematheateelmi, Member> memberBean;
}
