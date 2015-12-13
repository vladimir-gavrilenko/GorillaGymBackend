package ru.egalvi.shop.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.egalvi.shop.Cart;
import ru.egalvi.shop.CartItem;

public class CartImplTest {

    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new CartImpl();
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertTrue(cart.getOrder().isEmpty());
        CartItem item1 = new TestCartItem("item1");
        cart.add(item1, 1);
        Assert.assertEquals(Integer.valueOf(1), cart.getOrder().get(item1));
        cart.add(item1, 2);
        Assert.assertEquals(Integer.valueOf(3), cart.getOrder().get(item1));
        CartItem item2 = new TestCartItem("item2");
        cart.add(item2, 4);
        Assert.assertEquals(Integer.valueOf(3), cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(4), cart.getOrder().get(item2));
    }

    @Test(expected = RuntimeException.class)
    public void testAddNegative() throws Exception {
        Assert.assertTrue(cart.getOrder().isEmpty());
        CartItem item1 = new TestCartItem("item1");
        cart.add(item1, -1);
    }

    @Test
    public void testRemove() throws Exception {
        Assert.assertTrue(cart.getOrder().isEmpty());
        CartItem item1 = new TestCartItem("item1");
        CartItem item2 = new TestCartItem("item2");
        cart.add(item1, 3);
        cart.add(item2, 4);
        Assert.assertEquals(Integer.valueOf(3), cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(4), cart.getOrder().get(item2));

        cart.remove(item1, 1);
        Assert.assertEquals(Integer.valueOf(2), cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(4), cart.getOrder().get(item2));

        cart.remove(item1, 2);
        cart.remove(item2, 3);
        Assert.assertNull(cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(1), cart.getOrder().get(item2));
    }

    @Test(expected = RuntimeException.class)
    public void testRemoveNegative() throws Exception {
        Assert.assertTrue(cart.getOrder().isEmpty());
        CartItem item1 = new TestCartItem("item1");
        CartItem item2 = new TestCartItem("item2");
        cart.add(item1, 3);
        cart.add(item2, 4);
        Assert.assertEquals(Integer.valueOf(3), cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(4), cart.getOrder().get(item2));

        cart.remove(item1, -1);
    }

    @Test(expected = RuntimeException.class)
    public void testRemoveNegativeResult() throws Exception {
        Assert.assertTrue(cart.getOrder().isEmpty());
        CartItem item1 = new TestCartItem("item1");
        CartItem item2 = new TestCartItem("item2");
        cart.add(item1, 3);
        cart.add(item2, 4);
        Assert.assertEquals(Integer.valueOf(3), cart.getOrder().get(item1));
        Assert.assertEquals(Integer.valueOf(4), cart.getOrder().get(item2));

        cart.remove(item1, 4);
    }

    private class TestCartItem implements CartItem {
        private final String foo;

        public TestCartItem(String foo) {
            this.foo = foo;
        }

        public String getFoo() {
            return foo;
        }

        public String getName() {
            return "foo";
        }

        public double getPrice() {
            return 10.0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TestCartItem that = (TestCartItem) o;

            return !(foo != null ? !foo.equals(that.foo) : that.foo != null);

        }

        @Override
        public int hashCode() {
            return foo != null ? foo.hashCode() : 0;
        }
    }
}