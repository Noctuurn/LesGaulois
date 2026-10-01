package personnages;

public class Gaulois {
	private final String nom;
	private final int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
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

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain){
		String nomRomain = romain.getNom();
		System.out.println(nom + " frappe " + nomRomain + ".");
		int forceCoup = force/3;
		romain.recevoirCoup(forceCoup);
	}

	public void boirePotion(int forcePotion){
		this.effetPotion = forcePotion;
    }

	static void main() {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
	}
}
