package com.exampleltda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleltda.course.entities.OrderItem;
import com.exampleltda.course.entities.User;
import com.exampleltda.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
