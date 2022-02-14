package payeh.model;

import java.io.Serializable;
import javax.persistence.*;

import azmoon.model.Azmonozve;

import java.util.List;


/**
 * The persistent class for the darsakhshodeh database table.
 * 
 */
@Entity
@NamedQuery(name="Darsakhshodeh.findAll", query="SELECT d FROM Darsakhshodeh d")
public class Darsakhshodeh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean finalnomreh;

	private Integer mablaghpardakhti;

	private Integer nomreh;

	private Integer takhfif;

	//bi-directional many-to-one association to Azmonozve
	@OneToMany(mappedBy="darsakhshodeh")
	private List<Azmonozve> azmonozves;

	//bi-directional many-to-one association to Darsclass
	@ManyToOne
	@JoinColumn(name="darse")
	private Darsclass darsclass;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member")
	private Member memberBean;

	public Darsakhshodeh() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getFinalnomreh() {
		return this.finalnomreh;
	}

	public void setFinalnomreh(Boolean finalnomreh) {
		this.finalnomreh = finalnomreh;
	}

	public Integer getMablaghpardakhti() {
		return this.mablaghpardakhti;
	}

	public void setMablaghpardakhti(Integer mablaghpardakhti) {
		this.mablaghpardakhti = mablaghpardakhti;
	}

	public Integer getNomreh() {
		return this.nomreh;
	}

	public void setNomreh(Integer nomreh) {
		this.nomreh = nomreh;
	}

	public Integer getTakhfif() {
		return this.takhfif;
	}

	public void setTakhfif(Integer takhfif) {
		this.takhfif = takhfif;
	}

	public List<Azmonozve> getAzmonozves() {
		return this.azmonozves;
	}

	public void setAzmonozves(List<Azmonozve> azmonozves) {
		this.azmonozves = azmonozves;
	}

	public Azmonozve addAzmonozve(Azmonozve azmonozve) {
		getAzmonozves().add(azmonozve);
		azmonozve.setDarsakhshodeh(this);
       
		return azmonozve;
	}

	public Azmonozve removeAzmonozve(Azmonozve azmonozve) {
		getAzmonozves().remove(azmonozve);
		azmonozve.setDarsakhshodeh(null);

		return azmonozve;
	}

	public Darsclass getDarsclass() {
		return this.darsclass;
	}

	public void setDarsclass(Darsclass darsclass) {
		this.darsclass = darsclass;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

}