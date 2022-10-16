package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;



public class Scenario {

	
	public static void main(String[] args) {
	
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 100);
		Romain minus = new Romain("Minus", 15);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		
		panoramix.parler("Je vais pr�parer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
	
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce()>0);
		
	}

}

