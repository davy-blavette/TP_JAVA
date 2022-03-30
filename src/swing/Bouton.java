package swing;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.*;

public class Bouton extends JFrame {

	public static void main(String[] args) {

		// evenement du bouton
		ActionListener eventbutton = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Elément de menu [" + event.getActionCommand() + "] utilisé.");
			}
		};
		// créer un frame
		JFrame frame = new JFrame("Exemple JButton");
		// créer un bouton
		JButton btn = new JButton();

		btn.setSize(40, 40);
		btn.setBorder(new LineBorder(Color.BLACK));
		// définir la position du bouton
		btn.setBounds(70, 80, 40, 40);
		btn.addActionListener(eventbutton);
		// rendre le bouton transparent
		btn.setOpaque(false);
		// enlever la zone de contenu
		btn.setContentAreaFilled(false);

		frame.add(btn);
		frame.setSize(250, 250);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}