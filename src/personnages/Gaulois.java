package personnages;

import village_gaulois.Village;

public class Gaulois {
private String nom;
private int force;
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

@Override
public String toString() {
	return nom;
}

public void frapper(Romain romain) {
	System.out.println(nom + " Envoie un grand coup dans la mâchoire de " + romain.getNom());
	romain.recevoirCoup(force*effetPotion/3);
	if (effetPotion > 1) {
		this.effetPotion--;
		
	}
}

public void boirePotion(int forcePotion) {
	this.effetPotion = forcePotion;
}


public void setVillage(Village village) {
	this.village = village;
}

public void sePresenter() {
	
}

}