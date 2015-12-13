package kg.gorillagym.shop.cart;

import ru.egalvi.shop.ClientData;

import java.util.List;

/**
 */
public class Order {
    private final List<OrderItem> cart;
    private final ClientData clientData;

    public Order(List<OrderItem> cart, ClientData clientData) {
        this.cart = cart;
        this.clientData = clientData;
    }

    public List<OrderItem> getCart() {
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
