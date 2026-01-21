package com.example.product.service;

import com.example.product.model.Order;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
	
	Mono<Order> createOrder(Order order);

    Mono<Order> getOrderById(Long id);

    Flux<Order> getAllOrders();

}
