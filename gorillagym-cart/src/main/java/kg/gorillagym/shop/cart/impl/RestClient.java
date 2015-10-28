package kg.gorillagym.shop.cart.impl;

import kg.gorillagym.shop.cart.GorillaGymClientData;
import retrofit.http.POST;
import ru.egalvi.shop.Cart;
import ru.egalvi.shop.ClientData;

/**
 */
public interface RestClient {
    @POST("/api/cart")
    //TODO
    void  submitOrder(Cart cart, ClientData clientData);
}
