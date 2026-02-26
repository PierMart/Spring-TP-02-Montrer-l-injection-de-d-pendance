package com.example.demo.service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

@Service
public class BavardService {

    private String nom = "Toto";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(">>> @PostConstruct appelé : BavardService est initialisé par Spring !");
    }

    public String parler() {
        return "Je suis " + nom + " et ma classe est " + this.getClass().getSimpleName();
    }
}
