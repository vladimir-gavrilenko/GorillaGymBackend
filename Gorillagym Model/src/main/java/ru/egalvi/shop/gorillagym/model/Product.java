package ru.egalvi.shop.gorillagym.model;

import ru.egalvi.shop.CartItem;

import java.io.Serializable;

public class Product implements Serializable, CartItem {
    private String id;
    private String name;
    private String added; //TODO can be ignored. Configure mappings some day
    private String text;
    private String image; //it is an image URL
    private double price;//TODO possible problems for money
    private double oldprice;//TODO possible problems for money
    private String bonus;
    private String number;
    private byte[] imageData;

    public Product() {
    }

    public Product(String id, String name, String description, double price, String image) {
        this.id = id;
        this.name = name;
        this.text = description;
        this.image = image;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    public String getAdded() {
        return added;
    }

    public double getOldprice() {
        return oldprice;
    }

    public String getBonus() {
        return bonus;
    }

    public String getNumber() {
        return number;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return !(text != null ? !text.equals(product.text) : product.text != null) && image.equals(product.image);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
