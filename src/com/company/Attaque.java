package com.company;

public class Attaque {
    private String type;
    private String effet;

    //Constructeur
    public Attaque(String type, String effet) {
        this.type = type;
        this.effet = effet;
    }

    //Getters
    public String getType() { return type; }
    public String getEffet() { return effet; }

    //Setters
    public void setType(String type) { this.type = type; }
    public void setEffet(String effet) { this.effet = effet; }
}
