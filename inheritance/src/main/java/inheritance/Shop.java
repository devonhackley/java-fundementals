package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private String price;
    private List<ShopReview> reviews;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public List<ShopReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<ShopReview> reviews) {
        this.reviews = reviews;
    }

    public Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new LinkedList<>();
    }

    public String toString(){
        StringBuilder response = new StringBuilder();
        String str = String.format("Name: %s \nDescription: %s \nPrice: %s \n", this.name, this.description, this.price);
        response.append(str);

        for(ShopReview review : this.reviews){
            response.append(review.toString());
        }

        return response.toString();
    }

    public void addReview(ShopReview review){
        boolean isContained = this.reviews.contains(review);
        if(!isContained){
            this.reviews.add(review);
        }
    }


}
