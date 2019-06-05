package inheritance;


import java.util.LinkedList;
import java.util.List;

public class Restaurant {
    private String name;
    private int ratings;
    private String price;
    private List<RestaurantReview> reviews;

    public List<RestaurantReview>  getReviews() {
        return reviews;
    }


    public String getName() {
        return name;
    }

    public int getRatings() {
        return ratings;
    }

    public String getPrice() {
        return price;
    }

    public Restaurant(String name, int ratings, String price){
        this.name = name;
        this.ratings = ratings;
        this.price = price;
        this.reviews = new LinkedList<>();
    }

    public String toString(){
        StringBuilder response = new StringBuilder();
        String first = String.format("%s has a rating of %d and is in the price category: %s\nReviews: \n", this.name, this.ratings, this.price);

        response.append(first);
        for(Review review : this.reviews){
            response.append(review.toString());
        }
        return response.toString();
    }

    public void addReview(RestaurantReview review){
        boolean isContained = this.reviews.contains(review);
        if(!isContained){
            this.reviews.add(review);
            updateRating(review);
        }
    }

    public void updateRating(RestaurantReview review){
        for(Review r : this.reviews){
            if(r.getAuthor() != review.getAuthor()){
                this.ratings += r.getNumOfStars();
            }
        }
        this.ratings = this.ratings/this.reviews.size();
    }
}
