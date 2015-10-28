package kg.gorillagym.shop.content;

import kg.gorillagym.shop.content.impl.RestClient;
import kg.gorillagym.shop.content.impl.RestClientFactory;
import retrofit.Call;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.service.CategoryService;

import java.io.IOException;
import java.util.List;

/**
 */
public class GorillaGymCategoryService implements CategoryService {

    private final RestClient restClient;

    public GorillaGymCategoryService() {
        //TODO move URL to settings
        restClient = RestClientFactory.create("http://100pudov.kg");
    }

    public List<Category> getAll() {
        Call<List<Category>> categories = restClient.getCategories();
        try {
            return categories.execute().body();
        } catch (IOException e) {
            //TODO make own exception and handle it somewhere
            throw new RuntimeException(e);
        }
    }
}
