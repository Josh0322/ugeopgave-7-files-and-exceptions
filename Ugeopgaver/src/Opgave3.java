import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public ArrayList<String> readLines(String path)
            throws FileNotFoundException {

        ArrayList<String> lines = new ArrayList<>();

        Scanner scan = new Scanner(new File(path));

        // Læser alle linjer fra filen.
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }

        scan.close();

        // Returnerer listen med alle linjerne.
        return lines;
    }

    void main() {

        // Test 1: Filen findes
        try {
            // Kalder metoden med stien til filen.
            ArrayList<String> lines = readLines("Ugeopgaver/src/file.csv");

            // Printer alle linjerne fra filen.
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet.");
        }

        // Test 2: Filen findes ikke
        try {
            ArrayList<String> lines = readLines("findes_ikke.csv");

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet.");
        }
    }

