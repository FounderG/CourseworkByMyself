package View;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * The class that represent the screen3
 *
 * @author gaoyiming
 */
public class Screen3Page extends JFrame {


    ArrayList<JButton> seat = new ArrayList<JButton>();
    JButton b = new JButton();
    Integer[][] state = new Integer[5][8];

    private JPanel contentPane = new JPanel();//for title
    private JLabel lblScreen = new JLabel("Screen3", JLabel.CENTER);

    private JPanel panel = new JPanel();//for the layout of screen
    private JLabel lblE = new JLabel("E", JLabel.CENTER);
    private JButton button = new JButton("8");
    private JButton button_1 = new JButton("7");
    private JButton button_2 = new JButton("6");
    private JButton button_3 = new JButton("5");
    private JButton button_4 = new JButton("4");
    private JButton button_5 = new JButton("3");
    private JButton button_6 = new JButton("2");
    private JButton button_7 = new JButton("1");
    private JLabel lblE_1 = new JLabel("E", JLabel.CENTER);
    private JLabel lblD = new JLabel("D", JLabel.CENTER);
    private JButton button_8 = new JButton("6");
    private JButton button_9 = new JButton("5");
    private JLabel label = new JLabel("");
    private JButton button_10 = new JButton("4");
    private JButton button_11 = new JButton("3");
    private JLabel label_1 = new JLabel("");
    private JButton button_12 = new JButton("2");
    private JButton button_13 = new JButton("1");
    private JLabel lblNewLabel = new JLabel("D", JLabel.CENTER);
    private JLabel lblB = new JLabel("C", JLabel.CENTER);
    private JButton button_14 = new JButton("6");
    private JButton button_15 = new JButton("5");
    private JLabel label_2 = new JLabel("");
    private JButton button_16 = new JButton("4");
    private JButton button_17 = new JButton("3");
    private JLabel label_3 = new JLabel("");
    private JButton button_18 = new JButton("2");
    private JButton button_19 = new JButton("1");
    private JLabel lblB_1 = new JLabel("C", JLabel.CENTER);
    private JLabel lblA = new JLabel("B", JLabel.CENTER);
    private JButton button_20 = new JButton("6");
    private JButton button_21 = new JButton("5");
    private JLabel label_4 = new JLabel("");
    private JButton button_22 = new JButton("4");
    private JButton button_23 = new JButton("3");
    private JLabel label_5 = new JLabel("");
    private JButton button_24 = new JButton("2");
    private JButton button_25 = new JButton("1");
    private JLabel lblB_2 = new JLabel("B", JLabel.CENTER);
    private JLabel lblA_1 = new JLabel("A", JLabel.CENTER);
    private JButton button_26 = new JButton("6");
    private JButton button_27 = new JButton("5");
    private JLabel label_6 = new JLabel("");
    private JButton button_28 = new JButton("4");
    private JButton button_29 = new JButton("3");
    private JLabel label_7 = new JLabel("");
    private JButton button_30 = new JButton("2");
    private JButton button_31 = new JButton("1");
    private JLabel lblA_2 = new JLabel("A", JLabel.CENTER);

    private JPanel panel_1 = new JPanel();//for screen notification
    private JLabel lblScreen_1 = new JLabel("Screen", JLabel.CENTER);

    private JPanel panel_2 = new JPanel();//for buttons
    private JButton btnReturn = new JButton("Return");
    private JButton btnYes = new JButton("Yes");

