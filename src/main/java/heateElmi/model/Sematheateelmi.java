package heateElmi.model;

import java.io.Serializable;
import javax.persistence.*;

import payeh.model.Member;


/**
 * The persistent class for the sematheateelmi database table.
 * 
 */
@Entity
@NamedQuery(name="Sematheateelmi.findAll", query="SELECT s FROM Sematheateelmi s")
public class Sematheateelmi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ename;

	private String name;

	private String shrhevazayef;

	//bi-directional many-to-one association to Heateeelmi
	@ManyToOne
	@JoinColumn(name="heateelmi")
	private Heateeelmi heateeelmi;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member")
	private Member memberBean;

	public Sematheateelmi() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShrhevazayef() {
		return this.shrhevazayef;
	}

	public void setShrhevazayef(String shrhevazayef) {
		this.shrhevazayef = shrhevazayef;
	}

	public Heateeelmi getHeateeelmi() {
		return this.heateeelmi;
	}

	public void setHeateeelmi(Heateeelmi heateeelmi) {
		this.heateeelmi = heateeelmi;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

}