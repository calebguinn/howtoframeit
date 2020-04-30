import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest
{

    private static final int HEIGHT = 400;
    private static final int WIDTH = 300;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("How should  frame it?");
        
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        
        JButton b1 = new JButton("Save first half");
        JButton b2 = new JButton("Save second half");
        
        frame.add(b1);
        frame.add(b2);
        
        frame.pack();
        
       
        

    }

}
