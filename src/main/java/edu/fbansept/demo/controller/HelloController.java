package edu.fbansept.demo.controller;

import edu.fbansept.demo.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/")
    public String racine () {

        return "<h1>Le serveur marche bien</h1>";
    }

    @GetMapping("/hello")
    public String hello () {
        return "Hello world";
    }
}