    /**
     * Create the frame.
     */
    public Screen3Page() {
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);

    }

    void init() {
        //states initialization
        for (int i = 0; i < 5; i++) {
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

        panel.setLayout(new GridLayout(5, 10, 0, 0));
        panel.add(lblE);
        panel.add(button);
        button.setName("E8");
        seat.add(button);
        panel.add(button_1);
        button_1.setName("E7");
        seat.add(button_1);
        panel.add(button_2);
        button_2.setName("E6");
        seat.add(button_2);
        panel.add(button_3);
        button_3.setName("E5");
        seat.add(button_3);
        panel.add(button_4);
        button_4.setName("E4");
        seat.add(button_4);
        panel.add(button_5);
        button_5.setName("E3");
        seat.add(button_5);
        panel.add(button_6);
        button_6.setName("E2");
        seat.add(button_6);
        panel.add(button_7);
        button_7.setName("E1");
        seat.add(button_7);
        panel.add(lblE_1);
        panel.add(lblD);
        panel.add(button_8);
        button_8.setName("D6");
        seat.add(button_8);
        panel.add(button_9);
        button_9.setName("D5");
        seat.add(button_9);
        panel.add(label);
        seat.add(b);
        panel.add(button_10);
        button_10.setName("D4");
        seat.add(button_10);
        panel.add(button_11);
        button_11.setName("D3");
        seat.add(button_11);
        panel.add(label_1);
        seat.add(b);
        panel.add(button_12);
        button_12.setName("D2");
        seat.add(button_12);
        panel.add(button_13);
        button_13.setName("D1");
        seat.add(button_13);
        panel.add(lblNewLabel);
        panel.add(lblB);
        panel.add(button_14);
        button_14.setName("C6");
        seat.add(button_14);
        panel.add(button_15);
        button_15.setName("C5");
        seat.add(button_15);
        panel.add(label_2);
        seat.add(b);
        panel.add(button_16);
        button_16.setName("C4");
        seat.add(button_16);
        panel.add(button_17);
        button_17.setName("C3");
        seat.add(button_17);
        panel.add(label_3);
        seat.add(b);
        panel.add(button_18);
        button_18.setName("C2");
        seat.add(button_18);
        panel.add(button_19);
        button_19.setName("C1");
        seat.add(button_19);
        panel.add(lblB_1);
        panel.add(lblA);
        panel.add(button_20);
        button_20.setName("B6");
        seat.add(button_20);
        panel.add(button_21);
        button_21.setName("B5");
        seat.add(button_21);
        panel.add(label_4);
        seat.add(b);
        panel.add(button_22);
        button_22.setName("B4");
        seat.add(button_22);
        panel.add(button_23);
        button_23.setName("B3");
        seat.add(button_23);
        panel.add(label_5);
        seat.add(b);
        panel.add(button_24);
        button_24.setName("B2");
        seat.add(button_24);
        panel.add(button_25);
        button_25.setName("B1");
        seat.add(button_25);
        panel.add(lblB_2);
        panel.add(lblA_1);
        panel.add(button_26);
        button_26.setName("A6");
        seat.add(button_26);
        panel.add(button_27);
        button_27.setName("A5");
        seat.add(button_27);
        panel.add(label_6);
        seat.add(b);
        panel.add(button_28);
        button_28.setName("A4");
        seat.add(button_28);
        panel.add(button_29);
        button_29.setName("A3");
        seat.add(button_29);
        panel.add(label_7);
        seat.add(b);
        panel.add(button_30);
        button_30.setName("A2");
        seat.add(button_30);
        panel.add(button_31);
        button_31.setName("A1");
        seat.add(button_31);
        panel.add(lblA_2);

        contentPane.add(panel_1, BorderLayout.SOUTH);
        panel_1.setLayout(new GridLayout(2, 1, 0, 0));
        lblScreen_1.setOpaque(true);
        lblScreen_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblScreen_1.setBackground(new Color(100, 149, 237));
        panel_1.add(lblScreen_1);
        panel_1.add(panel_2);

        btnReturn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        btnYes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        panel_2.add(btnReturn);
        btnReturn.setName("Return");
        panel_2.add(btnYes);
        btnYes.setName("Yes");
    }

    /**
     * @param n:row    of the seat user choose
     * @param m:number of the seat user choose
     */
    public void select(int n, int m) {

        if (state[5 - n][8 - m] == 0) {
            if (n == 5) {
                seat.get(8 - m).setOpaque(true);
                seat.get(8 - m).setBackground(Color.GREEN);//change the color of selected seat to green
                state[5 - n][8 - m] = 1;

            }
        } else {
            if (n == 5) {
                seat.get(8 - m).setBackground(null);//change the color of selected seat to green
                state[5 - n][8 - m] = 0;
            }
        }

        if (n < 5) {
            if (m == 6 || m == 5) {
                if (state[5 - n][6 - m] == 0) {
                    seat.get(8 * (5 - n) + (6 - m)).setOpaque(true);
                    seat.get(8 * (5 - n) + (6 - m)).setBackground(Color.GREEN);//change the color of selected seat to green
                    state[5 - n][6 - m] = 1;
                } else {
                    seat.get(8 * (5 - n) + (6 - m)).setBackground(null);//change the color of selected seat to green
                    state[5 - n][6 - m] = 0;
                }
            }

            if (m == 4 || m == 3) {
                if (state[5 - n][7 - m] == 0) {
                    seat.get(8 * (5 - n) + (7 - m)).setOpaque(true);
                    seat.get(8 * (5 - n) + (7 - m)).setBackground(Color.GREEN);//change the color of selected seat to green
                    state[5 - n][7 - m] = 1;
                } else {
                    seat.get(8 * (5 - n) + (7 - m)).setBackground(null);//change the color of selected seat to green
                    state[5 - n][7 - m] = 0;
                }
            }


            if (m == 2 || m == 1) {
                if (state[5 - n][8 - m] == 0) {
                    seat.get(8 * (5 - n) + (8 - m)).setOpaque(true);
                    seat.get(8 * (5 - n) + (8 - m)).setBackground(Color.GREEN);//change the color of selected seat to green
                    state[5 - n][8 - m] = 1;
                } else {
                    seat.get(8 * (5 - n) + (8 - m)).setBackground(null);//change the color of selected seat to green
                    state[5 - n][8 - m] = 0;
                }
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
        if (n == 5) {

            seat.get(8 - m).setOpaque(true);
            seat.get(8 - m).setBackground(Color.RED);//change the color of selected seat to green
            seat.get(8 - m).setEnabled(false);
        }
        if (n < 5) {
            if (m == 6 || m == 5) {

                seat.get(8 * (5 - n) + (6 - m)).setOpaque(true);
                seat.get(8 * (5 - n) + (6 - m)).setBackground(Color.RED);//change the color of selected seat to green
                seat.get(8 * (5 - n) + (6 - m)).setEnabled(false);
            }
            if (m == 4 || m == 3) {

                seat.get(8 * (5 - n) + (7 - m)).setOpaque(true);
                seat.get(8 * (5 - n) + (7 - m)).setBackground(Color.RED);//change the color of selected seat to green
                seat.get(8 * (5 - n) + (7 - m)).setEnabled(false);
            }
            if (m == 2 || m == 1) {

                seat.get(8 * (5 - n) + (8 - m)).setOpaque(true);
                seat.get(8 * (5 - n) + (8 - m)).setBackground(Color.RED);//change the color of selected seat to green
                seat.get(8 * (5 - n) + (8 - m)).setEnabled(false);
            }
        }

    }

    /**
     * Use to add actionlistener to the seats
     *
     * @param actionListener
     */
    public void setActionListener(ActionListener actionListener) {
        for (Iterator it = this.seat.iterator(); it.hasNext(); ) {
            ((JButton) it.next()).addActionListener(actionListener);
        }
        this.btnYes.addActionListener(actionListener);
        this.btnReturn.addActionListener(actionListener);
    }

}
