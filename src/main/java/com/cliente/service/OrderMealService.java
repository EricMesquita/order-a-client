package com.cliente.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.cliente.entities.OrderMeal;
import com.cliente.respository.OrderMealRepository;
import com.cliente.sender.OrderSender;

@Service
@AllArgsConstructor
public class OrderMealService {

	private OrderMealRepository repository;

	private OrderSender sender;

	public void save(OrderMeal orderMeal) {
		repository.save( orderMeal );
		sender.send( orderMeal );
	}
}
