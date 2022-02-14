package payeh.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the classpayeh database table.
 * 
 */
@Entity
@NamedQuery(name="Classpayeh.findAll", query="SELECT c FROM Classpayeh c")
public class Classpayeh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String discription;

	private String name;

	//bi-directional many-to-one association to Reshteh
	@ManyToOne
	@JoinColumn(name="reshteh")
	private Reshteh reshtehBean;

	//bi-directional many-to-one association to Darsclass
	@OneToMany(mappedBy="classpayehBean")
	private List<Darsclass> darsclasses;

	public Classpayeh() {
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

	public Reshteh getReshtehBean() {
		return this.reshtehBean;
	}

	public void setReshtehBean(Reshteh reshtehBean) {
		this.reshtehBean = reshtehBean;
	}

	public List<Darsclass> getDarsclasses() {
		return this.darsclasses;
	}

	public void setDarsclasses(List<Darsclass> darsclasses) {
		this.darsclasses = darsclasses;
	}

	public Darsclass addDarsclass(Darsclass darsclass) {
		getDarsclasses().add(darsclass);
		darsclass.setClasspayehBean(this);

		return darsclass;
	}

	public Darsclass removeDarsclass(Darsclass darsclass) {
		getDarsclasses().remove(darsclass);
		darsclass.setClasspayehBean(null);

		return darsclass;
	}

}