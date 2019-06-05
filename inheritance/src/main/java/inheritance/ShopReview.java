package inheritance;

public class ShopReview extends Review {
    private Shop shop;

    public ShopReview(String body, String author, int numOfStars, Shop shop){
        super(body, author, numOfStars);
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
