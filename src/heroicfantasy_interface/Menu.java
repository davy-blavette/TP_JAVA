package heroicfantasy_interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Menu extends JMenuBar {

	public Menu() {

		// Listener g�n�rique qui affiche l'action du menu utilis�
		ActionListener afficherMenuListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("El�ment de menu [" + event.getActionCommand() + "] utilis�.");
			}
		};

		// Cr�ation du menu Fichier
		JMenu fichierMenu = new JMenu("Fichier");
		JMenuItem item = new JMenuItem("Nouveau", 'N');
		item.addActionListener(afficherMenuListener);
		fichierMenu.add(item);
		item = new JMenuItem("Ouvrir", 'O');
		item.addActionListener(afficherMenuListener);
		fichierMenu.add(item);
		item = new JMenuItem("Sauver", 'S');
		item.addActionListener(afficherMenuListener);
		fichierMenu.insertSeparator(1);
		fichierMenu.add(item);
		item = new JMenuItem("Quitter");
		item.addActionListener(afficherMenuListener);
		fichierMenu.add(item);

		// Cr�ation du menu Editer
		JMenu editerMenu = new JMenu("Editer");
		item = new JMenuItem("Copier");
		item.addActionListener(afficherMenuListener);

		editerMenu.add(item);
		item = new JMenuItem("Couper");
		item.addActionListener(afficherMenuListener);

		editerMenu.add(item);
		item = new JMenuItem("Coller");
		item.addActionListener(afficherMenuListener);

		editerMenu.add(item);

		// Cr�ation du menu Divers
		JMenu diversMenu = new JMenu("Divers");
		JMenu sousMenuDiver1 = new JMenu("Sous menu 1");

		item.addActionListener(afficherMenuListener);
		item = new JMenuItem("Sous menu 1 1");
		sousMenuDiver1.add(item);
		item.addActionListener(afficherMenuListener);
		JMenu sousMenuDivers2 = new JMenu("Sous menu 1 2");
		item = new JMenuItem("Sous menu 1 2 1");
		sousMenuDivers2.add(item);
		sousMenuDiver1.add(sousMenuDivers2);

		diversMenu.add(sousMenuDiver1);
		item = new JCheckBoxMenuItem("Valid�");
		diversMenu.add(item);
		item.addActionListener(afficherMenuListener);
		diversMenu.addSeparator();
		ButtonGroup buttonGroup = new ButtonGroup();
		item = new JRadioButtonMenuItem("Cas 1");
		diversMenu.add(item);
		item.addActionListener(afficherMenuListener);
		buttonGroup.add(item);
		item = new JRadioButtonMenuItem("Cas 2");
		diversMenu.add(item);
		item.addActionListener(afficherMenuListener);
		buttonGroup.add(item);
		diversMenu.addSeparator();
		diversMenu.add(item = new JMenuItem("Autre", new ImageIcon(".\\static\\img\\icon\\epee.png")));
		item.addActionListener(afficherMenuListener);

		// ajout des menus � la barre de menus
		this.add(fichierMenu);
		this.add(editerMenu);
		this.add(diversMenu);
	}
}
