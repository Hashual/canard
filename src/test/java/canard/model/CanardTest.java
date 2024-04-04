package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.CanardMuet;
import canard.model.cancan.Cancan;
import canard.model.vol.NePasVoler;
import canard.model.vol.PropulsionAReaction;
import canard.model.vol.VolerAvecDesAiles;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler";
	private static final String VOL_REACTEUR = "Je vole avec un réacteur !";
	

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";
	

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;
	Canard prototypeCanard;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
		prototypeCanard = new PrototypeCanard("VRAOUM");
	}
	
	@Test
	public void test_changer_comportement_vol(){
		colvert.changerComportementVol(new NePasVoler());
		assertEquals(NE_PAS_VOLER,colvert.effectuerVol());
		
		colvert.changerComportementVol(new VolerAvecDesAiles());
		assertEquals(VOLER,colvert.effectuerVol());
	}
	
	@Test
	public void test_changer_comportemnt_cancan() {
		colvert.changerComportementCancan(new CanardMuet());
		assertEquals(SILENCE,colvert.effectuerCancan());
		
		colvert.changerComportementCancan(new Cancan());
		assertEquals(CANCAN,colvert.effectuerCancan());
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerVol();
		assertEquals(VOLER, texteVolColvert);

		// on peut inliner les assert
		// car ici le code de test est simple à lire
		assertEquals(VOLER, mandarin.effectuerVol());

		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {

		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());

		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {

		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());

		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
		
		assertEquals("VRAOUM",prototypeCanard.getNom());
		assertEquals("Je suis un prototype de canard",prototypeCanard.afficher());
	}
	
	@Test
	public void test_canard_a_reaction_et_voler() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());
		assertEquals(NAGER, colvert.nager());
		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(VOLER, colvert.effectuerVol());
		
		
		
		assertEquals("VRAOUM",prototypeCanard.getNom());
		assertEquals(NE_PAS_VOLER,prototypeCanard.effectuerVol());
		prototypeCanard.changerComportementVol(new PropulsionAReaction());
		assertEquals(VOL_REACTEUR,prototypeCanard.effectuerVol());

		
	}

}