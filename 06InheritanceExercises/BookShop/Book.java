package BookShop;

public class Book {
    private String author;
    private String title;
    private Double price;

    public Book(String author, String title, double age){
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(age);
    }

    public String getAuthor() {
        return this.author;
    }

    protected void setAuthor(String author){
        // http://stackoverflow.com/questions/6344867/checking-whether-a-string-contains-a-number-value-in-java
        if(author.matches(".*\\d.*")){  // .matches("\\d+") from http://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    protected void setTitle(String title) {
        if(title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public Double getPrice() {
        return this.price;
    }

    protected void setPrice(double price){
        if(price < 1){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
