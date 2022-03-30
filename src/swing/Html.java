package swing;

import java.net.URL;
import javax.swing.*;
import javax.swing.event.*;

public class Html {

  public static void main(String[] args) {
    final JEditorPane editeur;
    JPanel pannel = new JPanel();

    try {
      editeur = new JEditorPane(new URL("http://google.fr"));
      editeur.setEditable(false);
      editeur.addHyperlinkListener(new HyperlinkListener() {
        public void hyperlinkUpdate(HyperlinkEvent e) {
          if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            URL url = e.getURL();
            if (url == null)
              return;
            try {
              editeur.setPage(e.getURL());
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        }
      });

      pannel.add(editeur);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
    JFrame f = new JFrame("ma fenetre");
    f.setSize(500, 300);

    f.getContentPane().add(pannel);
    f.setVisible(true);

  }
}