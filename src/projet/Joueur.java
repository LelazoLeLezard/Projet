package projet;

public class Joueur {
	private int id;
	private String nom;
	private int score;
	
	public Joueur(int id,String nom) {
		this.id = id;
		this.nom = nom;
		this.score = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
