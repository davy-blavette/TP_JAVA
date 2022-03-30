package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Testeur {

	public static void main(String[] args) {

		

		int weight = 1300;
		int height = 800;
		int text = 200;
		int cellule = 100;
		// créer un frame
		JFrame app = new JFrame("Forge du Poney");
		//Bacground
		app.setContentPane(new JLabel(new ImageIcon(".\\static\\img\\scenes\\forge.jpg")));
	/*
		//Aragorn
		JLabel aragorn = new JLabel(new ImageIcon(".\\static\\img\\heros\\aragorn.png"));
		aragorn.setBounds(0, 0, cellule, cellule);
		app.add(aragorn);
		
		//Legolas
		JLabel legolas = new JLabel(new ImageIcon(".\\static\\img\\heros\\legolas.png"));
		legolas.setBounds(cellule*5, cellule*5, cellule, cellule);
		app.add(legolas);		
	
		//Nazgul
		JLabel nazgul = new JLabel(new ImageIcon(".\\static\\img\\heros\\nazgul.png"));
		nazgul.setBounds(cellule*7, cellule*4, cellule, cellule);
		app.add(nazgul);	
*/		
		// Menu
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setJMenuBar(new Menu2());

		// Zone d'information
		JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);

		scrollPane.setBounds(weight - text, 0, text, 50);
		//scrollPane.setVisible(true);
		app.add(scrollPane);

		//Ajout des cases bouton
		for (int i = 0; i < weight - text; i += cellule) {

			for (int h = 0; h <= height; h += cellule) {
				// créer un bouton
				JButton btn = new JButton();
				// btn.setC
				// definir la taille
				btn.setSize(cellule, cellule);
				// definir border
				btn.setBorder(new LineBorder(Color.BLACK));
				// définir la position du bouton
				btn.setBounds(i, h, cellule, cellule);
				// ajouter event
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						int caseX = btn.getBounds().x / cellule;
						int caseY = btn.getBounds().y / cellule;						
						String message = "Case [" + caseX + "," + caseY + "]";
						
/*
						if(caseX == aragorn.getBounds().x/ cellule && caseY == aragorn.getBounds().y/ cellule) {
							message = "Aragorn";
						}else if(caseX == legolas.getBounds().x/ cellule && caseY == legolas.getBounds().y/ cellule) {							
							message = "Legolas";
						}else if(caseX == nazgul.getBounds().x/ cellule && caseY == nazgul.getBounds().y/ cellule) {							
							message = "Nazgul";
						}
						*/
						textArea.setText(message);

					}
				});
				// rendre le bouton transparent
				btn.setOpaque(false);
				// enlever la zone de contenu
				btn.setContentAreaFilled(false);
				btn.setBorderPainted(true);
				app.add(btn);

			}
		}


		// dimension fenetre
		//app.setSize(new Dimension(weight, height));
		// ne pas redimensioner fenetre
		//app.setResizable(false);
		//adapter fenetre
		app.pack();
		app.setVisible(true);

	}

}
