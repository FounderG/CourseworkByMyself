package View; /**
 * Created by 888888 on 2017/5/10.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * The class that represent the farewell page
 * @author gaoyiming
 */
public class GoodByePage extends JFrame implements ActionListener {

    private JPanel contentPane = new JPanel();
    private JPanel panel = new JPanel();//for goodbye
    private JLabel lblBye = new JLabel("GoodBye!", JLabel.CENTER);
    private JLabel lblHaveAGood = new JLabel("Have a Good Day!", JLabel.CENTER);

    private JPanel panel_1 = new JPanel();// for button
    private JButton btnBye = new JButton("Bye");


    /**
     * Create the frame.
     */
    public GoodByePage() {
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);
    }

    void init() {

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.add(panel, BorderLayout.CENTER);

        panel.setLayout(new GridLayout(2, 0, 0, 0));
        lblBye.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 45));
        lblHaveAGood.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 45));
        panel.add(lblBye);
        panel.add(lblHaveAGood);

        contentPane.add(panel_1, BorderLayout.SOUTH);

        btnBye.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        panel_1.add(btnBye);
        btnBye.setName("Bye");

        btnBye.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
