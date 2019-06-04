package inheritance;

public class Review {
    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    private String body;
    private String author;
    private int numOfStars;
    private  String restaurantName;

    public Review(String body, String author, int numOfStars, String restaurantName){
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
        this.restaurantName = restaurantName;
    }

    public String toString(){
        return String.format(" Author: %s\n Body: %s\n Rating: %d\n \n", this.author, this.body, this.numOfStars);
    }
}
