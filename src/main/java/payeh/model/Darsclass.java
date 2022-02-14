package payeh.model;

import java.io.Serializable;
import javax.persistence.*;

import mohtava.model.Fasle;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the darsclass database table.
 * 
 */
@Entity
@NamedQuery(name="Darsclass.findAll", query="SELECT d FROM Darsclass d")
public class Darsclass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private Integer darsaghaboli;

	private String discription;

	private Integer hazineh;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Darsakhshodeh
	@OneToMany(mappedBy="darsclass")
	private List<Darsakhshodeh> darsakhshodehs;

	//bi-directional many-to-one association to Classpayeh
	@ManyToOne
	@JoinColumn(name="classpayeh")
	private Classpayeh classpayehBean;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="ostad")
	private Member member;

	//bi-directional many-to-one association to Fasle
	@OneToMany(mappedBy="darsclass")
	private List<Fasle> fasles;

	public Darsclass() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getDarsaghaboli() {
		return this.darsaghaboli;
	}

	public void setDarsaghaboli(Integer darsaghaboli) {
		this.darsaghaboli = darsaghaboli;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Integer getHazineh() {
		return this.hazineh;
	}

	public void setHazineh(Integer hazineh) {
		this.hazineh = hazineh;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public List<Darsakhshodeh> getDarsakhshodehs() {
		return this.darsakhshodehs;
	}

	public void setDarsakhshodehs(List<Darsakhshodeh> darsakhshodehs) {
		this.darsakhshodehs = darsakhshodehs;
	}

	public Darsakhshodeh addDarsakhshodeh(Darsakhshodeh darsakhshodeh) {
		getDarsakhshodehs().add(darsakhshodeh);
		darsakhshodeh.setDarsclass(this);

		return darsakhshodeh;
	}

	public Darsakhshodeh removeDarsakhshodeh(Darsakhshodeh darsakhshodeh) {
		getDarsakhshodehs().remove(darsakhshodeh);
		darsakhshodeh.setDarsclass(null);

		return darsakhshodeh;
	}

	public Classpayeh getClasspayehBean() {
		return this.classpayehBean;
	}

	public void setClasspayehBean(Classpayeh classpayehBean) {
		this.classpayehBean = classpayehBean;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<Fasle> getFasles() {
		return this.fasles;
	}

	public void setFasles(List<Fasle> fasles) {
		this.fasles = fasles;
	}

	public Fasle addFasle(Fasle fasle) {
		getFasles().add(fasle);
		fasle.setDarsclass(this);

		return fasle;
	}

	public Fasle removeFasle(Fasle fasle) {
		getFasles().remove(fasle);
		fasle.setDarsclass(null);

		return fasle;
	}

}