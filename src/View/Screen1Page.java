package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class that represent the screen1
 *
 * @author gaoyiming
 */
public class Screen1Page extends JFrame {

    ArrayList<JButton> seatl = new ArrayList<JButton>();
    ArrayList<JButton> seatr = new ArrayList<JButton>();
    Integer[][] state = new Integer[4][8];    //show whether the seat has been chosen or not

    private JPanel contentPane = new JPanel();
    private JLabel lblScreen = new JLabel("Screen1", JLabel.CENTER);
    private JPanel panel = new JPanel();

    private JPanel panel_1 = new JPanel();//for seats of left side
    private JLabel lblD = new JLabel("D", JLabel.CENTER);
    private JButton button = new JButton("8");
    private JButton btnNewButton7 = new JButton("7");
    private JButton btnNewButton6 = new JButton("6");
    private JButton button_1 = new JButton("5");
    private JLabel lblC = new JLabel("C", JLabel.CENTER);
    private JButton btnNewButton_6 = new JButton("8");
    private JButton btnNewButton_5 = new JButton("7");
    private JButton btnNewButton_4 = new JButton("6");
    private JButton button_2 = new JButton("5");
    private JLabel lblB = new JLabel("B", JLabel.CENTER);
    private JButton btnNewButton_3 = new JButton("8");
    private JButton btnNewButton_2 = new JButton("7");
    private JButton btnNewButton_1 = new JButton("6");
    private JButton button_3 = new JButton("5");
    private JLabel lblA = new JLabel("A", JLabel.CENTER);
    private JButton btnNewButton_10 = new JButton("8");
    private JButton btnNewButton_11 = new JButton("7");
    private JButton btnNewButton_12 = new JButton("6");
    private JButton button_4 = new JButton("5");

    private JPanel panel_2 = new JPanel();//for the  seats of right side
    private JButton btnNewButton = new JButton("4");
    private JButton btnNewButton_7 = new JButton("3");
    private JButton btnNewButton_8 = new JButton("2");
    private JButton button_5 = new JButton("1");
    private JLabel lblNewLabel = new JLabel("D", JLabel.CENTER);
    private JButton btnNewButton_9 = new JButton("4");
    private JButton btnNewButton_13 = new JButton("3");
    private JButton btnNewButton_14 = new JButton("2");
    private JButton button_6 = new JButton("1");
    private JLabel lblNewLabel_1 = new JLabel("C", JLabel.CENTER);
    private JButton btnNewButton_15 = new JButton("4");
    private JButton btnNewButton_16 = new JButton("3");
    private JButton btnNewButton_17 = new JButton("2");
    private JButton button_7 = new JButton("1");
    private JLabel lblNewLabel_2 = new JLabel("B", JLabel.CENTER);
    private JButton btnNewButton_18 = new JButton("4");
    private JButton btnNewButton_19 = new JButton("3");
    private JButton btnNewButton_20 = new JButton("2");
    private JButton button_8 = new JButton("1");
    private JLabel lblNewLabel_3 = new JLabel("A", JLabel.CENTER);

    private JPanel panel_3 = new JPanel();//for screen
    private JLabel lblScreen_1 = new JLabel("Screen", JLabel.CENTER);

    private JPanel panel_4 = new JPanel();//for yes and return button
    private JButton btnReturn = new JButton("Return");
    private JButton btnYes = new JButton("Yes");

