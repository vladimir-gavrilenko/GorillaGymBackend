package kg.gorillagym.shop.cart;

/**
 */
public class OrderItem {
    private final String id;
    private final long count;

    public OrderItem(String id, int count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public long getCount() {
        return count;
    }
}
