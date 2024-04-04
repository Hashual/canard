package canard.applications;

import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {


	public static void main(String[] args) {
		Colvert colvert = new Colvert("gg");
		System.out.println(colvert.afficher());
		System.out.println(colvert.nager());
		System.out.println(colvert.effectuerCancan());
		System.out.println(colvert.effectuerVol());
		
		PrototypeCanard prototypeCanard = new PrototypeCanard("VRAOUM");
		System.out.println(prototypeCanard.afficher());
		System.out.println(prototypeCanard.effectuerVol());
		prototypeCanard.changerComportementVol(new PropulsionAReaction());
		System.out.println(prototypeCanard.effectuerVol());
		
		

	}

}
