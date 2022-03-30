package swing;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Imagebg extends JFrame {

	private static final long serialVersionUID = 1L;

	public Imagebg(String titre) {
		super(titre);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
	}

	private void init() {
		JLabel label = new JLabel(new ImageIcon(".\\static\\img\\scenes\\forge.jpg"));
		this.add(label, BorderLayout.CENTER);
		this.pack();
	}

	public static void main(String[] args) {
		Imagebg app = new Imagebg("Afficher image");
		app.setVisible(true);
	}
}
