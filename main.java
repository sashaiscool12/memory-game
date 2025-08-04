
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
import java.awt.Font;

public class main extends JFrame implements ActionListener//new class has access to all functionality in JFrame
{
    JButton howto;
    JButton newgame;

    JPanel panel1;
    private game game = new game();

    public main()
    {
        //sets up window
        setTitle("sasha's super sick memory card game");
        this.getContentPane().setPreferredSize(new Dimension(1000, 1000)); //600 wide 400 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
        panel1.setBackground(Color.pink);
        this.add(panel1, BorderLayout.CENTER); 

        howto = new JButton("how to play");
        howto.setFont(new Font("Verdana", Font.ITALIC, 30));

        howto.addActionListener(this);
        panel1.add(howto);

        newgame = new JButton("new game");
        newgame.setFont(new Font("Verdana", Font.ITALIC, 30));
        newgame.addActionListener(this);
        panel1.add(newgame);   

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
                JDialog box = new JDialog(this);
                box.setBounds(600, 600, 600, 600);
                TextArea boxInfo = new TextArea("firstly click on two cards, if they're the same animal, woohoo!\nyou've found a pair! if they're different,\n continue to click on different cards until they're\nall the same and you've found all the pairs. \ntime yourself, compete with your friends, have fun!");
                boxInfo.setFont(new Font("Verdana", Font.ITALIC, 15));
                boxInfo.setEditable(false);
                box.add(boxInfo);    
                box.setVisible(true);
                box.setTitle("how 2 play");
                break;

            case "new game":
                this.dispose();
                game.setVisible(true);
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }

}
 