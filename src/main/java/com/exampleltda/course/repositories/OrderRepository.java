package com.exampleltda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleltda.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
