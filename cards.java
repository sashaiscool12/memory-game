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
    private String cardtype; //type of card aka dog png, flamingo png etc
    private JButton cardbutton;  //creates card button an object
    String question = "question.png"; // default card
    private boolean cardclicked;  //if the card is flipped up or down

    public JButton getCard() //get card buttonn
    {
        return cardbutton; //returns the button that was clicked by user
    }

    public cards(String stringcardtype) //creates card object with specific card type (img file like dog png)
    {
        cardtype = stringcardtype;  //set card type to img
        cardbutton = new JButton(); //create a button for this card
        cardbutton.setIcon(new ImageIcon(question));  // default is question img
       // cardbutton.setMinimumSize(new Dimension(200, 200)); //size of button
        cardbutton.setPreferredSize(new Dimension(200, 200)); //size of button
        cardclicked = false; //card is first faced down
    }

    public String cardType() //getter for card type
    {
        return cardtype; //returns the img file name (dog png flamingo png etc)
    } // ^^helpful bcuz then u can figure out if theyre a pair by if theyre the same img file name

    public void cardsFlip(){ 
        if (cardclicked){
            //if the card is face up flip back down
            cardclicked = false;
            cardbutton.setIcon(new ImageIcon("question.png")); //shows default img
            //cardbutton.setIcon(null);
        } else {
            cardclicked = true;
            //if its faced down flip it up
            cardbutton.setIcon(new ImageIcon(cardtype)); //shows img card type (dog png etc...) 

        }
    }

}