
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
 
public class main extends JFrame implements ActionListener//new class has access to all functionality in JFrame
{
    JButton howto;
    JButton newgame;
    JButton oldgame;
    JPanel panel1;
    public main()
    {
        //sets up window
        setTitle("memory card game");
        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //600 wide 400 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       // button1 = newJButton("click for info");
        // panel1.add(button1);
        
     panel1 = new JPanel();
     panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
    panel1.setBackground(Color.pink);
    this.add(panel1, BorderLayout.CENTER); 
    
    howto = new JButton("how to play");
    howto.addActionListener(this);
    panel1.add(howto);
     
    newgame = new JButton("new game");
    panel1.add(newgame);
     
    oldgame = new JButton("old games");
    panel1.add(oldgame);
     
        //makes window visible
        this.pack();
        this.toFront();
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        System.out.println(cmd);
        switch(cmd) {
            case "how to play":
                System.out.println("hi");
                break;
                
            case "new game":
                 setTitle(" nlkjlkj");
        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //600 wide 400 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        break;
                
            default:
                System.out.println("invalid");
                break;
        }
    }

  
      }

