package AAA.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accecslist database table.
 * 
 */
@Entity
@NamedQuery(name="Accecslist.findAll", query="SELECT a FROM Accecslist a")
public class Accecslist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to Page
	@ManyToOne
	@JoinColumn(name="page")
	private Page pageBean;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role")
	private Role roleBean;

	public Accecslist() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Page getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}

	public Role getRoleBean() {
		return this.roleBean;
	}

	public void setRoleBean(Role roleBean) {
		this.roleBean = roleBean;
	}

}