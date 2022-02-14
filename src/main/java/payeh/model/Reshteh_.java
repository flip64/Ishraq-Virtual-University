package payeh.model;

import heateElmi.model.Heateeelmi;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.436+0330")
@StaticMetamodel(Reshteh.class)
public class Reshteh_ {
	public static volatile SingularAttribute<Reshteh, Integer> id;
	public static volatile SingularAttribute<Reshteh, String> discription;
	public static volatile SingularAttribute<Reshteh, String> name;
	public static volatile ListAttribute<Reshteh, Classpayeh> classpayehs;
	public static volatile ListAttribute<Reshteh, Heateeelmi> heateeelmis;
	public static volatile SingularAttribute<Reshteh, Daneshkadeh> daneshkadehBean;
	public static volatile SingularAttribute<Reshteh, Maghtehtahsili> maghtehtahsili;
}
