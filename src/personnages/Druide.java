package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public void parler(String texte ) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite,int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté"+ quantite +" doses de potion magique. Elle a une force de "+ forcePotion +".");
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion() == true) {
			if (gaulois.getNom()== "Obélix") {
				
			}
			
		}
	}

	public String getNom() {
		return nom;
	}
}
