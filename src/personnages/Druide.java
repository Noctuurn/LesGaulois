package personnages;

public class Druide {
    private String nom;
    private int force;
    Chaudron chaudron;

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }

    public void fabriquerPotion(int quantite, int forcePotion){
        chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concocté "+quantite+" doses de potion d'une force de "+forcePotion+".");
    }

    public void booster(Gaulois gaulois){
        String nomGaulois = gaulois.getNom();
        if (chaudron.restePotion()){
            if (nomGaulois.equals("Obélix")){
                parler("Non "+nomGaulois+", non !  Et tu le sais très bien...");
            } else {
                gaulois.boirePotion(chaudron.prendreLouche());
                parler("Tiens "+nomGaulois+", voici un peu de potion.");

            }
        } else {
            parler("Désolé " + nomGaulois + " mais il n'y a plus une seule goutte de potion !");
        }
    }

    public String getNom() {
        return nom;
    }
}
