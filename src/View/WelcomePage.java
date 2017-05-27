package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WelcomePage extends JFrame {

    private JPanel p = new JPanel();
    private JLabel l = new JLabel("Welcome To The Cinema!");

    private JButton customer = new JButton("Customer");
    private JButton administrater = new JButton("Administrator");

    public WelcomePage() {
        run();
        this.setSize(1600, 1000);
        this.setVisible(true);
    }

    private void run() {
        this.getContentPane().add(BorderLayout.CENTER, p);
        p.setLayout(null);

        l.setFont(new Font("Welcome to the Cinema!", Font.PLAIN, 50));

        customer.setFont(new Font("Customer", Font.PLAIN, 20));
        administrater.setFont(new Font("Administrator", Font.PLAIN, 20));

        l.setBounds(500, 300, 1200, 150);
        customer.setBounds(900, 600, 300, 150);
        administrater.setBounds(300, 600, 300, 150);

        customer.setName("Customer");
        administrater.setName("Administrator");

        p.add(l);
        p.add(customer);
        p.add(administrater);

    }

    public void addListener(ActionListener actionListener) {
        this.customer.addActionListener(actionListener);
        this.administrater.addActionListener(actionListener);
    }

}
