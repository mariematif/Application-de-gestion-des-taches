package test;

import dao2.TacheDao;
import entities.Tache;
import entities.Projet;
import entities.CategorieTache;

public class TestMapped {
    public static void main(String[] args) {
        TacheDao dao = new TacheDao();
        Tache tache = dao.findById(1); // ID à adapter

        if (tache != null) {
            Projet projet = tache.getProjet();
            CategorieTache categorie = tache.getCategorie();

            System.out.println("🔎 Vérification Mapping JPA :");
            System.out.println("Titre       : " + tache.getTitre());
            System.out.println("Projet      : " + (projet != null ? projet.getNom() : "null"));
            System.out.println("Catégorie   : " + (categorie != null ? categorie.getNom() : "null"));
        } else {
            System.out.println("❌ Tâche non trouvée !");
        }
    }
}
