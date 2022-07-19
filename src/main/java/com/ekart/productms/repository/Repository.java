package com.ekart.productms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekart.productms.entity.Product;


public interface Repository extends JpaRepository<Product, Integer>{

}
