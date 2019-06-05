package inheritance;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TheaterReviewTest {
    @Test public void testTheaterConstructor(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        TheaterReview review = new TheaterReview("The review body", "Devon", 4, theater, "Avengers: Endgame");
        theater.addReview(review);

        assertEquals("The review body", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
        assertEquals(theater, review.getTheater());
        assertEquals("Avengers: Endgame", review.getMovie());
        assertEquals(" Author: Devon\n" +
                " Body: The review body\n" +
                " Rating: 4\n" +
                " Movie: Avengers: Endgame\n" +
                " \n", review.toString());
    }

    @Test public void testTheaterConstructorNoMovie(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        TheaterReview review = new TheaterReview("The review body", "Devon", 4, theater);
        theater.addReview(review);
        System.out.println(review.toString());
        assertEquals("The review body", review.getBody());
        assertEquals("Devon", review.getAuthor());
        assertEquals(4, review.getNumOfStars());
        assertEquals(theater, review.getTheater());
        assertEquals("", review.getMovie());
        assertEquals(" Author: Devon\n" +
                " Body: The review body\n" +
                " Rating: 4\n" +
                " Movie: \n" +
                " \n", review.toString());
    }
}
