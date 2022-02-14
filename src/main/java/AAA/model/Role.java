package AAA.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ensme;

	private Integer maxuser;

	private String name;

	//bi-directional many-to-one association to Accecslist
	@OneToMany(mappedBy="roleBean")
	private List<Accecslist> accecslists;

	//bi-directional many-to-one association to Auser
	@OneToMany(mappedBy="roleBean")
	private List<Auser> ausers;

	public Role() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnsme() {
		return this.ensme;
	}

	public void setEnsme(String ensme) {
		this.ensme = ensme;
	}

	public Integer getMaxuser() {
		return this.maxuser;
	}

	public void setMaxuser(Integer maxuser) {
		this.maxuser = maxuser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Accecslist> getAccecslists() {
		return this.accecslists;
	}

	public void setAccecslists(List<Accecslist> accecslists) {
		this.accecslists = accecslists;
	}

	public Accecslist addAccecslist(Accecslist accecslist) {
		getAccecslists().add(accecslist);
		accecslist.setRoleBean(this);

		return accecslist;
	}

	public Accecslist removeAccecslist(Accecslist accecslist) {
		getAccecslists().remove(accecslist);
		accecslist.setRoleBean(null);

		return accecslist;
	}

	public List<Auser> getAusers() {
		return this.ausers;
	}

	public void setAusers(List<Auser> ausers) {
		this.ausers = ausers;
	}

	public Auser addAuser(Auser auser) {
		getAusers().add(auser);
		auser.setRoleBean(this);

		return auser;
	}

	public Auser removeAuser(Auser auser) {
		getAusers().remove(auser);
		auser.setRoleBean(null);

		return auser;
	}

}