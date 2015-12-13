package ru.egalvi.shop;

import java.io.Serializable;

/**
 */
public interface CartItem extends Serializable {
    String getId();

    String getName();

    double getPrice();
}
