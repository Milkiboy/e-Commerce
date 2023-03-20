package com.eCommerce.OrderService.Domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
public class ShoppingCart {
    private Map<Long, CartItem> items = new HashMap<>();

    public void addItem(Long productId, double price, int quantity) {
        CartItem cartItem = items.get(productId);
        if (cartItem == null) {
            cartItem = new CartItem(productId, price, quantity);
            items.put(productId, cartItem);
        } else {
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        }
    }

    public void removeItem(Long productId) {
        items.remove(productId);
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items.values());
    }

    public void clear() {
        items.clear();
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items.values()) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}


