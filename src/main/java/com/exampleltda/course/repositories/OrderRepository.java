package com.exampleltda.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleltda.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
