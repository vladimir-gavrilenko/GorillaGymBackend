package kg.gorillagym.shop.cart.impl;

import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;

/**
 */
public class RestClientFactory {
    public static RestClient create(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(RestClient.class);
    }
}
