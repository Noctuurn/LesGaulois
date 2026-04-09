package personnages;

import village_gaulois.Village;
import objets.Equipement;

public class Gaulois {
private String nom;

private int force;
private int nbTrophees;
private Equipement[] trophees = new Equipement[100];
private int effetPotion;
private Village village;

public Gaulois(String nom, int force) {
	this.nom = nom;
	this.force = force;
	this.effetPotion = 1;
}

public String getNom() {
	return nom;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
}


private String prendreParole() {
	return "Le gaulois " + nom + " : ";
}

public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Asterix", 8);
	System.out.println(asterix);
	
}

public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
	Equipement[] trophies = romain.recevoirCoup((force / 2) * effetPotion);
	effetPotion--;
	if (effetPotion < 1) {
		effetPotion = 1;
		
	}
	for (int i = 0; trophies != null && i < trophies.length; i++, nbTrophees++) {
		this.trophees[nbTrophees] = trophies[i];
	}
}

public void boirePotion(int forcePotion) {
	this.effetPotion = forcePotion;
}


public void setVillage(Village village) {
	this.village = village;
}

public void sePresenter() {
	String presentation = "Bonjour, je m'appelle";
        if (this.village == null) {
            this.parler(presentation + this.nom + ". Je voyage de villages en villages.");
        }
        else if (this.village.getChef() == this) {
            this.parler(presentation + this.nom + ". Je suis le chef du village " + this.village.getNom() + ".");
            }
        else {
            this.parler(presentation + this.nom + ". J'habite le " + this.village.getNom() + ".");
        }
    }

}