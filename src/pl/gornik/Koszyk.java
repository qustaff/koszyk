package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Book("Pan Tadeusz", 8, 19.99, "Adam Mickiewicz"));
        products.add(new Book("Magiczne Drzewo", 16, 34.99, "Andrzej Maleszka"));
        products.add(new Book("Kordian", 3, 49.99, "Juliusz Słowacki"));
        products.add(new Book("Król", 8, 19.99, "Szczepan Twardoch"));

        products.add(new Disc("Umowa o Dzieło", 34, 39.99, "Taco Hemingway"));
        products.add(new Disc("Lata Dwudzieste", 12, 54.99, "Dawid Podsiadło"));
        products.add(new Disc("Dziewczyna Pop", 31, 69.99, "Daria Zawiałow"));
        products.add(new Disc("Dotyk", 31, 69.99, "Edyta Górniak"));

        products.add(new Toy("Pistolet Nerf", 27, 15.99, 15));
        products.add(new Toy("Bujany koń", 5, 99.99, 5));
        products.add(new Toy("Pluszowy Miś", 13, 6.99, 3));
        products.add(new Toy("Klocki Lego", 88, 89.99, 8));

        for (Product prod : products) {
           prod.displayProduct();
        }
    }
}