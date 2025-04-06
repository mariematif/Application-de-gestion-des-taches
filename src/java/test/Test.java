package test;

import dao.ProjetDao;
import dao.CategorieTacheDao;
import dao.TacheDao;
import entities.Projet;
import entities.CategorieTache;
import entities.Tache;

public class Test {

    public static void main(String[] args) {
        ProjetDao projetDao = new ProjetDao();
        CategorieTacheDao categorieDao = new CategorieTacheDao();
        TacheDao tacheDao = new TacheDao();
         
        
        Projet projet = new Projet("Gestion des tâches", "App de suivi de projet");
        projetDao.create(projet);
         
        
        CategorieTache categorie = new CategorieTache("Conception");
        categorieDao.create(categorie);
         
        Tache tache = new Tache("Créer l'entité Tache", "Définir classe + mapping", "To Do", projet, categorie);
        tacheDao.create(tache);

        
        
         Tache t = tacheDao.findById(tache.getId());
        Projet p = projetDao.findById(projet.getId());
        CategorieTache c = categorieDao.findById(categorie.getId());
       
    }
}
