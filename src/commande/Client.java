package commande;

/**
 * Représente un client qui passe une commande.
 * 
 * Un client est défini par son nom et un numéro de carte bancaire fictif,
 * qui servent à identifier le client et simuler le paiement.
 */
public class Client {

    /** Le nom complet du client. */
    private String nom;

    /** Le numéro fictif de la carte bancaire du client. */
    private String numeroCarte;

    /**
     * Crée un nouveau client avec son nom et son numéro de carte.
     * 
     * @param nom Le nom complet du client.
     * @param numeroCarte Le numéro fictif de la carte bancaire.
     */
    public Client(String nom, String numeroCarte) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
    }

    /**
     * Retourne le nom du client.
     * 
     * @return Le nom complet du client.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le numéro de la carte bancaire du client.
     * 
     * @return Le numéro fictif de la carte bancaire.
     */
    public String getNumeroCarte() {
        return numeroCarte;
    }
}
