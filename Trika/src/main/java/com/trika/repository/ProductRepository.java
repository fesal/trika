package com.trika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trika.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
