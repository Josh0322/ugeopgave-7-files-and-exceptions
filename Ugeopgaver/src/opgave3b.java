
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    // fjernet try-catch - bruger throws som sender ansvaret for fejlen videre til kaldestedet.
    public static ArrayList<String> readLines(String path)
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

        // Fejlen håndteres nu i main i stedet for i readLines.
        try {
            // Kalder metoden med stien til filen.
            ArrayList<String> lines = readLines("findes.ikke.csv");

            // Printer alle linjerne fra filen.
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }
    }

