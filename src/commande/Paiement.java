package commande;

import java.util.Scanner;

/**
 * Classe utilitaire permettant de simuler un paiement fictif.
 */
public class Paiement {

    /**
     * Simule un paiement par carte bancaire via saisie console.
     */
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

        // Simulation sans vérification réelle
        System.out.println("✅ Paiement accepté !\n");
    }
}
