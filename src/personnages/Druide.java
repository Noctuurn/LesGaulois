package personnages;

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
	
	public void fabriquerPotion(quantite,forcePotion) {

	}
	
	public void booster() {
		
	}

	public String getNom() {
		return nom;
	}
}
