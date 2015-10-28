package kg.gorillagym.shop.content;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.service.CategoryService;

import java.util.List;

/**
 */
public class GorillaGymCategoryServiceTest {

    CategoryService categoryService;

    @Before
    public void setUp() throws Exception {
        categoryService = new GorillaGymCategoryService();
    }

    @Test
    @Ignore("This is integration test")
    public void testGetAll() throws Exception {
        List<Category> all = categoryService.getAll();
    }
}