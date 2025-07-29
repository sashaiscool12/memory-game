/**
 * Write a description of class cards here.
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


public class cards extends JButton
{
   private String cardtype; 
    private JButton cardbutton;  //making card an object
    String question = "question.png";
   JButton questionbutton; 
    private boolean cardclicked;  // if the card is clicked it becomes true
   
  
     public JButton getCard()
    {
        return cardbutton;
    }
     public cards(String stringcardtype)
    {
        cardtype = stringcardtype;  // new varaibel for card type based on the image (dog, giraffe etc)
          cardbutton = new JButton();
        cardbutton.setIcon(new ImageIcon(question));  // default is question img
        cardbutton.setPreferredSize(new Dimension(200, 200));
        boolean cardclicked = false;
    }
 public String cardType()
    {
        return cardtype;
    }
     public void cardsFlip(){
        if (cardclicked){
            cardclicked = false;
            cardbutton.setIcon(new ImageIcon("question.png"));
           
        } else {
            cardclicked = true;
           cardbutton.setIcon(new ImageIcon(cardtype));
        }
    }
 
      
}