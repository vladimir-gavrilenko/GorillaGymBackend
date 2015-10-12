package ru.egalvi.shop;

import java.io.Serializable;

/**
 */
public interface CartItem extends Serializable {
    String getName();

    double getPrice();
}
