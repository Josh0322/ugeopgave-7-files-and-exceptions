import java.util.ArrayList;

    void main() {

        // Opretter en liste med drinks.
        ArrayList<String> data = new ArrayList<>();

        // Tilføjer tre drinks med navn, beskrivelse og pris.
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");

        // Gennemløber hvert element i listen ét ad gangen.
        for (String s : data) {

            // Opdeler teksten ved hvert komma og gemmes i string-array
            String[] values = s.split(",");

            // Navnene
            String name = values[0].trim();

            // Beskrivelserne
            String description = values[1].trim();

            // Priserne
            String price = values[2].trim();

            System.out.println(name + " - " + description + " (" + price + " kr)");
        }
    }
