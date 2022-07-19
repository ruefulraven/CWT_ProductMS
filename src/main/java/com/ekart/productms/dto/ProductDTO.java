package com.ekart.productms.dto;

import com.ekart.productms.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductDTO {

	private String details;
	private String productName;
	private String description;
	private String category;
	private String brand;
	private double price;
	private byte[] image;
	
	public ProductDTO(Product product) {
		this.details = product.getDetails();
		this.productName = product.getProductName();
		this.description = product.getDescription();
		this.category = product.getCategory();
		this.brand = product.getBrand();
		this.price = product.getPrice();
		this.image = product.getImage();
	}
	
}
