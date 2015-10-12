package ru.egalvi.shop;

import java.io.Serializable;
import java.util.Map;

/**
 */
public interface Cart extends Serializable {
    void add(CartItem item, int quantity);

    void remove(CartItem item, int quantity);

    Map<CartItem, Integer> getOrder();

    double getTotalPrice();
}
