package com.example.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.os.api.entity.Order;
import com.example.os.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public Order saveOrder(Order order) {
		return repository.save(order);

	}

}
