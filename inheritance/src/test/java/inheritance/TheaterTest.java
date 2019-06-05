package inheritance;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test public void testTheaterConstructor(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        assertEquals("Regal Cinema", theater.getName());
        assertEquals(movies, theater.getMovies());
    }

    @Test public void testTheaterAddMovies(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);

        theater.addMovie("Avengers: EndGame");
        theater.addMovie("Dectective Pikachu");
        theater.addMovie("John Wick 3");

        assertEquals(3, theater.getMovies().size());
    }
    @Test public void testTheaterAddMoviesDuplicate(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);

        theater.addMovie("Avengers: EndGame");
        theater.addMovie("Dectective Pikachu");
        theater.addMovie("John Wick 3");
        theater.addMovie("John Wick 3");

        assertEquals(3, theater.getMovies().size());

    }

    @Test public void testTheaterRemoveMovies(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);

        theater.addMovie("Avengers: EndGame");
        theater.addMovie("Dectective Pikachu");
        theater.addMovie("John Wick 3");

        assertEquals(3, theater.getMovies().size());

        theater.removeMovie("John Wick 3");
        assertEquals(2, theater.getMovies().size());
    }
    @Test(expected = IllegalStateException.class)
    public void testTheaterRemoveMoviesEmptyList(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        theater.removeMovie("John Wick 3");
    }

    @Test public void testTheaterToString(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        theater.addMovie("Avengers: EndGame");
        theater.addMovie("Dectective Pikachu");
        theater.addMovie("John Wick 3");

        TheaterReview review = new TheaterReview("The theater was great", "Devon", 4, theater, "John Wick 3");

        theater.addReview(review);

        System.out.println(theater.toString());
        assertEquals("Regal Cinema is currently showing: \n" +
                "Avengers: EndGame\n" +
                "Dectective Pikachu\n" +
                "John Wick 3\n" +
                "Theater Reviews: \n" +
                " Author: Devon\n" +
                " Body: The theater was great\n" +
                " Rating: 4\n" +
                " Movie: John Wick 3\n" +
                " \n", theater.toString());
    }

    @Test public void testTheaterAddReview(){
        List<String> movies = new LinkedList<>();
        Theater theater = new Theater("Regal Cinema", movies);
        theater.addMovie("Avengers: EndGame");
        theater.addMovie("Dectective Pikachu");
        theater.addMovie("John Wick 3");

        TheaterReview review = new TheaterReview("The movie theater was gross", "Devon", 1, theater);

        theater.addReview(review);

        List<Review> expected  = new LinkedList<>();
        expected.add(review);
        assertEquals(expected, theater.getReviews());
    }

}
