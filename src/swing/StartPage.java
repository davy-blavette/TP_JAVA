package swing;
import java.util.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class StartPage extends JFrame {
    
    Container mainPanel;
    
    public StartPage() {
        super("The Dark Worlds Resto");
        mainPanel = new Container();
        mainPanel.setLayout(new GridBagLayout());
        //For editing our grids
        GridBagConstraints c = new GridBagConstraints(); 
        
        //Background Image
        
        ImageIcon background= new ImageIcon(".\\static\\img\\auberge\\PathfinderCoS01MainMap.jpg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(600,400,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(new GridLayout(3,1));
        back.setBounds(0, 0, 600, 400);
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        mainPanel.add(back, c);
       
        //Title Pane content and settings
        JLabel titleContent = new JLabel("Restaurant Name", SwingConstants.CENTER);
        Font fonttitle = new Font("TimesRoman",Font.BOLD,60);
        titleContent.setForeground(Color.RED);
        titleContent.setFont(fonttitle);
        
        //Title Pane settings
        JPanel title = new JPanel();
        
        title.setLayout(new GridLayout(1,1));
        title.setBorder(new EmptyBorder(20,20,20,20));
        title.setLayout(new GridLayout(1,1));
        title.setBorder(new LineBorder(Color.BLACK, 4));
        title.setMinimumSize(new Dimension(600,100));
        title.setMaximumSize(new Dimension(600,100));
        title.setPreferredSize(new Dimension(600,100));
        
        //Title Pane Grid Settings
        c.gridx = 0;
        c.gridy = 0;
        //c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 1;
        c.weighty = 1;
        back.add(title.add(titleContent), c);
        
       //
        JLabel optionsStartContent = new JLabel("Food Portfolio", SwingConstants.CENTER);
        
        Font fontoptionsStart = new Font("TimesRoman",Font.PLAIN,20);
        optionsStartContent.setForeground(Color.RED);
        optionsStartContent.setFont(fontoptionsStart);
        
        JPanel optionsStart = new JPanel();
        optionsStart.setBorder(new EmptyBorder(20,20,20,20));
        optionsStart.setLayout(new GridLayout(1,1));
        optionsStart.setBorder(new LineBorder(Color.WHITE, 4));
        optionsStart.setMinimumSize(new Dimension(600,50));
        optionsStart.setMaximumSize(new Dimension(600,50));
        optionsStart.setPreferredSize(new Dimension(600,50));
        
        c.gridx = 0;
        c.gridy = 0;
        //c.fill = GridBagConstraints.VERTICAL;
        c.weightx = .5;
        c.weighty = .5;
        back.add(optionsStart.add(optionsStartContent), c);
        
        //
        JLabel optionsExitContent = new JLabel("Options", SwingConstants.CENTER);
        
        Font fontoptionsExit = new Font("TimesRoman",Font.PLAIN,20);
        optionsExitContent.setForeground(Color.RED);
        optionsExitContent.setFont(fontoptionsExit);
        
        JPanel optionsExit = new JPanel();
        optionsExit.setBorder(new EmptyBorder(20,20,20,20));
        optionsExit.setLayout(new GridLayout(1,1));
        optionsExit.setBorder(new LineBorder(Color.WHITE, 4));
        optionsExit.setMinimumSize(new Dimension(600,50));
        optionsExit.setMaximumSize(new Dimension(600,50));
        optionsExit.setPreferredSize(new Dimension(600,50));
        
        c.gridx = 0;
        c.gridy = 1;
        //c.fill = GridBagConstraints.VERTICAL;
        c.weightx = .5;
        c.weighty = .5;
        back.add(optionsExit.add(optionsExitContent), c);
        
    }
        
    
}
