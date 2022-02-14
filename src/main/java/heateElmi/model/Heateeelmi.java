package heateElmi.model;

import java.io.Serializable;
import javax.persistence.*;

import payeh.model.Reshteh;

import java.util.List;


/**
 * The persistent class for the heateeelmi database table.
 * 
 */
@Entity
@NamedQuery(name="Heateeelmi.findAll", query="SELECT h FROM Heateeelmi h")
public class Heateeelmi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer maxuser;

	private Integer minmaghtah;

	//bi-directional many-to-one association to Reshteh
	@ManyToOne
	@JoinColumn(name="reshteh")
	private Reshteh reshtehBean;

	//bi-directional many-to-one association to Sematheateelmi
	@OneToMany(mappedBy="heateeelmi")
	private List<Sematheateelmi> sematheateelmis;

	public Heateeelmi() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMaxuser() {
		return this.maxuser;
	}

	public void setMaxuser(Integer maxuser) {
		this.maxuser = maxuser;
	}

	public Integer getMinmaghtah() {
		return this.minmaghtah;
	}

	public void setMinmaghtah(Integer minmaghtah) {
		this.minmaghtah = minmaghtah;
	}

	public Reshteh getReshtehBean() {
		return this.reshtehBean;
	}

	public void setReshtehBean(Reshteh reshtehBean) {
		this.reshtehBean = reshtehBean;
	}

	public List<Sematheateelmi> getSematheateelmis() {
		return this.sematheateelmis;
	}

	public void setSematheateelmis(List<Sematheateelmi> sematheateelmis) {
		this.sematheateelmis = sematheateelmis;
	}

	public Sematheateelmi addSematheateelmi(Sematheateelmi sematheateelmi) {
		getSematheateelmis().add(sematheateelmi);
		sematheateelmi.setHeateeelmi(this);

		return sematheateelmi;
	}

	public Sematheateelmi removeSematheateelmi(Sematheateelmi sematheateelmi) {
		getSematheateelmis().remove(sematheateelmi);
		sematheateelmi.setHeateeelmi(null);

		return sematheateelmi;
	}

}