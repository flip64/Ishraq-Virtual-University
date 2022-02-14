package AAA.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pagecate database table.
 * 
 */
@Entity
@NamedQuery(name="Pagecate.findAll", query="SELECT p FROM Pagecate p")
public class Pagecate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String name;

	private Integer orders;

	//bi-directional many-to-one association to Page
	@OneToMany(mappedBy="pagecate")
	private List<Page> pages;

	public Pagecate() {
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

	public List<Page> getPages() {
		return this.pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public Page addPage(Page page) {
		getPages().add(page);
		page.setPagecate(this);

		return page;
	}

	public Page removePage(Page page) {
		getPages().remove(page);
		page.setPagecate(null);

		return page;
	}

}