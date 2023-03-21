package com.eCommerce.OrderService.Domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Data
@Document
public class ShoppingCart {

        private List<CartItem> items = new ArrayList<>();

        public void addItem(String productId, double price, int quantity) {
            Optional<CartItem> optionalCartItem = items.stream()
                    .filter(item -> item.getProductId().equals(productId))
                    .findFirst();
            if (optionalCartItem.isPresent()) {
                CartItem cartItem = optionalCartItem.get();
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            } else {
                CartItem cartItem = new CartItem(productId, price, quantity);
                items.add(cartItem);
            }
        }

        public void removeItem(String productId) {
            items.removeIf(item -> item.getProductId().equals(productId));
        }

        public List<CartItem> getItems() {
            return items;
        }

        public void clear() {
            items.clear();
        }

        public double getTotal() {
            double total = 0;
            for (CartItem item : items) {
                total += item.getPrice() * item.getQuantity();
            }
            return total;
        }
    }


