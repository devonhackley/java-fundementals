package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopReviewTest {
    @Test
    public void testShopReviewConstructor(){
        Shop shop = new Shop("Cool shop", "This is a cool shop that sells cool things", "$$");
        ShopReview review = new ShopReview("This was a shop", "Devon", 4, shop);
        assertEquals("This was a shop", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
        assertEquals(shop, review.getShop());
    }
}
