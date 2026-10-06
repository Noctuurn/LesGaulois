package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {

	static void main() {
        System.out.println("\n------------ Tests TP0 ------------\n");
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui, très bonne idée.");

		System.out.println("Dans la forêt " + asterix.toString() + " et " + obelix.getNom()
				+ " tombent nez à nez sur le romain " + minus.getNom());

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

        // Tests TP1
        System.out.println("\n------------ Tests TP1 ------------\n");
		Romain brutus = new Romain("Brutus",14);
		Druide panoramix = new Druide("Panoramix",2);

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(asterix);
		panoramix.booster(obelix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}
}
