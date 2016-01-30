package kg.gorillagym.shop;

import kg.gorillagym.shop.impl.CacheImpl;
import ru.egalvi.shop.Cart;

public interface Cache {
    void putProducts(String key, CacheImpl.ProductCacheHolder value);

    CacheImpl.ProductCacheHolder getProducts(String key);

    void putCart(String key, Cart value);

    Cart getCart(String key);
}
