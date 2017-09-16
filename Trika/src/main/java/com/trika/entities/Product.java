package com.trika.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Product")
public class Product {

	private static final long serialVersionUID = 1L;

	@Id @Column(name="id") @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name", length=100, nullable=false)
	private String name;
	
	@Column(name="type", nullable=false)
	private String type;
	
	@Column(name = "quantity", nullable=false)
	private String quantity;
	
	@Column(name="stock_units", length=100, nullable=true)
	private String stockUnits;
	
	@Column(name="description", columnDefinition="TEXT", nullable=true)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_time", nullable=false)
	private Date startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", nullable=false)
	private Date updateTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "production_date", nullable=false)
	private Date productionDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiration_time", nullable=false)
	private Date expirationTime;
	
	@ManyToOne(targetEntity = Supplier.class, fetch=FetchType.LAZY)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", nullable=false)
    private Supplier supplier;
	
	@ManyToOne(targetEntity = Store.class, fetch=FetchType.LAZY)
    @JoinColumn(name = "store_id", referencedColumnName = "id", nullable=false)
    private Store store;
	
	@OneToMany(targetEntity = Rule.class, mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Rule> rules;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStockUnits() {
		return stockUnits;
	}

	public void setStockUnits(String stockUnits) {
		this.stockUnits = stockUnits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
}
