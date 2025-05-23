package commande;

/**
 * Représente un client avec un nom et un numéro de carte bancaire fictif.
 */
public class Client {

    /** Nom du client. */
    private String nom;

    /** Numéro de carte bancaire du client. */
    private String numeroCarte;

    /**
     * Constructeur du client.
     * @param nom Nom du client
     * @param numeroCarte Numéro de carte bancaire
     */
    public Client(String nom, String numeroCarte) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
    }

    /**
     * Retourne le nom du client.
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le numéro de carte du client.
     * @return numéro de carte
     */
    public String getNumeroCarte() {
        return numeroCarte;
    }
}
