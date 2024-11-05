import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private int identifiant;
    private String adress;
    private int capacite;
    private List<Produit> produit;

    // Constructeur
    public Magasin(int id, String ad, int cap) {
        this.identifiant = id;
        this.adress = ad;
        this.capacite = cap;
        this.produit = new ArrayList<>();
    }

    // Ajouter un produit
    public void ajouter(Produit prd) {
        if (produit.size() < capacite) {
            // Vérifier si le produit existe déjà
            if (chercherProduit(prd) == -1) {
                produit.add(prd);
                System.out.println("Le produit a bien été ajouté.");
            } else {
                System.out.println("Le produit est déjà présent dans le magasin.");
            }
        } else {
            System.out.println("Le magasin est plein.");
        }
    }

    // Chercher un produit dans le magasin
    public int chercherProduit(Produit prd) {
        for (int i = 0; i < produit.size(); i++) {
            if (Produit.comparer(produit.get(i), prd)) {  // Utilisation de la méthode comparer
                return i;
            }
        }
        return -1; // Produit non trouvé
    }

    // Supprimer un produit
    public void supprimerProduit(Produit prd) {
        int index = chercherProduit(prd);
        if (index != -1) {
            produit.remove(index);
            System.out.println("Le produit a bien été supprimé.");
        } else {
            System.out.println("Le produit n'existe pas dans le magasin.");
        }
    }

    // Afficher les informations du magasin et de ses produits
    public void afficherMagasin() {
        System.out.println("Id Magasin : " + identifiant);
        System.out.println("Adresse Magasin : " + adress);
        System.out.println("Capacité maximale du magasin : " + capacite);
        System.out.println("Produits en stock :");
        for (Produit prd : produit) {
            prd.afficher();
        }
    }

    // Retourner la liste des produits
    public List<Produit> getProduit() {
        return new ArrayList<>(produit);
    }

    // Afficher le magasin avec le plus grand nombre de produits
    public static void afficherMagasinPlus(Magasin mg1, Magasin mg2) {
        if (mg1.getProduit().size() > mg2.getProduit().size()) {
            mg1.afficherMagasin();
        } else if (mg2.getProduit().size() > mg1.getProduit().size()) {
            mg2.afficherMagasin();
        } else {
            System.out.println("Les deux magasins ont le même nombre de produits.");
        }
    }
}
