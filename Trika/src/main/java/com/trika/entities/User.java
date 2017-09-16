package com.trika.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="User")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @Column(name="id") @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 75, nullable=false)
    private String name;
    
    @Column(name = "surname", length = 75, nullable=false)
    private String surname;
    
    @Column(name = "username", length = 45, unique=true, nullable=false)
    private String username;
    
    @Column(name="email", length=75, unique=true, nullable=false)
    private String email;
    
	@Column(name = "password", length = 256, nullable=false)
    private String password;
    
    @Column(name="phone", length=20, nullable=true)
    private String phone;
    
    @Column(name="mob", length=20, nullable=false)
    private String mob;
    
    @Column(name="country", length=45, nullable=false)
    private String country;
    
	@Column(name="state", length=45, nullable=false)
    private String state;
    
    @Column(name="city", length=45, nullable=false)
    private String city;
    
    @Column(name="zip_code", length=45, nullable=false)
    private String zipCode;
    
    @Column(name="street_nr", length=100, nullable=false)
    private String streetNr;
    
    @Enumerated(EnumType.STRING)
    @Column(name="sex", columnDefinition="ENUM('MALE','FEMALE')", nullable=false)
    private Sex sex;
	
    @Column(name = "original_image_name", nullable=true)
    private String originalImageName;
    
    @Column(name = "image_extension", nullable=true)
    private String imageExntension;
    
    @Column(name = "pemurary_image_name", nullable=true)
    private String tempuraryImageName;
    
    @Column(name = "token", length = 255, nullable=true)
    private String token;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_created", nullable=false)
	private Date timeCreated;
    
	@ManyToOne(targetEntity = Role.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable=false)
    private Role role;

	@ManyToOne(targetEntity = Supplier.class)
    @JoinColumn(name = "suplier_id", referencedColumnName = "id", nullable=true)
    private Supplier supplier;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}
	
	 public Supplier getSupplier() {
			return supplier;
	}
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreetNr() {
		return streetNr;
	}

	public void setStreetNr(String streetNr) {
		this.streetNr = streetNr;
	}
	
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getOriginalImageName() {
		return originalImageName;
	}

	public void setOriginalImageName(String originalImageName) {
		this.originalImageName = originalImageName;
	}

	public String getImageExntension() {
		return imageExntension;
	}

	public void setImageExntension(String imageExntension) {
		this.imageExntension = imageExntension;
	}

	public String getTempuraryImageName() {
		return tempuraryImageName;
	}

	public void setTempuraryImageName(String tempuraryImageName) {
		this.tempuraryImageName = tempuraryImageName;
	}

	public Date getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
