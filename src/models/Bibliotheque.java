package models;

public class Bibliotheque {

    private Livre[] livres;

    public Bibliotheque() {
        livres = new Livre[0]; // Au départ la bibliothèque est vide !
    }

    public Bibliotheque(Livre[] livres) {
        this.livres = livres;
    }

    public Livre rechercherLivreParISBN(String isbn) {

        Livre livreTrouve = null;

        // Comme il peut y avoir plusieurs livres du même titre/ISBN, on prendra le 1er
        // qu'on trouve...
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getIsbn().equalsIgnoreCase(isbn)) {
                livreTrouve = livres[i];
                break;
            }
        }

        return livreTrouve;
    }

    public Livre rechercherLivreParTitre(String titre) {

        Livre livreTrouve = null;

        // Comme il peut y avoir plusieurs livres du même titre/ISBN, on prendra le 1er
        // qu'on trouve...
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getTitre().equalsIgnoreCase(titre)) {
                livreTrouve = livres[i];
                break;
            }
        }

        return livreTrouve;
    }

    public Livre[] rechercherLivresParTitre(String titre) {

        Livre[] livresTrouves = null;

        // Comme il peut y avoir plusieurs livres du même titre, on va d'abord les
        // compter !
        int nbreLivres = 0;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getTitre().equalsIgnoreCase(titre)) {
                nbreLivres++;
            }
        }
        livresTrouves = new Livre[nbreLivres];
        int positionProchain = 0;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getTitre().equalsIgnoreCase(titre)) {
                livresTrouves[positionProchain++] = livres[i];
            }
        }

        return livresTrouves;
    }

    public Livre[] rechercherLivresParAuteur(String auteur) {

        Livre[] livresTrouves = null;

        // Comme il peut y avoir plusieurs livres du même auteur, on va d'abord les
        // compter !
        int nbreLivres = 0;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getAuteur().equalsIgnoreCase(auteur)) {
                nbreLivres++;
            }
        }
        livresTrouves = new Livre[nbreLivres];
        int positionProchain = 0;
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getAuteur().equalsIgnoreCase(auteur)) {
                livresTrouves[positionProchain++] = livres[i];
            }
        }

        return livresTrouves;
    }

    public void afficheTousLesLivresDisponibles() {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getStatut() == StatutLivre.DISPONIBLE)
                System.out.println(livres[i]);
        }
    }

    public void afficheTousLesLivresEmpruntes() {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getStatut() == StatutLivre.EMPRUNTE)
                System.out.println(livres[i]);
        }
    }

    public void afficheTousLesLivres() {
        for (int i = 0; i < livres.length; i++) {
            System.out.println(livres[i]);
        }
    }

    public Livre emprunterUnLivre(String isbn) {
        Livre livre = null;

        for (int i = 0; i < livres.length; i++) {
            if (livres[i].getIsbn().equals(isbn) && livres[i].getStatut() == StatutLivre.DISPONIBLE) {
                livre = livres[i];
                livre.setStatut(StatutLivre.EMPRUNTE);
                break;
            }
        }

        return livre;
    }

    public void rendreLivre(Livre livre) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] == livre) {
                livre.setStatut(StatutLivre.DISPONIBLE);
                break;
            }
        }
    }

    public boolean ajouterLivre(Livre livre) {

        boolean reussi = false;

        if (livre != null) {
            Livre[] nouvelleListeDeLivres = new Livre[livres.length + 1];
            for (int i = 0; i < livres.length; i++) {
                nouvelleListeDeLivres[i] = livres[i];
            }
            nouvelleListeDeLivres[nouvelleListeDeLivres.length - 1] = livre;
            livres = nouvelleListeDeLivres;
            reussi = true;
        }

        return reussi;
    }

    public boolean supprimerLivre(Livre livre) {

        boolean reussi = false;

        if (livre != null) {
            int livresSupprimes = 0;
            for (int i = 0; i < livres.length; i++) {
                if (livres[i] == livre) {
                    livres[i] = null;
                    livresSupprimes++;
                }
            }
            if (livresSupprimes > 0) {
                Livre[] nouvelleListeDeLivres = new Livre[livres.length - livresSupprimes];
                int positionProchain = 0;
                for (int i = 0; i < livres.length; i++) {
                    if (livres[i] != null) {
                        nouvelleListeDeLivres[positionProchain++] = livres[i];
                    }
                }
                livres = nouvelleListeDeLivres;
                reussi = true;
            }
        }

        return reussi;
    }

}
