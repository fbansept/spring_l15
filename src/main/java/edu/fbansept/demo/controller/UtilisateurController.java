package edu.fbansept.demo.controller;

import edu.fbansept.demo.dao.UtilisateurDao;
import edu.fbansept.demo.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable int id) {

        //Optional<Utilisateur> optional = utilisateurDao.findById(id);

//        if(optional.isPresent()) {
//            return optional.get();
//        } else {
//            return null;
//        }

       // return optional.orElse(null);

        return utilisateurDao.findById(id).orElse(null);

    }

    @GetMapping("/utilisateur-par-nom/{nom}")
    public Utilisateur getByNom(@PathVariable String nom) {
        return utilisateurDao.findByNom(nom);
    }

    @GetMapping("/liste-utilisateur")
    public List<Utilisateur> getUtilisateurs() {

        return utilisateurDao.findAll();

    }

    @PostMapping("/utilisateur")
    public String ajoutUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurDao.save(utilisateur);
        return "OK";
    }

    @DeleteMapping("/utilisateur/{id}")
    public boolean supprimeUtilisateur(@PathVariable int id) {
        utilisateurDao.deleteById(id);
        return true;
    }
}
