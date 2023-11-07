package pl.gornik.model;

public class Disc extends Product{

    String performer;

    public Disc(String title, int amount, double price) {
        super(title, amount, price);
    }

    public Disc(String title, int amount, double price, String performer) {
        super(title, amount, price);
        this.performer = performer;
    }


    @Override
    public void displayProduct(String title, int amount, double price, String perfomer){
        System.out.println("Product{" +
                "title='" + super.getTitle() + '\'' +
                ", amount=" + super.getAmount() +
                ", price=" + super.getPrice() +
                ", performer=" + performer +
                '}');
    }
}
