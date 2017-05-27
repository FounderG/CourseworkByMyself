package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TypeofTicketPage extends JFrame {
    private JPanel contentPane = new JPanel();//for title
    private JLabel lblTypeOfTicket = new JLabel("Type of Ticket", JLabel.CENTER);

    private JPanel panel = new JPanel();//for the main table
    private JLabel lblType = new JLabel("Type", JLabel.CENTER);
    private JLabel lblDescription = new JLabel("Description", JLabel.CENTER);
    private JLabel lblIdRequied = new JLabel("ID Required", JLabel.CENTER);
    private JLabel lblPrice = new JLabel("Price", JLabel.CENTER);

    private JButton btnChild = new JButton("Child");

    private JLabel lblTo = new JLabel("2 to 17 years old ");
    private JLabel lblNone = new JLabel("None");
    private JLabel label = new JLabel("\uFFE18");
    private JLabel label_1 = new JLabel("\uFFE116");

    private JButton btnAdult = new JButton("Adult");

    private JLabel lblYearsAnd = new JLabel("18 years and older");
    private JLabel lblNone_1 = new JLabel("None");

    private JButton btnSenior = new JButton("Senior");
    private JLabel lblYearsAnd_1 = new JLabel("55 years and older");
    private JLabel lblNone_2 = new JLabel("None");
    private JLabel label_2 = new JLabel("\uFFE112.8");

    private JButton btnStudent = new JButton("Student");
    private JLabel lblYearsAnd_2 = new JLabel("18 years and older and ");
    private JPanel panel_2 = new JPanel();
    private JLabel lblInFullTime = new JLabel("in full time education");
    private JLabel lblStudentId = new JLabel("Student ID");
    private JLabel lblNewLabel = new JLabel("\uFFE113.6");

    private JPanel panel_1 = new JPanel();//for yes and return button

    private JButton btnReturn = new JButton("Return");
    private JButton btnYes = new JButton("Yes");

    /**
     * Create the frame.
     */
    public TypeofTicketPage() {
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 900, 600);
        this.setVisible(true);
    }

    void init() {

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        //set font and color of the title
        lblTypeOfTicket.setFont(new Font(Font.DIALOG, 1, 30));
        contentPane.add(lblTypeOfTicket, BorderLayout.NORTH);


        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 4, 0, 0));


        lblType.setFont(new Font(Font.DIALOG, 1, 20));
        lblType.setOpaque(true);
        lblType.setBackground(Color.ORANGE);
        panel.add(lblType);


        lblDescription.setFont(new Font(Font.DIALOG, 1, 20));
        lblDescription.setOpaque(true);
        lblDescription.setBackground(new Color(255, 160, 122));
        panel.add(lblDescription);


        lblIdRequied.setFont(new Font(Font.DIALOG, 1, 20));
        lblIdRequied.setBackground(new Color(255, 165, 0));
        lblIdRequied.setOpaque(true);
        panel.add(lblIdRequied);


        lblPrice.setFont(new Font(Font.DIALOG, 1, 20));
        lblPrice.setBackground(new Color(255, 160, 122));
        lblPrice.setOpaque(true);

        panel.add(lblPrice);
        panel.add(btnChild);
        btnChild.setName("Child");
        panel.add(lblTo);
        panel.add(lblNone);
        panel.add(label);
        panel.add(btnAdult);
        btnAdult.setName("Adult");
        panel.add(lblYearsAnd);
        panel.add(lblNone_1);
        panel.add(label_1);
        panel.add(btnSenior);
        btnSenior.setName("Senior");
        panel.add(lblYearsAnd_1);
        panel.add(lblNone_2);
        panel.add(label_2);
        panel.add(btnStudent);
        btnStudent.setName("Student");
        panel.add(panel_2);
        panel.add(lblStudentId);
        panel.add(lblNewLabel);

        panel_2.setLayout(new GridLayout(2, 1, 0, 0));
        panel_2.add(lblYearsAnd_2);
        panel_2.add(lblInFullTime);

        contentPane.add(panel_1, BorderLayout.SOUTH);

        panel_1.add(btnReturn);
        panel_1.add(btnYes);
        btnReturn.setName("Return");
        btnYes.setName("Yes");
    }

    public void setActionListener(ActionListener actionListener) {
        this.btnChild.addActionListener(actionListener);
        this.btnAdult.addActionListener(actionListener);
        this.btnSenior.addActionListener(actionListener);
        this.btnStudent.addActionListener(actionListener);
        this.btnReturn.addActionListener(actionListener);
        this.btnYes.addActionListener(actionListener);
    }
}
