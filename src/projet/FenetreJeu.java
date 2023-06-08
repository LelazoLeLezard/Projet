package projet;

import javax.swing.*;

public class FenetreJeu extends JFrame {
	private JLabel j1,j2;
	
	public FenetreJeu() {
		this.setTitle("Memories");
	    this.setSize(500,500);
	    this.setResizable(true);
	    this.setLocationRelativeTo(null);
	    this.setLayout(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	    this.construireFenetre();
	}
	
	public void construireFenetre() {
		this.j1 = new JLabel();
		this.j2 = new JLabel();
	}
}
