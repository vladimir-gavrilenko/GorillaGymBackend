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
        categories.add(new Category("1", "Foo"));
        categories.add(new Category("2", "Bar"));
        categories.add(new Category("3", "Baz"));
        categories.add(new Category("4", "FooBar"));
    }

    public List<Category> getAll() {
        return categories;
    }
}
