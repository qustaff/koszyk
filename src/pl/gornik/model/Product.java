package pl.gornik.model;

public abstract class Product {

    String title;
    int amount;
    double price;

    public Product(String title, int amount, double price) {
        this.title = title;
        this.amount = amount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }


    public static String displayProduct(String title, int amount, double price){
        return "Product{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public double countPrice(){
        double result = amount * price;
        return result;
    }


    public abstract void displayProduct(String title, int amount, double price, int minimalAge);

    public abstract void displayProduct(String title, int amount, double price, String perfomer);
}
