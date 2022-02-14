package payeh.model;

import azmoon.model.Azmonozve;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-09T03:02:10.430+0330")
@StaticMetamodel(Darsakhshodeh.class)
public class Darsakhshodeh_ {
	public static volatile SingularAttribute<Darsakhshodeh, Integer> id;
	public static volatile SingularAttribute<Darsakhshodeh, Boolean> finalnomreh;
	public static volatile SingularAttribute<Darsakhshodeh, Integer> mablaghpardakhti;
	public static volatile SingularAttribute<Darsakhshodeh, Integer> nomreh;
	public static volatile SingularAttribute<Darsakhshodeh, Integer> takhfif;
	public static volatile ListAttribute<Darsakhshodeh, Azmonozve> azmonozves;
	public static volatile SingularAttribute<Darsakhshodeh, Darsclass> darsclass;
	public static volatile SingularAttribute<Darsakhshodeh, Member> memberBean;
}
