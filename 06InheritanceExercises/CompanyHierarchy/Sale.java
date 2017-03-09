package CompanyHierarchy;

public class Sale {
    private String productName;
    private String date;
    private Double price;

    public Sale(String productName, String date, Double price) {
        this.setProductName(productName);
        this.setDate(date);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productName='" + productName + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }

    private void setProductName(String productName) {
        if (productName == null || productName.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.productName = productName;
    }

    private void setDate(String date) {
        if (date == null || date.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.date = date;
    }

    private void setPrice(Double price) {
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.price = price;
    }
}
