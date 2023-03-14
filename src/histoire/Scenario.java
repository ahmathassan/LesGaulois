package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		// System.out.println(asterix.getNom());
		asterix.parler("Bonjour a tous");
		Romain romain = new Romain("Minus", 7);
		romain.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(romain);
		
		Romain rom = new Romain("Minus",70); 
		asterix.frapper(rom);
		
		Romain roma = new Romain("Minus",1);
		asterix.frapper(roma);
	}

}
