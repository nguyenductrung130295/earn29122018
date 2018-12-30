package vn.datset2.trung95.earn29122018.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_user")
public class User extends CommonColumn{
	private String email;
	private String password;
	private String name;
	private String phone;
	private String street;
	private String district;
	private String province;
	private String country;
	private byte[] avatar;
	private Cart cart;
	private Roles role;
	public static enum Roles{ROLE_USER,ROLE_ADMIN};
	public User() {
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
	@Column(unique = true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Column
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Column
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Column
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	
	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Column
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}

	
}
