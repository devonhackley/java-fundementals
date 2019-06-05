package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantReviewTest {
    @Test
    public void testRestaurantReviewConstructor(){
        Restaurant restaurant = new Restaurant("Hot Mama's", 4, "$$$");
        RestaurantReview review = new RestaurantReview("the body of the review.", "Devon", 4, restaurant);
        assertEquals("the body of the review.", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
        assertEquals(restaurant, review.getRestaurant());
    }
}
