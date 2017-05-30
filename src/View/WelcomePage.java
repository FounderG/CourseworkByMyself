package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The class that represent the welcome window
 * @author gaoyiming
 * @version 1.0
 */
public class WelcomePage extends JFrame {

    private JPanel p1 = new JPanel();
    private JPanel p = new JPanel();
    private JLabel l = new JLabel("Welcome To The Cinema!",JLabel.CENTER);

    private JButton customer = new JButton("Customer");
    private JButton administrater = new JButton("Administrator");

    public WelcomePage() {
        run();
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);
    }

    private void run() {
       

        l.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 50));
        p1.setLayout(new GridLayout(2,1));
        p1.add(l);
        
        customer.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        administrater.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
      
        p.setLayout(null);
        customer.setBounds(227, 50, 200, 61);
		p.add(customer);
	
		administrater.setBounds(481, 50, 200, 61);
		p.add(administrater); 
                 
        p1.add(p);
        this.add(p1);   
        customer.setName("Customer");
        administrater.setName("Administrator");

      

    }


    /**
     * The method that use to set actionlistener to the button components in this window
     * @param actionListener
     */
    public void addListener(ActionListener actionListener) {
        this.customer.addActionListener(actionListener);
        this.administrater.addActionListener(actionListener);
    }

}
