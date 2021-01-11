package com.example.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.os.api.entity.Order;
import com.example.os.api.service.OrderService;

@RestController
@RequestMapping("/order") 
public class OrderController {
	@Autowired
	private OrderService service;

	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	//do a rest call to payment api and pass the order id
	
}
