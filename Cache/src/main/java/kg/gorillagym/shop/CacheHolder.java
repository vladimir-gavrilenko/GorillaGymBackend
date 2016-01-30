package kg.gorillagym.shop;

import android.content.Context;
import kg.gorillagym.shop.impl.CacheImpl;
import static kg.gorillagym.shop.Constants.CART_CACHE_NAME;
import static kg.gorillagym.shop.Constants.PRODUCTS_CACHE_NAME;

public class CacheHolder {
    public static Cache cache;

    public static void init() {
        cache = cache == null ? new CacheImpl(new Context()) : cache;
        if (cache.getProducts(PRODUCTS_CACHE_NAME) == null) {
            cache.putProducts(PRODUCTS_CACHE_NAME, new CacheImpl.ProductCacheHolder());
        }
    }

    public static Cache getCache() {
        return cache;
    }
}
