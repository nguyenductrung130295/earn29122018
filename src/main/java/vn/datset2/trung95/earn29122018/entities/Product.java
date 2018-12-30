package vn.datset2.trung95.earn29122018.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_product")
public class Product extends CommonColumn{
	private String name;
	private float price;
	private String description;
	private byte[] image1;
	private byte[] image2;
	private byte[] image3;
	private byte[] image4;
	private Category category;
	private Set<CartDetail> cartDetail = new HashSet<>();
	
	public Product() {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column
	@Lob
	public byte[] getImage1() {
		return image1;
	}
	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}
	@Column
	@Lob
	public byte[] getImage2() {
		return image2;
	}
	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}
	@Column
	@Lob
	public byte[] getImage3() {
		return image3;
	}
	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}
	@Column
	@Lob
	public byte[] getImage4() {
		return image4;
	}
	public void setImage4(byte[] image4) {
		this.image4 = image4;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@OneToMany(mappedBy = "product",fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	public Set<CartDetail> getCartDetail() {
		return cartDetail;
	}
	public void setCartDetail(Set<CartDetail> cartDetail) {
		this.cartDetail = cartDetail;
	}
		
}
