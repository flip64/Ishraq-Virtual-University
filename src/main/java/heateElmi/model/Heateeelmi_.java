package heateElmi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import payeh.model.Reshteh;

@Generated(value="Dali", date="2022-02-09T03:02:10.414+0330")
@StaticMetamodel(Heateeelmi.class)
public class Heateeelmi_ {
	public static volatile SingularAttribute<Heateeelmi, Integer> id;
	public static volatile SingularAttribute<Heateeelmi, Integer> maxuser;
	public static volatile SingularAttribute<Heateeelmi, Integer> minmaghtah;
	public static volatile SingularAttribute<Heateeelmi, Reshteh> reshtehBean;
	public static volatile ListAttribute<Heateeelmi, Sematheateelmi> sematheateelmis;
}
