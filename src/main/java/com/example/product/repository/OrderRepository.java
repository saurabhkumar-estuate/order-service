package com.example.product.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.product.model.Order;

public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {

}
