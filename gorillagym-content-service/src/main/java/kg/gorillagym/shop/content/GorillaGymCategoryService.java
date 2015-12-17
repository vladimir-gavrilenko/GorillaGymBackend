package kg.gorillagym.shop.content;

import static kg.gorillagym.shop.Constants.URL;
import kg.gorillagym.shop.content.impl.RestClient;
import kg.gorillagym.shop.content.impl.RestClientFactory;
import retrofit.Call;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.model.CategorySortComparator;
import ru.egalvi.shop.gorillagym.service.CategoryService;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 */
public class GorillaGymCategoryService implements CategoryService {

    private RestClient restClient;

    public GorillaGymCategoryService() {
        //TODO move URL to settings
        restClient = RestClientFactory.create(URL);
    }

    // visible for testing
    void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<Category> getAll() {
        Call<List<Category>> categories = restClient.getCategories();
        try {
            List<Category> result = categories.execute().body();
            Collections.sort(result, new CategorySortComparator());
            return result;
        } catch (IOException e) {
            //TODO make own exception and handle it somewhere
            throw new RuntimeException(e);
        }
    }
}
