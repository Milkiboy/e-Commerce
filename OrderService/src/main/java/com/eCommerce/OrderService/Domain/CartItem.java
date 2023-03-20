package com.eCommerce.OrderService.Domain;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Long productId;
    private double price;
    private int quantity;
}
