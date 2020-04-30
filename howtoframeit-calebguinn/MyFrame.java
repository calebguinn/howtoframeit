import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
    private static final long serialVersionUID = 1L;

    private static final int HEIGHT = 400;
    private static final int WIDTH = 300;

    private JButton button1;
    private JButton button2;

    // PRIVATE CLASS
    //
    private class MyActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            
            if(source == button1)
            {
                System.out.println("You saved the first half!");
            }
            else
            {
                System.out.println("You did not save the first half");
            }
            
        }
        
    }
    
    public MyFrame(String title)
    {
        this.setSize (WIDTH, HEIGHT);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.button1 = new JButton("Save first half");
        this.button2 = new JButton("Save second half");

        this.add(button1);
        this.add(button2);
        
        MyActionListener listener = new MyActionListener();
        
        this.button1.addActionListener(listener);
        this.button2.addActionListener(listener);

        this.pack();
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("My First Frame");
        new MyFrame("My Second Frame");
     } 
}
