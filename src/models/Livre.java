package models;

public class Livre {

    private final String titre;
    private final String isbn;
    private final String auteur;
    private StatutLivre statut;

    public Livre(String titre, String isbn, String auteur, StatutLivre statut) {
        this.titre = titre;
        this.isbn = isbn;
        this.auteur = auteur;
        this.statut = statut;
    }

    public String getTitre() {
        return titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuteur() {
        return auteur;
    }

    public StatutLivre getStatut() {
        return statut;
    }

    public void setStatut(StatutLivre statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {

        String txtDisponible = "";
        
        if (statut == StatutLivre.DISPONIBLE) {
            txtDisponible = "disponible";
        } else if (statut == StatutLivre.EMPRUNTE) {
            txtDisponible = "emprunté";
        }

        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN:" + isbn + ", Statut:" + txtDisponible;
    }

}
