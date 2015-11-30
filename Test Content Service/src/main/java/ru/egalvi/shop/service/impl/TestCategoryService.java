package ru.egalvi.shop.service.impl;

import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class TestCategoryService implements CategoryService {
    private List<Category> categories;

    public TestCategoryService() {
        categories = new ArrayList<Category>();
        categories.add(new Category("1", "Foo", "descr 1"));
        categories.add(new Category("2", "Bar", "descr 1"));
        categories.add(new Category("3", "Baz", "descr 1"));
        categories.add(new Category("4", "FooBar", "descr 1"));
    }

    public List<Category> getAll() {
        return categories;
    }
}
