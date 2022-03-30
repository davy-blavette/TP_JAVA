package heroicfantasy_interface;

import java.awt.AlphaComposite;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class FadeIn extends JLabel implements ActionListener {

	Image imagem;
	Timer timer;
	private float alpha = 0f;

	public FadeIn(String path) {
		imagem = new ImageIcon(path).getImage();
		timer = new Timer(100, this);
		timer.start();
	}

	// here you define alpha 0f to 1f
	public FadeIn(String path, float alpha) {
		imagem = new ImageIcon(path).getImage();
		this.alpha = alpha;

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		/*
		 * fond gradient g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
		 * RenderingHints.VALUE_RENDER_QUALITY); int w = getWidth(), h = getHeight();
		 * Color color1 = Color.RED; Color color2 = Color.YELLOW; GradientPaint gp = new
		 * GradientPaint(0, 0, color1, w, h, color2); g2d.setPaint(gp); g2d.fillRect(0,
		 * 0, w, h);
		 */
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));

		g2d.drawImage(imagem, 0, 0, null);

	}

	public void actionPerformed(ActionEvent e) {
		alpha += 0.05f;
		if (alpha > 1) {
			alpha = 1;
			timer.stop();
		}
		repaint();
	}
}
