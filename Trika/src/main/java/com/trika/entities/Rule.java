package com.trika.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rule")
public class Rule {

	private static final long serialVersionUID = 1L;

	@Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "rule", nullable=false)
	private String rule;
	
	@Column(name="description", length=100)
	private String description;
	
	@Column(name="quantity", length=100)
	private String quantity;
	
	@ManyToOne(targetEntity = Product.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable=false)
    private Product product;
	
	@ManyToOne(targetEntity = Supplier.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", nullable=false)
    private Supplier suplier;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSuplier() {
		return suplier;
	}

	public void setSuplier(Supplier suplier) {
		this.suplier = suplier;
	}
}
