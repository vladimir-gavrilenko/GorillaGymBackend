package ru.egalvi.shop.gorillagym.model;

import java.io.Serializable;

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

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        if (descr != null ? !descr.equals(category.descr) : category.descr != null) return false;
        return !(img != null ? !img.equals(category.img) : category.img != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (descr != null ? descr.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
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
