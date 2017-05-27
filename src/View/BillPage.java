package View;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by 888888 on 2017/5/9.
 */
public class BillPage extends JFrame {

    JLabel l = new JLabel("BILL", JLabel.CENTER);


    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    JTable table;
    private final JPanel panel = new JPanel();
    private final JButton btnReturn = new JButton("Return");
    private final JButton btnYes = new JButton("Yes");

    private final JPanel panel_1 = new JPanel();//total price of ticket in detail
    private final JLabel lblTotal = new JLabel("Total:", JLabel.CENTER);
    private final JLabel tt = new JLabel("");
    private double total = 0;

    private String[] Names = {"Type", "Price / £"};
    private DefaultTableModel defaultTableModel = null;
    private String[][] s = new String[15][2];
    private JScrollPane scrollPane = new JScrollPane();

    public BillPage(ArrayList<String> a) {
        this.init(a);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 900, 600);
        //this.setSize(900, 600);
        this.setVisible(true);

    }

    void init(ArrayList<String> a) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == "Student")
                total += 13.6;
            if (a.get(i) == "Child")
                total += 8;
            if (a.get(i) == "Senior")
                total += 12.8;
            if (a.get(i) == "Adult")
                total += 16;
        }

        l.setFont(new Font(Font.DIALOG, 1, 40));

        defaultTableModel = new DefaultTableModel(initS(a), Names);

        table = new JTable(defaultTableModel);
        table.setSize(800, 400);

        scrollPane.setViewportView(table);

        p2.setLayout(new GridLayout(2, 1, 0, 0));
        p2.add(panel_1);
        p2.add(panel);

        panel_1.setLayout(new GridLayout(1, 2));
        lblTotal.setFont(new Font(Font.DIALOG, 0, 25));
        lblTotal.setText("Total:" + total);
        panel_1.add(lblTotal);

        btnReturn.setFont(new Font(Font.DIALOG, 1, 25));
        btnYes.setFont(new Font(Font.DIALOG, 1, 25));
        panel.add(btnReturn);
        btnReturn.setName("Return");
        panel.add(btnYes);
        btnYes.setName("Pay");

        getContentPane().add(BorderLayout.NORTH, l);
        getContentPane().add(BorderLayout.CENTER, scrollPane);
        getContentPane().add(BorderLayout.SOUTH, p2);
    }

    private String[][] initS(ArrayList<String> a) {

        for (int i = 0; i < a.size(); i++) {
            //  System.out.println(a.get(i));
            // System.out.println("i"+i);

            s[i][0] = a.get(i);
            //System.out.println(s[i][0]);
            if (s[i][0] == "Student")
                s[i][1] = "13.6";
            if (s[i][0] == "Child")
                s[i][1] = "8";
            if (s[i][0] == "Senior")
                s[i][1] = "12.8";
            if (s[i][0] == "Adult")
                s[i][1] = "16";
        }

        return s;
    }

    public void setActionListener(ActionListener actionListener) {
        this.btnReturn.addActionListener(actionListener);
        this.btnYes.addActionListener(actionListener);
    }
}