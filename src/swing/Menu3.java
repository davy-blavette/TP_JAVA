package swing;

import javax.swing.*;
import java.awt.*;

public class Menu3 {

	public static void main(String argv[]) {

		//lancement de la fenetre avec titre
		JFrame f = new JFrame("ma fenetre");
		//Taille de la fenetre
		f.setSize(300, 100);
		
		JButton b = new JButton("Mon bouton");
		f.getContentPane().add(b);

		JMenuBar menuBar = new JMenuBar();
		f.setJMenuBar(menuBar);

		JMenu menu = new JMenu("Fichier");
		menu.add("menuItem");
		menuBar.add(menu);

		f.setVisible(true);
	}
}
