package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testReviewConstructor(){
        Review review = new Review("the body of the review.", "Devon", 4, "Cool Place");
        assertEquals("the body of the review.", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
    }

    @Test public void testReviewToString(){
        Review review = new Review("the body of the review.", "Devon", 4, "Cool place");
        assertEquals("Author: Devon\n  Body: the body of the review.\n Rating: 4", review.toString());
    }

}
