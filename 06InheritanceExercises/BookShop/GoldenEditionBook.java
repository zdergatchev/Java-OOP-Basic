package BookShop;

public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String author, String title, double price){
        super(author, title, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + super.getPrice() * 0.3;
    }
}
