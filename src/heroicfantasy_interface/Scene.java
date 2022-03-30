package heroicfantasy_interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import heroicfantasy.AnneauDeSauron;
import heroicfantasy.Individu;
import heroicfantasy.Nazgul;

public class Scene extends JFrame {

	// Dimension fenetre
	private int weight = 1300;
	private int height = 800;
	// taille cellule
	private int cellule = 100;
	public static String assetPath = ".\\static\\img\\";
	// Zone de texte
	private int text_w = 200;
	private int text_h = 200;

	// stock les personnages présent dans la scene
	static List<Individu> individus = new ArrayList<Individu>();

	// constructeur
	public Scene(String title, String bg) {

		// Titre fenetre
		super(title);

		// dimension fenetre
		this.setSize(new Dimension(weight, height));

		// icone fenetre
		ImageIcon image = new ImageIcon(assetPath + "icon\\epee.png");
		this.setIconImage(image.getImage());

		// Position fenetre centré, aligné haut
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - getWidth() / 2, 0);

		// Background
		this.setContentPane(new JLabel(new ImageIcon(assetPath + "scenes\\" + bg + ".jpg")));

		// Ajout Menu
		this.setJMenuBar(new Menu());

		// ne pas crop l'image
		this.pack();

		// ne pas redimensioner
		this.setResizable(false);

	}

	public void setGrid() {


		// Zone d'information
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//padding
		scrollPane.setBorder(BorderFactory.createCompoundBorder(
				textArea.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		scrollPane.setBounds(weight - text_w, 0, text_w, text_h);

		this.add(scrollPane);
		// Afficher individu
		afficheIndividu();
		// Ajout des cases bouton
		// ligne
		for (int i = 0; i < weight - text_w; i += cellule) {
			// colonne
			for (int h = 0; h < height; h += cellule) {
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

						for (Individu individu : individus) {

							if (caseX == individu.getX() && caseY == individu.getY()) {

								message = individu.parler() + "! Je suis " + individu.getNom();
							}
						}

						textArea.setText(message);
					}
				});
				// rendre le bouton transparent
				btn.setOpaque(false);
				// enlever la zone de contenu
				btn.setContentAreaFilled(false);
				btn.setBorderPainted(true);
				// ajout bouton et text au frame
				this.add(btn);

			}
		}
	}

	public void addIndividu(Individu i) {

		i.setScene(this);
		individus.add(i);

	}

	private void afficheIndividu() {

		for (Individu i : individus) {

			JLabel individu = new JLabel(new ImageIcon(i.getSkin()));

			if (AnneauDeSauron.porteurAnneauDeSauron == i && AnneauDeSauron.porteurAnneauDeSauron.getVisible() == false) {
				if (individus.stream().filter(o -> o instanceof Nazgul).findFirst().isPresent()) {
					individu = new FadeIn((i.getSkin()));
				}else {
					individu = new FadeIn((i.getSkin()), 0.5f);
				}
				
			}

			individu.setBounds(i.getX() * this.cellule, i.getY() * this.cellule, this.cellule, this.cellule);

			this.add(individu);
		}

	}

}
