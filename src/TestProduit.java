import java.util.Date;

public class TestProduit {
    public static void main(String[] args) {
        Date D1 = new Date();

        // Création de produits
        Produit p1 = new Produit(1021, "Lait", "Delice", 0.700);
        Produit p2 = new Produit(1021, "Lait", "Delice");
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.200);

        // Affichage des produits
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        // Modification des produits
        p2.setPrix(0.700);
        p2.setDate_exp(D1);
        p2.afficher();

        p3.setPrix(0.450);
        p3.setDate_exp(D1);
        p3.afficher();

        p4.setDate_exp(D1);
        p4.afficher();
        System.out.println(p4.toString());

        // Création des magasins
        Magasin m1 = new Magasin(1, "Rue de la Paix", 50);
        Magasin m2 = new Magasin(2, "Avenue Habib Bourguiba", 30);

        // Ajout des produits dans les magasins
        m1.ajouter(p1);
        m1.ajouter(p2);
        m2.ajouter(p3);
        m2.ajouter(p4);

        // Affichage des magasins
        m1.afficherMagasin();
        m2.afficherMagasin();

        // Gestionnaire de magasins
        GestionnaireMagasin gm = new GestionnaireMagasin();
        gm.ajouterMagasin(m1);
        gm.ajouterMagasin(m2);

        // Affichage du nombre total de produits dans tous les magasins
        int TProd = gm.getNbrTProd();
        System.out.println("Nombre total de produits dans tous les magasins : " + TProd);

        // Comparaison de produits
        boolean comparResult = Produit.comparer(p1, p2);
        System.out.println("Les produits p1 et p2 sont-ils identiques ? " + comparResult);

        // Supprimer un produit
        m1.supprimerProduit(p1);

        // Afficher le magasin avec le plus grand nombre de produits
        Magasin.afficherMagasinPlus(m1, m2);
    }
}
