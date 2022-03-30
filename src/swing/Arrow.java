package swing;

import javax.swing.*;
import java.awt.event.*;

public class Arrow extends JFrame {

   public Arrow() {
     super("titre de l'application");

     WindowListener l = new WindowAdapter() {
       public void windowClosing(WindowEvent e){
         System.exit(0);
       }
     };
     addWindowListener(l);

     ImageIcon imageNormale = new ImageIcon(".\\static\\img\\button\\right-arrow.gif");
     ImageIcon imagePassage =  new ImageIcon(".\\static\\img\\button\\right-arrow.gif");
     ImageIcon imageEnfoncee = new ImageIcon(".\\static\\img\\button\\right-arrow.gif");

     JButton bouton = new JButton("Mon bouton",imageNormale);
     bouton.setPressedIcon(imageEnfoncee);
     bouton.setRolloverIcon(imagePassage);
     bouton.setRolloverEnabled(true);
     getContentPane().add(bouton, "Center");

     JPanel panneau = new JPanel();
     panneau.add(bouton);
     setContentPane(panneau);
     setSize(200,100);
     setVisible(true);
   }

   public static void main(String [] args){
      JFrame frame = new Arrow();
   }
}
