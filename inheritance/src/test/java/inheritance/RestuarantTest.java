package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestuarantTest {
    @Test public void testRestaurantConstructor(){
        List<Review> reviews = new ArrayList<>();
        Restaurant restaurant = new Restaurant("Hot Mama's", 0, "$$$", reviews);

        List<Review> expected = new ArrayList<>();
        assertEquals("Hot Mama's", restaurant.getName());
        assertEquals(0, restaurant.getRatings());
        assertEquals("$$$", restaurant.getPrice());
        assertEquals(expected, restaurant.getReviews());

    }
    @Test public void testRestaurantToString(){
        Review review = new Review("the body of the review.", "Devon", 4,"Hot Mama's" );
        List<Review> reviews = new ArrayList<>();
        reviews.add(review);
        Restaurant restaurant = new Restaurant("Hot Mama's", review.getNumOfStars(), "$$$", reviews);

        assertEquals("Hot Mama's has a rating of 4 and is in the price category: $$$\n" +
                "Reviews: \n" +
                " Author: Devon\n" +
                " Body: the body of the review.\n" +
                " Rating: 4\n"+ " \n", restaurant.toString());
    }
    @Test public void testRestaurantAddReview(){
        Review review = new Review("the body of the review.", "Devon", 4, "Hot Mama's");
        List<Review> reviews = new ArrayList<>();
        reviews.add(review);
        Restaurant restaurant = new Restaurant("Hot Mama's", 4, "$$$", reviews);

        Review review2 = new Review("this restaurant sucks", "Brady", 1, "Hot Mama's");
        Review review3 = new Review("I loved this restaurant", "Jim", 5, "Hot Mama's");
        Review review4 = new Review("the service was terrible, but the food was amazing", "Kathy", 4, "Hot Mama's");

        restaurant.addReview(review2);
        restaurant.addReview(review3);
        restaurant.addReview(review4);

        List<Review> expected  = new ArrayList<>();
        expected.add(review);
        expected.add(review2);
        expected.add(review3);
        expected.add(review4);
        assertEquals(expected, restaurant.getReviews());
        assertEquals("Hot Mama's has a rating of 3 and is in the price category: $$$\n" +
                "Reviews: \n" +
                " Author: Devon\n" +
                " Body: the body of the review.\n" +
                " Rating: 4\n" +
                " \n" +
                " Author: Brady\n" +
                " Body: this restaurant sucks\n" +
                " Rating: 1\n" +
                " \n" +
                " Author: Jim\n" +
                " Body: I loved this restaurant\n" +
                " Rating: 5\n" +
                " \n" +
                " Author: Kathy\n" +
                " Body: the service was terrible, but the food was amazing\n" +
                " Rating: 4\n"+ " \n" , restaurant.toString());

        // add same review ensures nothing gets updated
        restaurant.addReview(review4);
        assertEquals(expected, restaurant.getReviews());
    }
}