    /**
     * Create the frame.
     */
    public Screen1Page() {
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);

    }

    void init() {

        //states initialization
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                state[i][j] = 0;
            }
        }

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        lblScreen.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        contentPane.add(lblScreen, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        panel.setLayout(new GridLayout(1, 2, 30, 2));
        panel.add(panel_1);

        panel_1.setLayout(new GridLayout(4, 5, 5, 5));
        panel_1.add(lblD);
        panel_1.add(button);
        button.setName("D8");
        seatl.add(button);
        panel_1.add(btnNewButton7);
        btnNewButton7.setName("D7");
        seatl.add(btnNewButton7);
        panel_1.add(btnNewButton6);
        btnNewButton6.setName("D6");
        seatl.add(btnNewButton6);
        panel_1.add(button_1);
        button_1.setName("D5");
        seatl.add(button_1);
        panel_1.add(lblC);
        panel_1.add(btnNewButton_6);
        btnNewButton_6.setName("C8");
        seatl.add(btnNewButton_6);
        panel_1.add(btnNewButton_5);
        btnNewButton_5.setName("C7");
        seatl.add(btnNewButton_5);
        panel_1.add(btnNewButton_4);
        btnNewButton_4.setName("C6");
        seatl.add(btnNewButton_4);
        panel_1.add(button_2);
        button_2.setName("C5");
        seatl.add(button_2);
        panel_1.add(lblB);
        panel_1.add(btnNewButton_3);
        btnNewButton_3.setName("B8");
        seatl.add(btnNewButton_3);
        panel_1.add(btnNewButton_2);
        btnNewButton_2.setName("B7");
        seatl.add(btnNewButton_2);
        panel_1.add(btnNewButton_1);
        btnNewButton_1.setName("B6");
        seatl.add(btnNewButton_1);
        panel_1.add(button_3);
        button_3.setName("B5");
        seatl.add(button_3);
        panel_1.add(lblA);
        panel_1.add(btnNewButton_10);
        btnNewButton_10.setName("A8");
        seatl.add(btnNewButton_10);
        panel_1.add(btnNewButton_11);
        btnNewButton_11.setName("A7");
        seatl.add(btnNewButton_11);
        panel_1.add(btnNewButton_12);
        btnNewButton_12.setName("A6");
        seatl.add(btnNewButton_12);
        panel_1.add(button_4);
        button_4.setName("A5");
        seatl.add(button_4);


        panel.add(panel_2);

        panel_2.setLayout(new GridLayout(4, 5, 5, 5));
        panel_2.add(btnNewButton);
        btnNewButton.setName("D4");
        seatr.add(btnNewButton);
        panel_2.add(btnNewButton_7);
        btnNewButton_7.setName("D3");
        seatr.add(btnNewButton_7);
        panel_2.add(btnNewButton_8);
        btnNewButton_8.setName("D2");
        seatr.add(btnNewButton_8);
        panel_2.add(button_5);
        button_5.setName("D1");
        seatr.add(button_5);
        panel_2.add(lblNewLabel);
        panel_2.add(btnNewButton_9);
        btnNewButton_9.setName("C4");
        seatr.add(btnNewButton_9);
        panel_2.add(btnNewButton_13);
        btnNewButton_13.setName("C3");
        seatr.add(btnNewButton_13);
        panel_2.add(btnNewButton_14);
        btnNewButton_14.setName("C2");
        seatr.add(btnNewButton_14);
        panel_2.add(button_6);
        button_6.setName("C1");
        seatr.add(button_6);
        panel_2.add(lblNewLabel_1);
        panel_2.add(btnNewButton_15);
        btnNewButton_15.setName("B4");
        seatr.add(btnNewButton_15);
        panel_2.add(btnNewButton_16);
        btnNewButton_16.setName("B3");
        seatr.add(btnNewButton_16);
        panel_2.add(btnNewButton_17);
        btnNewButton_17.setName("B2");
        seatr.add(btnNewButton_17);
        panel_2.add(button_7);
        button_7.setName("B1");
        seatr.add(button_7);
        panel_2.add(lblNewLabel_2);
        panel_2.add(btnNewButton_18);
        btnNewButton_18.setName("A4");
        seatr.add(btnNewButton_18);
        panel_2.add(btnNewButton_19);
        btnNewButton_19.setName("A3");
        seatr.add(btnNewButton_19);
        panel_2.add(btnNewButton_20);
        btnNewButton_20.setName("A2");
        seatr.add(btnNewButton_20);
        panel_2.add(button_8);
        button_8.setName("A1");
        seatr.add(button_8);
        panel_2.add(lblNewLabel_3);

        contentPane.add(panel_3, BorderLayout.SOUTH);

        panel_3.setLayout(new GridLayout(2, 1, 0, 0));
        lblScreen_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblScreen_1.setOpaque(true);
        lblScreen_1.setBackground(new Color(100, 149, 237));
        panel_3.add(lblScreen_1);
        panel_3.add(panel_4);

        btnReturn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        btnYes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        panel_4.add(btnReturn);
        btnReturn.setName("Return");
        panel_4.add(btnYes);
        btnYes.setName("Yes");
    }

    /**
     * @param n:row    of the seat user choose
     * @param m:number of the seat user choose
     */
    public void select(int n, int m) {

        if (state[4 - n][8 - m] == 0) {
            if (m >= 5) {
                seatl.get(4 * (4 - n) + (4 - (m - 4))).setOpaque(true);
                seatl.get(4 * (4 - n) + (4 - (m - 4))).setBackground(Color.GREEN);//change the color of selected seat to green
                state[4 - n][8 - m] = 1;//indicate that this seat has been chosen
            }
            if (m <= 4) {
                seatr.get(4 * (4 - n) + (4 - m)).setOpaque(true);
                seatr.get(4 * (4 - n) + (4 - m)).setBackground(Color.GREEN);
                state[4 - n][8 - m] = 1;//indicate that this seat has been chosen
            }
        } else {
            if (m >= 5) {
                seatl.get(4 * (4 - n) + (4 - (m - 4))).setBackground(null);
                state[4 - n][8 - m] = 0;//indicate that this seat has been chosen
            }
            if (m <= 4) {
                seatr.get(4 * (4 - n) + (4 - m)).setBackground(null);
                state[4 - n][8 - m] = 0;//indicate that this seat has been chosen
            }
        }

    }

    /**
     * function: when we open the layout of screen, if yhe state of seat is 1
     * Then it shows that this seat has been occupied and its color turned to red.
     *
     * @param m the no of a row
     * @param n the row number
     */

    public void occupy(int n, int m) {

        if (m >= 5) {
            seatl.get(4 * (4 - n) + (4 - (m - 4))).setOpaque(true);
            seatl.get(4 * (4 - n) + (4 - (m - 4))).setBackground(Color.RED);//change the color of selected seat to green
            seatl.get(4 * (4 - n) + (4 - (m - 4))).setEnabled(false);
        }
        if (m <= 4) {
            seatr.get(4 * (4 - n) + (4 - m)).setOpaque(true);
            seatr.get(4 * (4 - n) + (4 - m)).setBackground(Color.RED);
            seatr.get(4 * (4 - n) + (4 - m)).setEnabled(false);
        }
    }


    /**
     * Use to add actionlistener to the seats
     *
     * @param actionListener
     */
    public void setActionListener(ActionListener actionListener) {
        for (Iterator it = this.seatl.iterator(); it.hasNext(); ) {
            ((JButton) it.next()).addActionListener(actionListener);
        }

        for (Iterator it = this.seatr.iterator(); it.hasNext(); ) {
            ((JButton) it.next()).addActionListener(actionListener);
        }

        this.btnYes.addActionListener(actionListener);
        this.btnReturn.addActionListener(actionListener);
    }

}
