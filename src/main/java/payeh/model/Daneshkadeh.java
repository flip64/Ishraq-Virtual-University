package payeh.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the daneshkadeh database table.
 * 
 */
@Entity
@NamedQuery(name="Daneshkadeh.findAll", query="SELECT d FROM Daneshkadeh d")
public class Daneshkadeh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String discription;

	private String name;

	//bi-directional many-to-one association to Reshteh
	@OneToMany(mappedBy="daneshkadehBean")
	private List<Reshteh> reshtehs;

	public Daneshkadeh() {
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

	public List<Reshteh> getReshtehs() {
		return this.reshtehs;
	}

	public void setReshtehs(List<Reshteh> reshtehs) {
		this.reshtehs = reshtehs;
	}

	public Reshteh addReshteh(Reshteh reshteh) {
		getReshtehs().add(reshteh);
		reshteh.setDaneshkadehBean(this);

		return reshteh;
	}

	public Reshteh removeReshteh(Reshteh reshteh) {
		getReshtehs().remove(reshteh);
		reshteh.setDaneshkadehBean(null);

		return reshteh;
	}

}