package pl.gornik.model;

public class Toy extends Product{

    int minimalAge;

    public Toy(String title, int amount, double price) {
        super(title, amount, price);
    }

    public Toy(String title, int amount, double price, int minimalAge) {
        super(title, amount, price);
        this.minimalAge = minimalAge;
    }



    @Override
    public void displayProduct(String title, int amount, double price, int minimalAge){
        System.out.println("Product{" +
                "title='" + super.getTitle() + '\'' +
                ", amount=" + super.getAmount() +
                ", price=" + super.getPrice() +
                ", minimalAge=" + minimalAge +
                '}');
    }
}
