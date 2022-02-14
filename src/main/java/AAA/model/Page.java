package AAA.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the page database table.
 * 
 */
@Entity
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	private Integer orders;

	private String pageename;

	private String url;

	//bi-directional many-to-one association to Accecslist
	@OneToMany(mappedBy="pageBean")
	private List<Accecslist> accecslists;

	//bi-directional many-to-one association to Pagecate
	@ManyToOne
	@JoinColumn(name="pagecat")
	private Pagecate pagecate;

	//bi-directional many-to-one association to Pagevisit
	@OneToMany(mappedBy="pageBean")
	private List<Pagevisit> pagevisits;

	public Page() {
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

	public Integer getOrders() {
		return this.orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public String getPageename() {
		return this.pageename;
	}

	public void setPageename(String pageename) {
		this.pageename = pageename;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Accecslist> getAccecslists() {
		return this.accecslists;
	}

	public void setAccecslists(List<Accecslist> accecslists) {
		this.accecslists = accecslists;
	}

	public Accecslist addAccecslist(Accecslist accecslist) {
		getAccecslists().add(accecslist);
		accecslist.setPageBean(this);

		return accecslist;
	}

	public Accecslist removeAccecslist(Accecslist accecslist) {
		getAccecslists().remove(accecslist);
		accecslist.setPageBean(null);

		return accecslist;
	}

	public Pagecate getPagecate() {
		return this.pagecate;
	}

	public void setPagecate(Pagecate pagecate) {
		this.pagecate = pagecate;
	}

	public List<Pagevisit> getPagevisits() {
		return this.pagevisits;
	}

	public void setPagevisits(List<Pagevisit> pagevisits) {
		this.pagevisits = pagevisits;
	}

	public Pagevisit addPagevisit(Pagevisit pagevisit) {
		getPagevisits().add(pagevisit);
		pagevisit.setPageBean(this);

		return pagevisit;
	}

	public Pagevisit removePagevisit(Pagevisit pagevisit) {
		getPagevisits().remove(pagevisit);
		pagevisit.setPageBean(null);

		return pagevisit;
	}

}