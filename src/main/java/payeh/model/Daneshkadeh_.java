package payeh.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.429+0330")
@StaticMetamodel(Daneshkadeh.class)
public class Daneshkadeh_ {
	public static volatile SingularAttribute<Daneshkadeh, Integer> id;
	public static volatile SingularAttribute<Daneshkadeh, String> discription;
	public static volatile SingularAttribute<Daneshkadeh, String> name;
	public static volatile ListAttribute<Daneshkadeh, Reshteh> reshtehs;
}
