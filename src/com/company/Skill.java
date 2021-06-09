package com.company;

public class Skill {
    private String nom;
    private String type;
    private String effet;

    //Constructeur
    public Skill(String nom, String type, String effet) {
        this.nom = nom;
        this.type = type;
        this.effet = effet;
    }

    //Getters
    public String getNom() { return nom; }
    public String getType() { return type; }
    public String getEffet() { return effet; }

    //Setters
    public void setNom (String nom) { this.nom = nom; }
    public void setType(String type) { this.type = type; }
    public void setEffet(String effet) { this.effet = effet; }
}
