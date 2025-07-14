
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a description of class temp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

public class game extends JFrame implements ActionListener {
    JPanel panel1;
    
    String card = "question.png";
    JButton cardbutton;
    
    
    String turtle = "turtle.png";
    JButton turtlebutton;
    String turtleCurrent = turtle;
    String cardButton = card;
    String dog = "dog.png";
    JButton dogbutton;
    
    String flamingo = "flamingo.png";
    JButton flamingobutton;
    
    String butterfly = "butterfly.png";
    JButton butterflybutton;
    
    private JLabel imageLabel;
    private JButton switchButton;
    
    public JFrame game = new JFrame("game window");
    {

        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //600 wide 400 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //set up panel
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
        panel1.setBackground(Color.pink);
        this.add(panel1, BorderLayout.CENTER); 
        
        
        turtlebutton = new JButton();
        turtlebutton.setIcon(new ImageIcon(turtle));
        turtlebutton.setPreferredSize(new Dimension(200, 200));
        turtlebutton.addActionListener(this);
        panel1.add(turtlebutton);
        
        
        dogbutton = new JButton();
        dogbutton.setIcon(new ImageIcon(dog));
        dogbutton.setPreferredSize(new Dimension(200, 200));
        panel1.add(dogbutton);
        //dogbutton.setVisible(false);
        
        flamingobutton = new JButton();
        flamingobutton.setIcon(new ImageIcon(flamingo));
        flamingobutton.setPreferredSize(new Dimension(200, 200));
        panel1.add(flamingobutton);
        
        butterflybutton = new JButton();
        butterflybutton.setIcon(new ImageIcon(butterfly));
        butterflybutton.setPreferredSize(new Dimension(200, 200));
        panel1.add(butterflybutton);
        
        cardbutton = new JButton();
        cardbutton.setIcon(new ImageIcon(card));
        cardbutton.setPreferredSize(new Dimension(200, 200));
        panel1.add(cardbutton);
        
        imageLabel = new JLabel();
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == turtlebutton){
            if(turtleCurrent.equals(card)){
                turtleCurrent = cardButton;
            } else{
                turtleCurrent = turtleCurrent;
            }
            turtlebutton.setIcon(new ImageIcon(card));
        }
    }
}