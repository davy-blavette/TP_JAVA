package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu2 extends JMenuBar {

  public Menu2() {

    // Listener g�n�rique qui affiche l'action du menu utilis�
    ActionListener afficherMenuListener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("El�ment de menu [" + event.getActionCommand()
            + "] utilis�.");
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
    diversMenu.add(item = new JMenuItem("Autre",
        new ImageIcon("about_32.png")));
    item.addActionListener(afficherMenuListener);

    // ajout des menus � la barre de menus
    add(fichierMenu);
    add(editerMenu);
    add(diversMenu);
  }
/*
  public static void main(String s[]) {
	Imagebg app = new Imagebg("Auberge du Poney");

	
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setJMenuBar(new Menu2());
	app.setMinimumSize(new Dimension(250, 200));
	app.pack();
	app.setVisible(true);
  }
  */
}