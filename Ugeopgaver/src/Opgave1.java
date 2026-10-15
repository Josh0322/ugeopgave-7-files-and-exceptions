import java.util.Scanner;

    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Fejl! Skriv et heltal");
            return promptNumber(msg);
        }
    }

    void main() {
        promptNumber("Skriv et tal");
    }
