package com.eCommerce.OrderService.Domain;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private String id;
    private String productId;
    private double price;
    private int quantity;

    public CartItem(String productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
}
