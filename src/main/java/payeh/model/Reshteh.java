package payeh.model;

import java.io.Serializable;
import javax.persistence.*;

import heateElmi.model.Heateeelmi;

import java.util.List;


/**
 * The persistent class for the reshteh database table.
 * 
 */
@Entity
@NamedQuery(name="Reshteh.findAll", query="SELECT r FROM Reshteh r")
public class Reshteh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String discription;

	private String name;

	//bi-directional many-to-one association to Classpayeh
	@OneToMany(mappedBy="reshtehBean")
	private List<Classpayeh> classpayehs;

	//bi-directional many-to-one association to Heateeelmi
	@OneToMany(mappedBy="reshtehBean")
	private List<Heateeelmi> heateeelmis;

	//bi-directional many-to-one association to Daneshkadeh
	@ManyToOne
	@JoinColumn(name="daneshkadeh")
	private Daneshkadeh daneshkadehBean;

	//bi-directional many-to-one association to Maghtehtahsili
	@ManyToOne
	@JoinColumn(name="maghtah")
	private Maghtehtahsili maghtehtahsili;

	public Reshteh() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Classpayeh> getClasspayehs() {
		return this.classpayehs;
	}

	public void setClasspayehs(List<Classpayeh> classpayehs) {
		this.classpayehs = classpayehs;
	}

	public Classpayeh addClasspayeh(Classpayeh classpayeh) {
		getClasspayehs().add(classpayeh);
		classpayeh.setReshtehBean(this);

		return classpayeh;
	}

	public Classpayeh removeClasspayeh(Classpayeh classpayeh) {
		getClasspayehs().remove(classpayeh);
		classpayeh.setReshtehBean(null);

		return classpayeh;
	}

	public List<Heateeelmi> getHeateeelmis() {
		return this.heateeelmis;
	}

	public void setHeateeelmis(List<Heateeelmi> heateeelmis) {
		this.heateeelmis = heateeelmis;
	}

	public Heateeelmi addHeateeelmi(Heateeelmi heateeelmi) {
		getHeateeelmis().add(heateeelmi);
		heateeelmi.setReshtehBean(this);

		return heateeelmi;
	}

	public Heateeelmi removeHeateeelmi(Heateeelmi heateeelmi) {
		getHeateeelmis().remove(heateeelmi);
		heateeelmi.setReshtehBean(null);

		return heateeelmi;
	}

	public Daneshkadeh getDaneshkadehBean() {
		return this.daneshkadehBean;
	}

	public void setDaneshkadehBean(Daneshkadeh daneshkadehBean) {
		this.daneshkadehBean = daneshkadehBean;
	}

	public Maghtehtahsili getMaghtehtahsili() {
		return this.maghtehtahsili;
	}

	public void setMaghtehtahsili(Maghtehtahsili maghtehtahsili) {
		this.maghtehtahsili = maghtehtahsili;
	}

}