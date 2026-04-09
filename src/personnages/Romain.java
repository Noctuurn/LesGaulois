package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements;
    private int nbEquipement;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        
        this.equipements = new Equipement[2];
        this.nbEquipement = 0;
        
        assert isInvariantVerified() : "La force d'un Romain doit toujours être positive";
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return this.force;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }

    private boolean isInvariantVerified() {
        return this.force >= 0;
    }

    public void sEquiper(Equipement equipement) {
        String leSoldat = "Le soldat ";
        switch (nbEquipement) {
            case 2:
                System.out.println(leSoldat+ nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println(leSoldat+ nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            case 0:
                ajouterEquipement(equipement);
                break;
            default:
                break;
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }

    public Equipement[] recevoirCoup(int forceCoup) {
    	Equipement[] equipementEjecte = null;
    	forceCoup = calculResistanceEquipement(forceCoup);

        if (forceCoup > 0){
            force -= forceCoup;}

    	if (forceCoup<0) { // tant que le romain à de la force, dit Aïe, sinon il abandonne et perd tout son équipement.
            equipementEjecte = ejecterEquipement();
    		parler("J'abandonne...");
        } else{
            parler("Aïe");
    	}

        if (forceCoup==0){
            parler("Alors Asterix on fait moins le malin face à mon équipement, Hi ! Hi !");
        }
    	return equipementEjecte;
    }

    private int calculResistanceEquipement(int forceCoup) {
        /*Calcule la diminution des dégats d'un coup reçu si le romain porte un équipement.*/
        String texte;
    	texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
    	int resistanceEquipement = 0;
    	if (nbEquipement != 0) { // Si le romain est équipé
    		texte += "\nMais heureusement, grace à mon équipement sa force est diminuée de ";

    		for (int i = 0; i < nbEquipement;i++) {
    			if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) ) { // Si il y a au moins un équipement et si l'objet équipé est le shield
                    resistanceEquipement += 6;
    			} else {
    				System.out.println("Equipement casque");
    				resistanceEquipement += 3;
    			}
    		}
    		texte += resistanceEquipement + " !";
    	}
    	
    	parler(texte);
    	forceCoup -= resistanceEquipement;
    	return forceCoup;
    }
    
    private Equipement[] ejecterEquipement() {
    	Equipement[] equipementEjecte = new Equipement[nbEquipement];
    	System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
    	int nbEquipementEjecte = 0;
    	for (int i = 0; i < nbEquipement; i++) {
    		if (equipements[i] != null) {
                equipementEjecte[nbEquipementEjecte] = equipements[i];
    			nbEquipementEjecte++;
    			equipements[i] = null;
    		}
    	}
    	return equipementEjecte;
    }
    
    public static void main(String[] args) {

        Romain minus = new Romain("Minus", 6);
        System.out.println(Equipement.CASQUE);
        System.out.println(Equipement.BOUCLIER);
        
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}