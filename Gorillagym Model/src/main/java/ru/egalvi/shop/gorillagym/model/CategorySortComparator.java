package ru.egalvi.shop.gorillagym.model;

import java.util.Comparator;

public class CategorySortComparator implements Comparator<Category> {
    public int compare(Category o1, Category o2) {
        return Integer.compare(o1.getSort(), o2.getSort());
    }
}
