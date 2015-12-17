package kg.gorillagym.shop.cart.impl;

import static kg.gorillagym.shop.Constants.CAPTURE;
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

    @GET(CAPTURE)
    Call<byte[]> getCapture(@Query("token") String token);
}
