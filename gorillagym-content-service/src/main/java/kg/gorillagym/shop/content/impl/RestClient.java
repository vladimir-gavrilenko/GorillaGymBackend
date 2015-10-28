package kg.gorillagym.shop.content.impl;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import ru.egalvi.shop.gorillagym.model.Category;
import ru.egalvi.shop.gorillagym.model.Product;

import java.util.List;

/**
 */
public interface RestClient {

    @GET("/api/categories")
    Call<List<Category>> getCategories();

    @GET("/api/products")
    Call<List<Product>> getProductsForCategory(@Query("category") String categoryId);
}
