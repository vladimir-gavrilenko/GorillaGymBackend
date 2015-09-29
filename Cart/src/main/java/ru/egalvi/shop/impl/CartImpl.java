package ru.egalvi.shop.impl;

import ru.egalvi.shop.Cart;
import ru.egalvi.shop.CartItem;

import java.util.HashMap;
import java.util.Map;

public class CartImpl implements Cart {
    private Map<CartItem, Integer> items = new HashMap<CartItem, Integer>();

    public void add(CartItem item, int quantity) {
        if (quantity < 0) throw new RuntimeException("Quantity should not be negative");
        items.put(item, items.get(item) + quantity);
    }

    public void remove(CartItem item, int quantity) {
        if (quantity < 0) throw new RuntimeException("Quantity should not be negative");
        int value = items.get(item) - quantity;
        if (value < 0) throw new RuntimeException("Total quantity should not be negative");
        if (value == 0) items.remove(item); else items.put(item, value);
    }
}
