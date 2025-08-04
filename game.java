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
        JLabel label1;
    int clicked;

    cards[] cardlist = new cards[12]; //maing empty card list of 12 cards so i can have them randomly put into this 
    Random rand = new Random(); //random number gen

    int card1list = -1; //to put card1 into
    int card2list = -1;  //to put card 2 into 

    boolean cardVisible; 
    private Timer timer;
    private int seconds = 0;
    ArrayList<String> cardsList = new ArrayList<>(Arrays.asList("turtle.png", "dog.png", "flamingo.png", "butterfly.png", "pig.png", "giraffe.png"));

    ArrayList<String> emptycardList = new ArrayList<>(); //empty array list to put card into wuhne two cards are created
    int found = cardsList.size();  // an integer for if the user gotten all the pairs

    public JFrame game = new JFrame("");
   
    {
        setTitle("sasha's super sick memory card game");
        this.getContentPane().setPreferredSize(new Dimension(950, 725)); //1000 high 1000 wide
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set up panel
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        panel1.setBackground(Color.pink);
        this.add(panel1, BorderLayout.CENTER); 

       
         //timer goes every 1000 ms
         timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    updateTimer();
                }
            });
        // make 12 cards randomly selected
        for (int i = 0; i < cardlist.length; i++) { 
            int randomIndex = rand.nextInt(cardsList.size());  //the random image selected
            cardlist[i] = new cards(cardsList.get(randomIndex)); //new card with chosen image
            cardlist[i].getCard().addActionListener(this); //adding aciton listener so when player clicks it, can do something
            //if card has already been added once remove from index
            if (emptycardList.contains(cardsList.get(randomIndex))) { //https://www.geeksforgeeks.org/java/java-string-contains-method-example/
                cardsList.remove(randomIndex);  
            } else {
                //else add it to index
                emptycardList.add(cardsList.get(randomIndex)); }
            //add so is visible
            panel1.add(cardlist[i].getCard());
        }
       
       
        
        this.pack();
        this.toFront(); 
    }
   
    //when action performed (when player clicks on card)
    public void actionPerformed(ActionEvent e){
        timer.start();
        for (int i = 0; i < cardlist.length; i++) { // for loop to go thru all the cards
            if (e.getSource() == cardlist[i].getCard()){ // checks which card was clicked (the i is the card clicked)
               //first card clicked
               
                if (card1list == -1) { 
                    card1list = i;  //the index of first card clicked
                    cardlist[i].cardsFlip();  //flip card 
                } else if (card1list > -1 && card2list == -1) { 
                    //first card clicked, now waiting for second
                    if (card1list == i) {
                        //if the user clicks the same card as last ( first card again)
                        card1list = -1;
                        cardlist[i].cardsFlip(); 
                        //reset cards flip back down
                        
                    } else if (cardlist[i].cardType() == cardlist[card1list].cardType()) { //if 2nd card clicked and matches first, pair
                       
                        cardlist[i].cardsFlip(); //flip second  card
                        
                        cardlist[i].getCard().removeActionListener(this);
                        cardlist[card1list].getCard().removeActionListener(this); //disable action listeners cuz 
                        card1list = -1;  
                        card2list = -1;  
                        
                        found -= 1;  
                        //if all pairs have been found (game won)
                        if( found == 0){
                            JDialog won = new JDialog(this);    
                            won.setBounds(200, 300, 500, 200);
                            TextArea youWon = new TextArea("YOU WON!!!!!! \nTime taken= " + seconds + "s"); //dialog box to show won
                            youWon.setFont(new Font("Verdana", Font.BOLD, 50));
                            
                            youWon.setEditable(false);
                            won.add(youWon);    
                            won.setVisible(true);
                            won.setTitle("");
                            timer.stop(); //turn the timer off
                        }
                    } else {
                        //when second card doesnt match first
                        cardlist[i].cardsFlip(); //flip card to front
                        card2list = i; 
                    } 
                } else {
                    //two cards selected, they dont match
                    cardlist[card1list].cardsFlip();
                    cardlist[card2list].cardsFlip();  //flip them both 
                    card2list = -1; //reset the cards selection
                    cardlist[i].cardsFlip(); //flip next selected card
                    card1list = i;   // make it first selected card

                }
            }
        }

    }
    private void updateTimer() {
        seconds++;
        setTitle("time= " + seconds);
    }
}