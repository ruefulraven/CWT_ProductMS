package com.ekart.productms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.productms.entity.Product;
import com.ekart.productms.repository.Repository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	Repository repository;
	
	@Override
	public List<Product> getProducts() {
		return repository.findAll();
		
	}

	@Override
	public Product getProduct(Integer id) {
		return repository.findById(id).get();
	}

}
