package kg.gorillagym.shop.cart.impl;

import kg.gorillagym.shop.cart.Order;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 */
public interface RestClient {
    @POST("/api/submit_order")
    void submitOrder(Order order);

    @GET("/api/capture")
    Call<byte[]> getCapture(@Query("token") String token);
}
