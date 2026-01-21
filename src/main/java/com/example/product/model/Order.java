package com.example.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table("orders")
public class Order {
	
	@Id
    private Long id;

    private String productName;
    private int quantity;
    private double price;
    private String status;
	
	

}
