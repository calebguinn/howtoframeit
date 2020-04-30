import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;


public class MyLabeledFrame extends JFrame
{
    private static final int HEIGHT = 300;
    private static final int WIDTH = 400;

    private JButton b1;
    private JButton b2;

    private JLabel label;

    public MyLabeledFrame(String title)
    {
        this.setTitle(title);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.b1 = new JButton("Save first half");
        this.b2 = new JButton("Save second half");
        this.label = new JLabel("foo");
        this.label.setForeground(new Color(10, 10, 255)); 

        this.add(b1);
        this.add(b2);
        this.add(this.label);
        
        this.b1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You saved the first half!");
                b2.setBackground(Color.YELLOW);
                label.setText("First half");
            }
            
        });
        
        this.b2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You saved the second half");
                b2.setBackground(Color.RED);
                label.setText("Second half");
                label.setForeground(Color.ORANGE);
                label.setBorder(new BevelBorder(2));
            }
            
        });

        this.pack();
    }

    public static void main(String[] args)
    {
        MyLabeledFrame frame 
            = new MyLabeledFrame("My Frame");


    }
}