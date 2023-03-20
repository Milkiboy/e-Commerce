package com.eCommerce.OrderService.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Order {
    @Id
    private Long id;
    private Long customerId;
    private Date date;
    private double total;
    private List<OrderItem> orderItems = new ArrayList<>();
    @Transient
    private ShoppingCart shoppingCart;

    // Constructors, getters, setters, and other methods
}

