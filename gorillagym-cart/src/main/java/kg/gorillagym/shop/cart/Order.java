package kg.gorillagym.shop.cart;

import ru.egalvi.shop.Cart;
import ru.egalvi.shop.ClientData;

/**
 */
public class Order {
    private final Cart cart;
    private final ClientData clientData;

    public Order(Cart cart, ClientData clientData) {
        this.cart = cart;
        this.clientData = clientData;
    }

    public Cart getCart() {
        return cart;
    }

    public ClientData getClientData() {
        return clientData;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cart=" + cart +
                ", clientData=" + clientData +
                '}';
    }
}
