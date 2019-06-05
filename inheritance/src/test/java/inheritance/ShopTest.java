package inheritance;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test public void testShopConstructor(){
        Shop shop = new Shop("Cool shop", "This is a cool shop that sells cool things", "$$");

        assertEquals("Cool shop", shop.getName());
        assertEquals("This is a cool shop that sells cool things", shop.getDescription());
        assertEquals("$$", shop.getPrice());
    }

    @Test public void testShopToString(){
        Shop shop = new Shop("Cool shop", "This is a cool shop that sells cool things", "$$");
        assertEquals("Name: Cool shop \n" +
                "Description: This is a cool shop that sells cool things \n" +
                "Price: $$ \n", shop.toString());
    }
    @Test public void testShopAddReview(){
        Shop shop = new Shop("Cool shop", "This is a cool shop that sells cool things", "$$");
        ShopReview review = new ShopReview("this shop is cool", "Dave", 4, shop);
        shop.addReview(review);

        List<Review> expected = new LinkedList<>();
        expected.add(review);

        assertEquals(expected, shop.getReviews());
    }
}
