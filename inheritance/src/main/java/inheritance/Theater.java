package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Theater {
    private String name;
    private List<String> movies;
    private List<TheaterReview> reviews;

    public List<TheaterReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<TheaterReview> reviews) {
        this.reviews = reviews;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public Theater(String name, List<String> movies){
        this.name = name;
        this.movies = movies;
        this.reviews = new LinkedList<>();
    }

    public void addMovie(String movieName){
        boolean isContained = this.movies.contains(movieName);
        if(!isContained){
            this.movies.add(movieName);
        }
    }

    public void removeMovie(String movieName){
        boolean isContained = this.movies.contains(movieName);
        if(isContained){
            this.movies.remove(movieName);
        } else {
            throw new IllegalStateException("There are no movies to remove");
        }
    }

    public String toString(){
        StringBuilder response = new StringBuilder();
        String str = String.format("%s is currently showing: \n", this.name);

        response.append(str);
        for(String movie : this.movies){
            response.append(movie + "\n");
        }

        response.append("Theater Reviews: \n");
        for(TheaterReview review : this.reviews){
            response.append(review.toString());
        }

        return response.toString();
    }

    public void addReview(TheaterReview review){
        boolean isContained = this.reviews.contains(review);
        if(!isContained){
            this.reviews.add(review);
        }
    }
}
