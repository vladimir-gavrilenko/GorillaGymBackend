package ru.egalvi.shop;

import java.io.Serializable;

/**
 */
public interface Cart extends Serializable {
    void add(CartItem item, int quantity);

    void remove(CartItem item, int quantity);

}