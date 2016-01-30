package kg.gorillagym.shop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CacheHolderTest {

    @Test
    public void testInit() throws Exception {
        Cache cache = CacheHolder.getCache();
        assertNull(cache);
        CacheHolder.init();
        cache = CacheHolder.getCache();
        assertNotNull(cache);
    }
}
