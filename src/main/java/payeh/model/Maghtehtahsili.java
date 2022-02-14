package payeh.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the maghtehtahsili database table.
 * 
 */
@Entity
@NamedQuery(name="Maghtehtahsili.findAll", query="SELECT m FROM Maghtehtahsili m")
public class Maghtehtahsili implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	private Integer rotbeh;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="maghtehtahsili")
	private List<Member> members;

	//bi-directional many-to-one association to Reshteh
	@OneToMany(mappedBy="maghtehtahsili")
	private List<Reshteh> reshtehs;

	public Maghtehtahsili() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRotbeh() {
		return this.rotbeh;
	}

	public void setRotbeh(Integer rotbeh) {
		this.rotbeh = rotbeh;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Member addMember(Member member) {
		getMembers().add(member);
		member.setMaghtehtahsili(this);

		return member;
	}

	public Member removeMember(Member member) {
		getMembers().remove(member);
		member.setMaghtehtahsili(null);

		return member;
	}

	public List<Reshteh> getReshtehs() {
		return this.reshtehs;
	}

	public void setReshtehs(List<Reshteh> reshtehs) {
		this.reshtehs = reshtehs;
	}

	public Reshteh addReshteh(Reshteh reshteh) {
		getReshtehs().add(reshteh);
		reshteh.setMaghtehtahsili(this);

		return reshteh;
	}

	public Reshteh removeReshteh(Reshteh reshteh) {
		getReshtehs().remove(reshteh);
		reshteh.setMaghtehtahsili(null);

		return reshteh;
	}

}