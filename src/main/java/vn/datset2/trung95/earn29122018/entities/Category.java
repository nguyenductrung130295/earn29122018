package vn.datset2.trung95.earn29122018.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_category")
public class Category extends CommonColumn{
	private String name;
	private String description;
	private Set<Product> products;
	
	public Category() {
		super();
	}
	@Override
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	@Override
	@Column
	@Version
	public int getVersion() {
		// TODO Auto-generated method stub
		return super.getVersion();
	}
	@Override
	public void setVersion(int version) {
		// TODO Auto-generated method stub
		super.setVersion(version);
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToMany(mappedBy = "category", cascade =  CascadeType.PERSIST)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
