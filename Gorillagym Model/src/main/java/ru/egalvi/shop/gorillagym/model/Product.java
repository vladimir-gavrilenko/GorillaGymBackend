package ru.egalvi.shop.gorillagym.model;

import ru.egalvi.shop.CartItem;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Currency;

public class Product implements Serializable, CartItem {
    private final String id;
    private final String name;
    private final String description;
    private final byte[] image;
    private final double price;//TODO possible problems for money

    public Product(String id, String name, String description, double price, byte[] image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return !(description != null ? !description.equals(product.description) : product.description != null) && Arrays.equals(image, product.image);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (image != null ? Arrays.hashCode(image) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
