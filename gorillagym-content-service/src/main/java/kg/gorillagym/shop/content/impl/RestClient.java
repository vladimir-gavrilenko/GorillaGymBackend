package kg.gorillagym.shop.content.impl;

import static kg.gorillagym.shop.Constants.API_CATEGORIES;
import static kg.gorillagym.shop.Constants.API_PRODUCTS;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.model.Product;

import java.util.List;

/**
 */
public interface RestClient {

    @GET(API_CATEGORIES)
    Call<List<Category>> getCategories();

    @GET(API_PRODUCTS)
    Call<List<Product>> getProductsForCategory(@Query("category") String categoryId);
}
