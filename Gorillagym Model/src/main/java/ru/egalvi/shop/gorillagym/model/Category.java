package ru.egalvi.shop.gorillagym.model;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    private String id;
    private String name;
    private String descr;
    private int sort;
    private String img;
    private byte[] imageData;

    public Category() {
    }

    public Category(String id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
    }

    public Category(String id, String name, String descr, int sort) {
        this(id, name, descr);
        this.sort = sort;
    }

    public Category(String id, String name, String descr, int sort, String img) {
        this(id, name, descr, sort);
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public int getSort() {
        return sort;
    }

    public String getImg() {
        return img;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return sort == category.sort &&
                Objects.equals(id, category.id) &&
                Objects.equals(name, category.name) &&
                Objects.equals(descr, category.descr) &&
                Objects.equals(img, category.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descr, sort, img);
    }

    @Override
    public String toString() {
        return "ru.egalvi.shop.gorillagym.model.Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
