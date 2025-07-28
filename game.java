
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
import java.util.LinkedList;


public class game extends JFrame implements ActionListener {
    JPanel panel1;
    
  
   // String turtle = "turtle.png";
 //   JButton turtlebutton;
   // String turtleCurrent = turtle;
    int clicked;
    
    private JLabel imageLabel;
    private JButton switchButton;
    cards[] cardlist = new cards[12]; //maing empty card list of 12 cards so i can have them randomly put into this 
     Random rand = new Random(); //random number gen
    
     Boolean card1 = false; // first card clicked
     Boolean card2 = false; // second card clicked false at first cuz it wil be true when 
    
     int card1list; //to put card1 into
     int card2list; //to put card 2 into 
     
     boolean cardVisible;
     
     ArrayList<String> cardsList = new ArrayList<>(Arrays.asList("turtle.png", "dog.png", "flamingo.png", "butterfly.png", "pig.png", "giraffe.png"));
     
     
    ArrayList<String> emptycardList = new ArrayList<>(); //empty array list to put card into wuhne two cards are created
         int found = cardsList.size(); 
    
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
        
        for (int i = 0; i < cardlist.length; i++) { //making for loop for all the cards on the board, 12 of them, using ranodm to randomly place them
            int randomIndex = rand.nextInt(cardsList.size()); 
            cardlist[i] = new cards(cardsList.get(randomIndex));
            cardlist[i].getCard().addActionListener(this);
          //  int randomIndex = rand.nextInt(cardsList.size()); 
           //System.out.println(cardsList.contains("giraffe.png"));
        
           if (emptycardList.contains(cardsList.get(randomIndex))) { //https://www.geeksforgeeks.org/java/java-string-contains-method-example/
                cardsList.remove(randomIndex);  
            } else {
               emptycardList.add(cardsList.get(randomIndex)); }
             panel1.add(cardlist[i].getCard());
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
           // turtlebutton.setIcon(new ImageIcon(card));\\````
            for (int i = 0; i < cardlist.length; i++) { // for loop to go thru all the cards
             if (e.getSource() == cardlist[i].getCard()){ // checks which card was clicked
                if (card1list == -1) { 
                    card1list = i;  
                   // System.out.println(card1list);
                    cardlist[i].cardsFlip();  
                } else if (card1list > -1 && card2list == -1) { 
                    if (card1list == i) {
                        card1list = -1;
                        cardlist[i].cardsFlip();

                    } else if (cardlist[i].cardType() == cardlist[card1list].cardType()) {
                      //  cardlist[i].cardsFlip();
                    System.out.println(card1list);
                       System.out.println(card2list);
                        cardlist[i].getCard().removeActionListener(this);
                        cardlist[card1list].getCard().removeActionListener(this);
                        card1list = -1;  
                        card2list = -1;  
                         } else {
                        cardlist[i].cardsFlip();
                        card2list = i;
                        
                        
                    }
                   } else {
                    cardlist[card1list].cardsFlip();
                    cardlist[card2list].cardsFlip();
                    card1list = -1;
                    card2list = -1;

                        }
                    }
        }
        
     
}
}
