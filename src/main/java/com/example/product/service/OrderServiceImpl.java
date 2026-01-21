package com.example.product.service;

import org.springframework.stereotype.Service;

import com.example.product.exception.OrderNotFoundException;
import com.example.product.model.Order;
import com.example.product.repository.OrderRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl implements OrderService {
	
	private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Order> createOrder(Order order) {
        order.setStatus("CREATED");
        return repository.save(order);
    }

    @Override
    public Mono<Order> getOrderById(Long id) {
        return repository.findById(id)
                .switchIfEmpty(Mono.error(
                        new OrderNotFoundException("Order not found with id: " + id)
                ));
    }

    @Override
    public Flux<Order> getAllOrders() {
        return repository.findAll();
    }

}
