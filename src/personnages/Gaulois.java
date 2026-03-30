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
        // 1. Si le gaulois n'a pas de village
        if (this.village == null) {
            this.parler("Bonjour, je m'appelle " + this.nom + ". Je voyage de villages en villages."); // [cite: 203]
        }
        // 2. Sinon, si le gaulois est le chef de son village
        else if (this.village.getChef() == this) {
            this.parler("Bonjour, je m'appelle " + this.nom + ". Je suis le chef du village " + this.village.getNom() + "."); // [cite: 198, 199]
        }
        // 3. Sinon, c'est un simple habitant
        else {
            this.parler("Bonjour, je m'appelle " + this.nom + ". J'habite le " + this.village.getNom() + "."); // [cite: 201]
        }
    }

}