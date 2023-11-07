package pl.gornik.model;

public class Book extends Product{

    String author;

    public Book(String title, int amount, double price) {
        super(title, amount, price);
    }

    public Book(String title, int amount, double price, String author) {
        super(title, amount, price);
        this.author = author;
    }



    @Override
    public void displayProduct(String title, int amount, double price, String author){
        System.out.println("Product{" +
                "title='" + super.getTitle() + '\'' +
                ", amount=" + super.getAmount() +
                ", price=" + super.getPrice() +
                ", author=" + author +
                '}');
    }

}
