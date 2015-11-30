package ru.egalvi.shop.gorillagym.model;

import java.io.Serializable;

public class Category implements Serializable {
    private String id;
    private String name;
    private String descr;

    public Category() {
    }

    public Category(String id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return !(id != null ? !id.equals(category.id) : category.id != null) && !(name != null ? !name.equals(category.name) : category.name != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ru.egalvi.shop.gorillagym.model.Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
