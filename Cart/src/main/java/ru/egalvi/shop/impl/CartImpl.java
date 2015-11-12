package ru.egalvi.shop.impl;

import ru.egalvi.shop.Cart;
import ru.egalvi.shop.CartItem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CartImpl implements Cart {
    private Map<CartItem, Integer> items = new HashMap<CartItem, Integer>();

    public void add(CartItem item, int quantity) {
        if (quantity < 0) throw new RuntimeException("Quantity should not be negative");
        Integer integer = items.get(item);
        items.put(item, (integer == null) ? quantity : (integer + quantity));
    }

    public void remove(CartItem item, int quantity) {
        if (quantity < 0) throw new RuntimeException("Quantity should not be negative");
        Integer integer = items.get(item);
        int value = integer == null ? -quantity : (integer - quantity);
        if (value < 0) throw new RuntimeException("Total quantity should not be negative");
        if (value == 0) items.remove(item);
        else items.put(item, value);
    }

    public Map<CartItem, Integer> getOrder() {
        return Collections.unmodifiableMap(items);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem item : items.keySet()){
            totalPrice += item.getPrice() * items.get(item);
        }
        return totalPrice;
    }

    public void clear(){
        items.clear();
    }
}
