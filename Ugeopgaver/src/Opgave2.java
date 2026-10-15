import java.util.ArrayList;

public class Opgave2 {

    private double price;

    void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Pris må ikke være negativ: " + price);
        }

        this.price = price;
    }

    // Opgave 2b: Lav metode der henter element fra arrayliste med indeks.
    public String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException("Indeks skal være mellem 0 og " + (items.size() - 1));
        }

        return items.get(index);
    }

    void main() {
        Opgave2 drink = new Opgave2();

        // Opgave 2: Test med en gyldig pris
        drink.setPrice(15.0);
        System.out.println("Pris: " + drink.price + " kr");

        // Opgave 2: Test med en ugyldig pris
        try {
            drink.setPrice(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldig pris: " + e.getMessage());
        }

        System.out.println();

        // Opgave 2b: Opret en liste
        ArrayList<String> items = new ArrayList<>();
        items.add("Cola");
        items.add("Vand");
        items.add("Juice");

        // Opgave 2b: Test med et gyldigt indeks
        System.out.println(drink.getItem(items, 1));

        // Opgave 2b: Test med et ugyldigt indeks
        try {
            System.out.println(drink.getItem(items, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldigt indeks: " + e.getMessage());
        }
    }
}