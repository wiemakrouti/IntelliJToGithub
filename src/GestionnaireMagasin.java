import java.util.ArrayList;
import java.util.List;

public class GestionnaireMagasin {
    private List<Magasin> magasin;

    // Constructeur
    public GestionnaireMagasin() {
        this.magasin = new ArrayList<>();
    }

    // Ajouter un magasin
    public void ajouterMagasin(Magasin mg) {
        magasin.add(mg);
    }

    // Retourner le nombre total de produits dans tous les magasins
    public int getNbrTProd() {
        int TProd = 0;
        for (Magasin mg : magasin) {
            TProd += mg.getProduit().size();
        }
        return TProd;
    }
}
