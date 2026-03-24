package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(final int NB_VILLAGEOIS_MAX) {
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		for (int i = 0; i < villageois.length; i++){
			if (villageois[i]!= null) {
				villageois[i] = gaulois;
			}
		}
		this.nbVillageois++;
		gaulois.setVillage(this.nom); // erreur aussi
	}
	
	public Gaulois trouverVillageois(int numVillageois) { // erreur
		
	}

	public void afficherVillage() {
		println("AUUUUUGH");
	}

}
