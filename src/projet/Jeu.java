package projet;

import java.util.*;

public class Jeu {
	private Joueur j1,j2;
	private ArrayList<Carte> cartes;
	
	public Jeu(int nbCartes,String nomJ1,String nomJ2) {
		this.j1 = new Joueur(1,nomJ1);
		this.j2 = new Joueur(2,nomJ2);
		
		for(int i=0;i<nbCartes;i++) {
			// TODO
		}
	}
	
	
}
