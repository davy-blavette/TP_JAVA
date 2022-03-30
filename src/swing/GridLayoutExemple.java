package swing;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExemple extends JFrame{

 GridLayout grid = new GridLayout(3, 2);
 
 public GridLayoutExemple(){
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(250,250);
     frame.setVisible(true);
     JPanel panel = new JPanel();
     frame.setContentPane(panel);
     panel.setLayout(grid);
     
     panel.add(new JButton("1"));
     panel.add(new JButton("2"));
     panel.add(new JButton("3"));
     panel.add(new JButton("4"));
     panel.add(new JButton("5"));
     panel.add(new JButton("6"));
 }
 public static void main(String[] args) {
  new GridLayoutExemple();
 }
}