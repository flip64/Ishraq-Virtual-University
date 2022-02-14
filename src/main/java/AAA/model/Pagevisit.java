package AAA.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pagevisit database table.
 * 
 */
@Entity
@NamedQuery(name="Pagevisit.findAll", query="SELECT p FROM Pagevisit p")
public class Pagevisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date indate;

	//bi-directional many-to-one association to Page
	@ManyToOne
	@JoinColumn(name="page")
	private Page pageBean;

	//bi-directional many-to-one association to Session
	@ManyToOne
	@JoinColumn(name="session")
	private Session sessionBean;

	public Pagevisit() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getIndate() {
		return this.indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}

	public Page getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}

	public Session getSessionBean() {
		return this.sessionBean;
	}

	public void setSessionBean(Session sessionBean) {
		this.sessionBean = sessionBean;
	}

}