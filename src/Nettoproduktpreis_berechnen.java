import java.util.Scanner;
public class Nettoproduktpreis_berechnen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie den Bruttopreis des Produkts ein: ");
        double bruttopreis = input.nextDouble();
        double mehrwertsteuersatz = 19.0; // 19 Prozent Mehrwertsteuer
        double steuerbetrag = bruttopreis * mehrwertsteuersatz / (100 + mehrwertsteuersatz);
        double nettopreis = bruttopreis - steuerbetrag;
        System.out.println("Bruttopreis: " + bruttopreis + " €");
        System.out.println("Mehrwertsteuer (" + mehrwertsteuersatz + "%): " + steuerbetrag + " €");
        System.out.println("Nettopreis: " + nettopreis + " €");

        input.close();
    }
}
