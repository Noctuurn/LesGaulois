package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
		this.chef.setVillage(this);
	}

	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductibles",Abraracourcix,30);
		village.trouverVillageois(30);
		Gaulois Asterix = new Gaulois("Asterix",8);
		village.ajouterVillageois(Asterix);

		Gaulois gaulois = village.trouverVillageois(0);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);

		Gaulois Obelix = new Gaulois("Obélix",25);
		village.ajouterVillageois(Obelix);
		village.afficherVillage();

		Gaulois Doublepolemix = new Gaulois("Doublepolémix",4);
		Abraracourcix.sePresenter();
		Asterix.sePresenter();
		Doublepolemix.sePresenter();
	}
	
	public String getNom() {
		return this.nom;
	}
	public Gaulois getChef() {
		return this.chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {

		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		}else {
			System.out.println("Le village est plein, impossible d'ajouter " + gaulois +" !");
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 0 && numVillageois < this.nbVillageois) {
			return this.villageois[numVillageois];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}

	public void afficherVillage() {
		System.out.println("Dans le village \""+this.nom+"\" du chef "+this.chef+" vivent les légendaires gaulois :");
		for (Gaulois gaulois : villageois) {
			if (gaulois != null){
				System.out.println("- "+ gaulois);
			}
		}
	}

}
