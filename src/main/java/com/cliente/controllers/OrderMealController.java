package com.cliente.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.entities.OrderMeal;
import com.cliente.service.OrderMealService;

@RequestMapping("/order-meal")
@RestController
@AllArgsConstructor
public class OrderMealController {

	private OrderMealService service;

	@PostMapping
	public void save(@RequestBody OrderMeal orderMeal){
		service.save( orderMeal );
	}
}




