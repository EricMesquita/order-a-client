package com.cliente.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.entities.OrderMeal;

public interface OrderMealRepository extends JpaRepository<OrderMeal, Long> {
}
