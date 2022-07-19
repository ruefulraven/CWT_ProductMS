package com.ekart.productms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ekart.productms.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	@Column(columnDefinition = "details", name = "details")
	private String details;
	@Column(columnDefinition = "product_name", name = "productName")
	private String productName;
	@Column(columnDefinition = "description", name = "description")
	private String description;
	@Column(columnDefinition = "category", name = "category")
	private String category;
	@Column(columnDefinition = "brand", name = "brand")
	private String brand;
	@Column(columnDefinition = "price", name = "price")
	private double price;
	@Column(columnDefinition = "image", name = "image")
	private byte[] image;
	
	
	
	public Product(ProductDTO dto) {
		this.details = dto.getDetails();
		this.productName = dto.getProductName();
		this.description = dto.getDescription();
		this.category = dto.getCategory();
		this.brand = dto.getBrand();
		this.price = dto.getPrice();
		this.image = dto.getImage();
	}


}
