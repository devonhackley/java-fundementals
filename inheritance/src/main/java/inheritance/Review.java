package inheritance;


public class Review {
    private String body;
    private String author;
    private int numOfStars;

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    // Constructor
    public Review(String body, String author, int numOfStars){
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String toString(){
        return String.format(" Author: %s\n Body: %s\n Rating: %d\n \n", this.author, this.body, this.numOfStars);
    }


}
