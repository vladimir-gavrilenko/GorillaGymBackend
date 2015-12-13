package kg.gorillagym.shop.cart;

import com.google.gson.Gson;
import org.junit.Test;
import ru.egalvi.shop.ClientData;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class OrderTest {
    @Test
    public void test() throws Exception {
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        orderItems.add(new OrderItem("1", 5));
        orderItems.add(new OrderItem("2", 3));
        orderItems.add(new OrderItem("4", 6));
        ClientData clientData = new GorillaGymClientData("email", "name", "phone", "address", "token", "capture");
        Order order = new Order(orderItems, clientData);
        Gson gson = new Gson();
        System.out.println(gson.toJson(order));
    }
}