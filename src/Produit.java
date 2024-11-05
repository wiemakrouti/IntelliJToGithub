import java.util.Date;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date date_exp;

    // Constructeur

    public Produit(int id, String lb, String mr) {
        this.identifiant = id;
        this.libelle = lb;
        this.marque = mr;
    }

    public Produit(int id, String lb, String mr, double pr) {
        this.identifiant = id;
        this.libelle = lb;
        this.marque = mr;
        this.prix = pr;
    }

    // Méthode pour afficher les informations du produit
    public void afficher() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libelle : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
        System.out.println("Date d'expiration : " + date_exp);
    }

    // Méthode pour convertir l'objet en String
    public String toString() {
        return "Produit {Identifiant : " + identifiant + ", Libelle : " + libelle + ", Marque : " + marque + ", Prix : " + prix + "}";
    }

    // Comparaison de produits
    public static boolean comparer(Produit p1, Produit p2) {
        return p1.identifiant == p2.identifiant &&
                p1.libelle.equals(p2.libelle) &&
                p1.prix == p2.prix;
    }

    // Getters et Setters

    public void setPrix(double prx) {
        if (prx >= 0) {
            this.prix = prx;
        } else {
            System.out.println("Le prix ne peut pas être négatif.");
        }
    }

    public void setDate_exp(Date d1) {
        this.date_exp = d1;
    }

}
