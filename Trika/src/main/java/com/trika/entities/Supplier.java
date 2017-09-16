package com.trika.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class Supplier {

	private static final long serialVersionUID = 1L;

	@Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "company_name", nullable=false)
	private String companyName;
	
	@Column(name="contact", length=100, nullable=false)
	private String contact;
	
	@Column(name="address", length=100, nullable=false)
	private String address;
	
	@Column(name="city", length=100, nullable=false)
	private String city;
	
	@Column(name="region", length=100)
	private String region;
	
	@Column(name="mobile_nr", length=100)
	private String mobileNr;
	
	@Column(name="email", length=100)
	private String email;
	
	@OneToMany(targetEntity = Product.class, mappedBy = "supplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Product> products;
	
	@OneToMany(targetEntity = User.class, mappedBy = "supplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Product> supplier;
	
	@OneToMany(targetEntity = Rule.class, mappedBy = "suplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Rule> rules;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMobileNr() {
		return mobileNr;
	}

	public void setMobileNr(String mobileNr) {
		this.mobileNr = mobileNr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getSupplier() {
		return supplier;
	}

	public void setSupplier(List<Product> supplier) {
		this.supplier = supplier;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
}
