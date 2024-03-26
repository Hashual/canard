package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.vol.VolerAvecDesAiles;

public class Leurre extends Canard {
	
	public Leurre(String nom) {
		super(nom, new VolerAvecDesAiles(),new CanardMuet());	}

	@Override
	public String afficher() {
		return ( this.getNom() + " Je suis un vrai Leurre");
	}

}
