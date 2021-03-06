package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testReviewConstructor(){
        Review review = new Review("the body of the review.", "Devon", 4);
        assertEquals("the body of the review.", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
    }



    @Test public void testReviewToString(){
        Review review = new Review("the body of the review.", "Devon", 4);
        System.out.println(review.toString());
        String expected = " Author: Devon\n" +
                " Body: the body of the review.\n" +
                " Rating: 4\n" +
                " \n";
        assertEquals(expected, review.toString());
    }

}
