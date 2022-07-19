package com.ekart.productms.service;

import java.util.List;

import com.ekart.productms.entity.Product;

public interface ProductService {

	List<Product> getProducts();
	
	Product getProduct(Integer id);
}
