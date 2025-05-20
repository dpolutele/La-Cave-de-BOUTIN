package commande;

import java.util.Scanner;

public class Paiement {

    public static void effectuerPaiement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n💳 Paiement par carte bancaire");

        System.out.print("Numéro de carte (fictif) : ");
        String numero = scanner.nextLine();

        System.out.print("Nom sur la carte : ");
        String nom = scanner.nextLine();

        System.out.print("Date d’expiration (MM/AA) : ");
        String expiration = scanner.nextLine();

        System.out.print("Cryptogramme visuel (CVV) : ");
        String cvv = scanner.nextLine();

        // Fictif, aucune validation réelle
        System.out.println("✅ Paiement accepté !\n");
    }
}
