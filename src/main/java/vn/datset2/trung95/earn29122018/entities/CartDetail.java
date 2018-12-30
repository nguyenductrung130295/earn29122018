package vn.datset2.trung95.earn29122018.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_cart_product")
public class CartDetail extends CommonColumn {
	private Cart cart;
	private Product product;
	private int quanlity;
	private float currentPrice;
	
	public CartDetail() {
		super();
	}
	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Column
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	@Column
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id")
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
}
