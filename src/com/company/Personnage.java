package com.company;

public class Personnage {
    private String nom;
    private String famille;
    private Attaque skill1;
    private Attaque skill2;
    private Attaque skill3;
    private Element element;

    //Construteur
    public Personnage(String unNom, String uneFamille, Attaque skill1, Attaque skill2, Attaque skill3, Element unElement) {
        this.nom = unNom;
        this.famille = uneFamille;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.element = unElement;
    }

    //Getters
    public String getNom() { return nom; }
    public String getFamille() { return famille; }
    public Attaque getSkill1() { return skill1; }
    public Attaque getSkill2() { return skill2; }
    public Attaque getSkill3() { return skill3; }
    public Element getElement() { return element; }

    //Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setFamille(String famille) { this.famille = famille; }
    public void setSkill1(Attaque skill1) { this.skill1 = skill1; }
    public void setSkill2(Attaque skill2) { this.skill2 = skill2; }
    public void setSkill3(Attaque skill3) { this.skill3 = skill3; }
    public void setElement(Element element) { this.element = element; }
}
