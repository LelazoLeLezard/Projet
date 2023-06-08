package projet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame{
	private JLabel j1,j2;
	private JTextField nomJ1, nomJ2, label;
	private JComboBox taille, type;
	private JButton jouer;
	private JPanel grid, border;
	
	public Fenetre() {
		this.setTitle("Memories");
	    this.setSize(500,500);
	    this.setResizable(true);
	    this.setLocationRelativeTo(null);
	    this.setLayout(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	    this.construireFenetre();
	}

	private void construireFenetre() {
		this.grid = new JPanel();
		this.grid.setLayout(new GridLayout(2,2,10,10));
		
		this.j1 = new JLabel("Joueur 1: ");
		this.j2 = new JLabel("Joueur 2 :");
		this.nomJ1 = new JTextField();
		this.nomJ2 = new JTextField();
		this.jouer = new JButton("Jouer");
		this.jouer.addActionListener(new Ecouteur());
		
		this.grid.add(this.j1);
		this.grid.add(this.nomJ1);
		this.grid.add(this.j2);
		this.grid.add(this.nomJ2);
		
		this.border = new JPanel();
		this.border.setLayout(new BorderLayout(20,20));
		
		this.border.add(this.grid,BorderLayout.CENTER);
		this.border.add(this.jouer,BorderLayout.SOUTH);
		
		this.setContentPane(this.border);
	}
	
	public class Ecouteur implements ActionListener{

		public void actionPerformed(ActionEvent eve) {
			// TODO
		}
		
	}
}
