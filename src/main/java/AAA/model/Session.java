package AAA.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the session database table.
 * 
 */
@Entity
@NamedQuery(name="Session.findAll", query="SELECT s FROM Session s")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String client;

	private Boolean ismanuallogout;

	@Temporal(TemporalType.DATE)
	private Date logindate;

	@Temporal(TemporalType.DATE)
	private Date logoutdate;

	//bi-directional many-to-one association to Pagevisit
	@OneToMany(mappedBy="sessionBean")
	private List<Pagevisit> pagevisits;

	//bi-directional many-to-one association to Auser
	@ManyToOne
	@JoinColumn(name="auser")
	private Auser auserBean;

	public Session() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Boolean getIsmanuallogout() {
		return this.ismanuallogout;
	}

	public void setIsmanuallogout(Boolean ismanuallogout) {
		this.ismanuallogout = ismanuallogout;
	}

	public Date getLogindate() {
		return this.logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}

	public Date getLogoutdate() {
		return this.logoutdate;
	}

	public void setLogoutdate(Date logoutdate) {
		this.logoutdate = logoutdate;
	}

	public List<Pagevisit> getPagevisits() {
		return this.pagevisits;
	}

	public void setPagevisits(List<Pagevisit> pagevisits) {
		this.pagevisits = pagevisits;
	}

	public Pagevisit addPagevisit(Pagevisit pagevisit) {
		getPagevisits().add(pagevisit);
		pagevisit.setSessionBean(this);

		return pagevisit;
	}

	public Pagevisit removePagevisit(Pagevisit pagevisit) {
		getPagevisits().remove(pagevisit);
		pagevisit.setSessionBean(null);

		return pagevisit;
	}

	public Auser getAuserBean() {
		return this.auserBean;
	}

	public void setAuserBean(Auser auserBean) {
		this.auserBean = auserBean;
	}

}