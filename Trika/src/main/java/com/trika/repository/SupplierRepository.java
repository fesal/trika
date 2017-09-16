package com.trika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trika.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
