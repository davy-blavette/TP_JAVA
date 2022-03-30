package swing;

import javax.swing.*;
import java.awt.*;

public class Data extends JFrame {

	public static void main(String args[]) {
		JFrame frame = new JFrame("Auberge du Poney");
		final ImageIcon icon = new ImageIcon(".\\static\\img\\auberge\\PathfinderCoS01MainMap.jpg");
		JTextArea text = new JTextArea() {
			Image img = icon.getImage();
			// initialiseur d'instance
			{
				setOpaque(false);
			}

			public void paintComponent(Graphics graphics) {
				graphics.drawImage(img, 0, 0, this);
				super.paintComponent(graphics);
			}
		};
		JScrollPane pane = new JScrollPane(text);
		Container content = frame.getContentPane();
		content.add(pane, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(3);
		frame.setSize(900, 600);
		
		
		
		
		frame.setVisible(true);
	}
}