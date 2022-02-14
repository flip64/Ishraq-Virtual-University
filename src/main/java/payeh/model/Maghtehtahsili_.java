package payeh.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.433+0330")
@StaticMetamodel(Maghtehtahsili.class)
public class Maghtehtahsili_ {
	public static volatile SingularAttribute<Maghtehtahsili, Integer> id;
	public static volatile SingularAttribute<Maghtehtahsili, String> name;
	public static volatile SingularAttribute<Maghtehtahsili, Integer> rotbeh;
	public static volatile ListAttribute<Maghtehtahsili, Member> members;
	public static volatile ListAttribute<Maghtehtahsili, Reshteh> reshtehs;
}
