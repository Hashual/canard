package canard.model;

import canard.model.cancan.Coincoin;
import canard.model.vol.VolerAvecDesAiles;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom) {
		super(nom, new VolerAvecDesAiles(),new Coincoin());	}

	@Override
	public String afficher() {
		return ( this.getNom() + " Je suis un cannard en plastique");
	}

}
