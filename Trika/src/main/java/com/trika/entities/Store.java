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
@Table(name="Store")
public class Store {

	private static final long serialVersionUID = 1L;
	
	@Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", nullable=false)
	private String name;
	
	@Column(name="address", length=100, nullable=false)
	private String address;
	
	@Column(name="city", length=100, nullable=false)
	private String city;
	
	@Column(name="region", length=100, nullable=false)
	private String region;
	
	@Column(name="mobile", length=100)
	private String mobile;
	
	@Column(name="long", length=100)
	private String longit;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLongit() {
		return longit;
	}

	public void setLongit(String longit) {
		this.longit = longit;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public List<Store> getStore() {
		return store;
	}

	public void setStore(List<Store> store) {
		this.store = store;
	}

	@Column(name="late", length=100)
	private String lat;
	
	@OneToMany(targetEntity = Product.class, mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Store> store;
}
