package vn.datset2.trung95.earn29122018.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name = "tbl_cart")
public class Cart extends CommonColumn{
	private User user;
	private Set<CartDetail> cartDetail = new HashSet<>();
	private Date orderDate;
	public Cart() {
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
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Column
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@OneToMany(mappedBy = "cart",fetch =  FetchType.EAGER)
	public Set<CartDetail> getCartDetail() {
		return cartDetail;
	}
	public void setCartDetail(Set<CartDetail> cartDetail) {
		this.cartDetail = cartDetail;
	}

	
	
}
