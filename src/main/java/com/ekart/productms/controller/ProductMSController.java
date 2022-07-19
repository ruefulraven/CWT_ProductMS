package com.ekart.productms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.productms.entity.Product;
import com.ekart.productms.service.ProductService;

@RestController
public class ProductMSController {

	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		System.out.println(service.getProducts());
		PageRequest pageable = PageRequest.of(0, 9);
		return service.getProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable String id){
		System.out.println(service.getProducts());
		return service.getProduct(Integer.parseInt(id));
	}
}
