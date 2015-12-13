package kg.gorillagym.shop.cart;

import kg.gorillagym.shop.cart.impl.RestClient;
import kg.gorillagym.shop.cart.impl.RestClientFactory;
import ru.egalvi.shop.Cart;
import ru.egalvi.shop.CartItem;
import ru.egalvi.shop.CartService;
import ru.egalvi.shop.ClientData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 */
public class GorillaGymCartService implements CartService {
    private final RestClient restClient;

    public GorillaGymCartService() {
        //TODO move URL to settings
        restClient = RestClientFactory.create("http://100pudov.kg");
    }

    public void checkout(Cart cart, ClientData clientData) {
        //TODO implement
        List<OrderItem> orderItems = new ArrayList<OrderItem>(cart.getOrder().size());
        for (Map.Entry<CartItem, Integer> cartItem : cart.getOrder().entrySet()) {
            if (cartItem.getValue() != null) {
                orderItems.add(new OrderItem(cartItem.getKey().getId(), cartItem.getValue()));
            }
        }
        restClient.submitOrder(new Order(orderItems, clientData));
    }
}
