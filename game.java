
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
import javax.swing.Timer; 
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class game extends JFrame implements ActionListener {
    JPanel panel1;
    
  
   // String turtle = "turtle.png";
 //   JButton turtlebutton;
   // String turtleCurrent = turtle;

    
    private JLabel imageLabel;
    private JButton switchButton;
    cards[] cardlist = new cards[12]; //maing empty card list of 12 cards so i can have them randomly put into this 
     Random rand = new Random(); //random number gen
    
    
     ArrayList<String> cardList = new ArrayList<>(Arrays.asList("turtle.png", "dog.png", "flamingo.png", "butterfly.png", "pig.png", "giraffe.png"));
     
    ArrayList<String> emptycardList = new ArrayList<>(); //empty array list to put card into wuhne two cards are created
        
    
    public JFrame game = new JFrame("game window");
    {
        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //1000 wide 1000 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //set up panel
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
        panel1.setBackground(Color.pink);
        this.add(panel1, BorderLayout.CENTER); 
        
        
      //  turtlebutton = new JButton();
       // turtlebutton.setIcon(new ImageIcon(turtle));
       // turtlebutton.setPreferredSize(new Dimension(200, 200));
       // turtlebutton.addActionListener(this);
       // panel1.add(turtlebutton);
        
        for (int i = 0; i < cardlist.length; i++) {
            int randomIndex = rand.nextInt(cardList.size()); 
      
           System.out.println(cardList);
        }
        
        
           
        
        this.pack();
        this.toFront();
    //    this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
     //   if(e.getSource() == turtlebutton){
      //      if(turtleCurrent.equals(card)){
       //         turtleCurrent = cardButton;
         //   } else{
          //      turtleCurrent = turtleCurrent;
           // }
           // turtlebutton.setIcon(new ImageIcon(card));
        }
    }
   

