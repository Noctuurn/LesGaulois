package personnages;

public class Gaulois {
private String nom;
private int force;
private int effetPotion;

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
	romain.recevoirCoup(force/3);
}

public void boirePotion() {
	
}
}