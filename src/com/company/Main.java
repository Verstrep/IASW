package com.company;

public class Main {

    public static void main(String[] args) {
	    //Set test
        Skill skill1 = new Skill("Méga-fracas","Offensif","degat");
        Skill skill2 = new Skill("Super crush","offensif","Stone");
        Skill skill3 = new Skill("Conversion magique","passif","cleans");
        Element dark = new Element("Dark");
        Personnage Veromos = new Personnage("Veromos","Ifrit",skill1,skill2,skill3,dark);

        //Function test
        System.out.println(Veromos.affichage());
    }
}
