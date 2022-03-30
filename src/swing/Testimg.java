package swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class Testimg extends javax.swing.JFrame {
	
	Image img = Toolkit.getDefaultToolkit().getImage(".\\static\\img\\scenes\\forge.jpg");

	public Testimg() {
		this.setContentPane(new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(img, 0, 0, null);
			}
		});
		pack();
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new Testimg();
	}
}