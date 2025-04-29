
package app;

import models.Bibliotheque;
import models.Livre;
import models.StatutLivre;

public class Application {

    public static void main(String[] args) {

        // Créer une collection de livres
        Livre[] livres = new Livre[3];
        livres[0] = new Livre("Titre 1", "ISBN1", "Auteur1", StatutLivre.DISPONIBLE);
        livres[1] = new Livre("Titre 2", "ISBN2", "Auteur1", StatutLivre.DISPONIBLE);
        livres[2] = new Livre("Titre 3", "ISBN3", "Auteur4", StatutLivre.DISPONIBLE);

        // Créer notre bibliothèque avec au départ cette collection de livres
        Bibliotheque maBiblio = new Bibliotheque(livres);

        // Ajouter 2x le même ouvrage
        maBiblio.ajouterLivre(new Livre("Titre 4", "ISBN4", "Auteur4", StatutLivre.DISPONIBLE));
        maBiblio.ajouterLivre(new Livre("Titre 4", "ISBN4", "Auteur4", StatutLivre.DISPONIBLE));

        // Ajouter 1x un ouvrage du même auteur
        maBiblio.ajouterLivre(new Livre("Titre 5", "ISBN4", "Auteur4", StatutLivre.DISPONIBLE));

        // Afficher le contenu de la bibliothèque
        maBiblio.afficheTousLesLivres();

        // Chercher le livre
        Livre unLivre = maBiblio.rechercherLivreParTitre("Titre 2");
        if (unLivre != null) {
            System.out.println("Livre trouvé !");
            System.out.println(unLivre);
        }

        // Emprunter le livre
        Livre unAutreLivre = maBiblio.emprunterUnLivre("ISBN3");
        if (unAutreLivre != null) {
            System.out.println("Livre emprunté !");
        }

        // Afficher le contenu de la bibliothèque
        maBiblio.afficheTousLesLivres();

    }

}
