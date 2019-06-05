package inheritance;

public class TheaterReview extends Review {
    private Theater theater;
    private String movie;

    public TheaterReview(String body, String author, int numOfStars, Theater theater){
        super(body, author, numOfStars);
        this.theater = theater;
        this.movie = "";
    }
    public TheaterReview(String body, String author, int numOfStars, Theater theater, String movie){
        super(body, author, numOfStars);
        this.theater = theater;
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString(){
        return String.format(" Author: %s\n Body: %s\n Rating: %d\n Movie: %s\n \n", this.getAuthor(), this.getBody(), this.getNumOfStars(), this.movie);
    }
}
