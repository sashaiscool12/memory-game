
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
 
public class game extends JFrame  {
    JPanel panel1;
    public JFrame game = new JFrame("game window");{
         
        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //600 wide 400 high
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           
              panel1 = new JPanel();
         panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
        panel1.setBackground(Color.pink);
        this.add(panel1, BorderLayout.CENTER); 
        
       // ImageIcon
        
        
        
        this.pack();
            this.toFront();
            this.setVisible(true);
    }
}



