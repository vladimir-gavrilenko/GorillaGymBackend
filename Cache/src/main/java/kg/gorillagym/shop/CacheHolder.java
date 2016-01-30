package kg.gorillagym.shop;

import kg.gorillagym.shop.impl.CacheImpl;

public class CacheHolder {
    public static Cache cache;

    public static void init() {
        cache = cache == null ? new CacheImpl() : cache;
        if (cache.getProducts("") == null) {//TODO string in params
            cache.putProducts("", new CacheImpl.ProductCacheHolder());
        }
    }

    public static Cache getCache() {
        return cache;
    }
}
