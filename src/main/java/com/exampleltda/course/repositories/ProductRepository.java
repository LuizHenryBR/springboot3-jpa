package com.exampleltda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleltda.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
