package commande;

public class Client {
    private String nom;
    private String numeroCarte;

    public Client(String nom, String numeroCarte) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }
}
