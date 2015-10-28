package kg.gorillagym.shop.cart;

import kg.gorillagym.shop.cart.impl.RestClient;
import kg.gorillagym.shop.cart.impl.RestClientFactory;
import ru.egalvi.shop.Cart;
import ru.egalvi.shop.CartService;
import ru.egalvi.shop.ClientData;

/**
 */
public class GorillaGymCart implements CartService {
    private final RestClient restClient;

    public GorillaGymCart() {
        //TODO move URL to settings
        restClient = RestClientFactory.create("http://100pudov.kg");
    }
    public void checkout(Cart cart, ClientData clientData) {
        //TODO implement
        restClient.submitOrder(cart, clientData);
    }
}
