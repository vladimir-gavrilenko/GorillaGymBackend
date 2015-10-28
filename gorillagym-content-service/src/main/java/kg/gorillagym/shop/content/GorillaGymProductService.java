package kg.gorillagym.shop.content;

import kg.gorillagym.shop.content.impl.RestClient;
import kg.gorillagym.shop.content.impl.RestClientFactory;
import retrofit.Call;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.model.Product;
import ru.egalvi.shop.gorillagym.service.ProductService;

import java.io.IOException;
import java.util.List;

/**
 */
public class GorillaGymProductService implements ProductService {

    private final RestClient restClient;

    public GorillaGymProductService() {
        //TODO move URL to settings
        restClient = RestClientFactory.create("http://100pudov.kg");
    }

    public List<Product> getForCategory(Category category) {
        Call<List<Product>> products = restClient.getProductsForCategory(category.getId());
        try {
            return products.execute().body();
        } catch (IOException e) {
            //TODO make own exception and handle it somewhere
            throw new RuntimeException(e);
        }
    }
}
