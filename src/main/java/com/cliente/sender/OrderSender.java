package com.cliente.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cliente.entities.OrderMeal;
import com.google.gson.Gson;

@Component
public class OrderSender {

	@Value("${queue.order.name}")
	private String orderQueue;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send(OrderMeal orderMeal) {
		String order = new Gson().toJson( orderMeal );
		rabbitTemplate.convertAndSend(this.orderQueue,  order);
	}
}