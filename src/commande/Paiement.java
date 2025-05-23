package commande;

import java.util.Scanner;

/**
 * Simule un paiement par carte bancaire en demandant des infos à l'utilisateur.
 */
public class Paiement {

    /**
     * Demande les infos de carte bancaire et affiche un message de paiement accepté.
     * C'est une simulation, sans vérification réelle.
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

        System.out.println("✅ Paiement accepté !\n");
    }
}
