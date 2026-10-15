import java.util.ArrayList;

    void main() {

        // Opretter en liste med drinks.
        ArrayList<String> data = new ArrayList<>();

        // Tilføjer drinks med navn, beskrivelse og pris.
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis"); // Ingen pris

        // Variabel da vi bruger double og ikke string.
        double total = 0;

        // Gennemløber alle drinks i listen.
        for (String s : data) {

            // Opdeler teksten ved kommaerne.
            String[] values = s.split(",");

            // Navnene
            String name = values[0].trim();

            // Beskrivelserne
            String description = values[1].trim();

            // konverterer prisen til double. Virker kun med try-catch.
            try {
                double price = Double.parseDouble(values[2].trim());

                // Lægger prisen til den samlede pris.
                total += price;

                // Printer drinkens oplysninger.
                System.out.println(name + " - " + description + " (" + price + " kr)");

            } catch (NumberFormatException e) {
                // Printer problemet, hvis prisen ikke er et tal.
                System.out.println(name + " - kunne ikke læse pris: " + values[2].trim());
            }
        }

        System.out.println("Samlet pris: " + total + " kr");
    }
