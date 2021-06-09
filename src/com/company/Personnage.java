package com.company;

public class Personnage {
    private String nom;
    private String famille;
    private Skill skill1;
    private Skill skill2;
    private Skill skill3;
    private Element element;

    //Construteur
    public Personnage(String unNom, String uneFamille, Skill skill1, Skill skill2, Skill skill3, Element unElement) {
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
    public Skill getSkill1() { return skill1; }
    public Skill getSkill2() { return skill2; }
    public Skill getSkill3() { return skill3; }
    public Element getElement() { return element; }

    //Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setFamille(String famille) { this.famille = famille; }
    public void setSkill1(Skill skill1) { this.skill1 = skill1; }
    public void setSkill2(Skill skill2) { this.skill2 = skill2; }
    public void setSkill3(Skill skill3) { this.skill3 = skill3; }
    public void setElement(Element element) { this.element = element; }

    public String affichage (){
        String retour = "nom : "+nom+"\n"+
                        "famille : "+famille+"\n"+
                        "skill 1 : "+skill1.getNom()+"\n"+
                        "skill 2 : "+skill2.getNom()+"\n"+
                        "skill 3 : "+skill3.getNom()+"\n"+
                        "element : "+element.getNom()+"\n";
        return retour;
    }
}
