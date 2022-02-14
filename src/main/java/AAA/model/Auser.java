package AAA.model;

import java.io.Serializable;
import javax.persistence.*;

import payeh.model.Member;

import java.util.List;


/**
 * The persistent class for the auser database table.
 * 
 */
@Entity
@NamedQuery(name="Auser.findAll", query="SELECT a FROM Auser a")
public class Auser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String email;

	private String hpasworld;

	private String mobile;

	private String nikename;

	private String username;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role")
	private Role roleBean;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="auserBean")
	private List<Member> members;

	//bi-directional many-to-one association to Session
	@OneToMany(mappedBy="auserBean")
	private List<Session> sessions;

	public Auser() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHpasworld() {
		return this.hpasworld;
	}

	public void setHpasworld(String hpasworld) {
		this.hpasworld = hpasworld;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNikename() {
		return this.nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRoleBean() {
		return this.roleBean;
	}

	public void setRoleBean(Role roleBean) {
		this.roleBean = roleBean;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Member addMember(Member member) {
		getMembers().add(member);
		member.setAuserBean(this);

		return member;
	}

	public Member removeMember(Member member) {
		getMembers().remove(member);
		member.setAuserBean(null);

		return member;
	}

	public List<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public Session addSession(Session session) {
		getSessions().add(session);
		session.setAuserBean(this);

		return session;
	}

	public Session removeSession(Session session) {
		getSessions().remove(session);
		session.setAuserBean(null);

		return session;
	}

}