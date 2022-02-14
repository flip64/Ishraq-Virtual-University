package payeh.model;

import java.io.Serializable;
import javax.persistence.*;

import AAA.model.Auser;
import heateElmi.model.Sematheateelmi;

import java.util.List;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String lastname;

	private Integer mojodi;

	private String name;

	//bi-directional many-to-one association to Darsakhshodeh
	@OneToMany(mappedBy="memberBean")
	private List<Darsakhshodeh> darsakhshodehs;

	//bi-directional many-to-one association to Darsclass
	@OneToMany(mappedBy="member")
	private List<Darsclass> darsclasses;

	//bi-directional many-to-one association to Auser
	@ManyToOne
	@JoinColumn(name="auser")
	private Auser auserBean;

	//bi-directional many-to-one association to Maghtehtahsili
	@ManyToOne
	@JoinColumn(name="maghtah")
	private Maghtehtahsili maghtehtahsili;

	//bi-directional many-to-one association to Sematheateelmi
	@OneToMany(mappedBy="memberBean")
	private List<Sematheateelmi> sematheateelmis;

	public Member() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getMojodi() {
		return this.mojodi;
	}

	public void setMojodi(Integer mojodi) {
		this.mojodi = mojodi;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Darsakhshodeh> getDarsakhshodehs() {
		return this.darsakhshodehs;
	}

	public void setDarsakhshodehs(List<Darsakhshodeh> darsakhshodehs) {
		this.darsakhshodehs = darsakhshodehs;
	}

	public Darsakhshodeh addDarsakhshodeh(Darsakhshodeh darsakhshodeh) {
		getDarsakhshodehs().add(darsakhshodeh);
		darsakhshodeh.setMemberBean(this);

		return darsakhshodeh;
	}

	public Darsakhshodeh removeDarsakhshodeh(Darsakhshodeh darsakhshodeh) {
		getDarsakhshodehs().remove(darsakhshodeh);
		darsakhshodeh.setMemberBean(null);

		return darsakhshodeh;
	}

	public List<Darsclass> getDarsclasses() {
		return this.darsclasses;
	}

	public void setDarsclasses(List<Darsclass> darsclasses) {
		this.darsclasses = darsclasses;
	}

	public Darsclass addDarsclass(Darsclass darsclass) {
		getDarsclasses().add(darsclass);
		darsclass.setMember(this);

		return darsclass;
	}

	public Darsclass removeDarsclass(Darsclass darsclass) {
		getDarsclasses().remove(darsclass);
		darsclass.setMember(null);

		return darsclass;
	}

	public Auser getAuserBean() {
		return this.auserBean;
	}

	public void setAuserBean(Auser auserBean) {
		this.auserBean = auserBean;
	}

	public Maghtehtahsili getMaghtehtahsili() {
		return this.maghtehtahsili;
	}

	public void setMaghtehtahsili(Maghtehtahsili maghtehtahsili) {
		this.maghtehtahsili = maghtehtahsili;
	}

	public List<Sematheateelmi> getSematheateelmis() {
		return this.sematheateelmis;
	}

	public void setSematheateelmis(List<Sematheateelmi> sematheateelmis) {
		this.sematheateelmis = sematheateelmis;
	}

	public Sematheateelmi addSematheateelmi(Sematheateelmi sematheateelmi) {
		getSematheateelmis().add(sematheateelmi);
		sematheateelmi.setMemberBean(this);

		return sematheateelmi;
	}

	public Sematheateelmi removeSematheateelmi(Sematheateelmi sematheateelmi) {
		getSematheateelmis().remove(sematheateelmi);
		sematheateelmi.setMemberBean(null);

		return sematheateelmi;
	}

}