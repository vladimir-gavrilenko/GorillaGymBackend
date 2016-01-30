package kg.gorillagym.shop.cart.impl;

import static kg.gorillagym.shop.Constants.API_CAPTURE;
import static kg.gorillagym.shop.Constants.SUBMIT_ORDER;
import kg.gorillagym.shop.cart.Order;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 */
public interface RestClient {
    @POST(SUBMIT_ORDER)
    void submitOrder(Order order);

    @GET(API_CAPTURE)
    Call<byte[]> getCapture(@Query("token") String token);
}
