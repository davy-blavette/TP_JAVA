package swing;
import java.awt.AlphaComposite;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import heroicfantasy_interface.Scene;

public class FadeIn extends JPanel implements ActionListener {

    Image imagem;
    Timer timer;
    private float alpha = 0f;

    public FadeIn() {
        imagem = new ImageIcon(Scene.assetPath + "heros\\frodon.png").getImage();
        timer = new Timer(100, this);
        timer.start();
    }
// here you define alpha 0f to 1f
    public FadeIn(float alpha) {
        imagem = new ImageIcon(Scene.assetPath + "heros\\frodon.png").getImage();
       
        this.alpha = alpha;

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                                                    alpha));
        
        g2d.drawImage(imagem, 0, 0, null);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Fade out");
        frame.add(new FadeIn());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 330);
       // frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        alpha += 0.05f;
        if (alpha >1) {
            alpha = 1;
            timer.stop();
        }
        repaint();
    }
}