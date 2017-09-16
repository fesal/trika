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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Deficiency")
public class Deficiency {

	private static final long serialVersionUID = 1L;

	@Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "suplied_date", nullable=false)
	private Date supliedDate;
	
	 @Column(name="quantity", length=100, nullable=false)
	 private String quantity;
	
	@ManyToOne(targetEntity = Product.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable=false)
    private Product product;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSupliedDate() {
		return supliedDate;
	}

	public void setSupliedDate(Date supliedDate) {
		this.supliedDate = supliedDate;
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

}
