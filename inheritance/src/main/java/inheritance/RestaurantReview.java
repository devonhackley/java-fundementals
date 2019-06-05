package inheritance;

public class RestaurantReview extends Review {
    private Restaurant restaurant;

    public RestaurantReview(String body, String author, int numOfStars, Restaurant restaurant){
        super(body, author, numOfStars);
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
