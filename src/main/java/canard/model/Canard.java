package canard.model;
import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {
	
	private String nom;
	private ComportementVol comportementVol;
	private ComportementCancan comportementCancan;
	
	
	
	
	public Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		this.nom = nom;
		this.comportementCancan = comportementCancan;
		this.comportementVol = comportementVol;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres";
	}
	
	public abstract String afficher();

	public String effectuerCancan() {
		return this.comportementCancan.cancaner();
	}
	public String effectuerVol() {
		return this.comportementVol.voler();
	}
	public void setComportementVol() {
		//TODO
	}
	public void setComportementCancan() {
		//TODO
	}
	
	
	
}
	