package com.eCommerce.OrderService.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderItem {
    @Id
    private Long id;
    private Long productId;
    private double price;
    private int quantity;
    private Order order;

}
