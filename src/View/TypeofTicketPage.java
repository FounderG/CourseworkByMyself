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
    private JLabel label = new JLabel("£18");
    private JLabel label_1 = new JLabel("£16");

    private JButton btnAdult = new JButton("Adult");

    private JLabel lblYearsAnd = new JLabel("18 years and older");
    private JLabel lblNone_1 = new JLabel("None");

    private JButton btnSenior = new JButton("Senior");
    private JLabel lblYearsAnd_1 = new JLabel("55 years and older");
    private JLabel lblNone_2 = new JLabel("None");
    private JLabel label_2 = new JLabel("£12.8");

    private JButton btnStudent = new JButton("Student");
    private JLabel lblYearsAnd_2 = new JLabel("18 years and older and ");
    private JPanel panel_2 = new JPanel();
    private JLabel lblInFullTime = new JLabel("in full time education");
    private JLabel lblStudentId = new JLabel("Student ID");
    private JLabel lblNewLabel = new JLabel("£13.6");

    private JPanel panel_1 = new JPanel();//for yes and return button

    private JButton btnReturn = new JButton("Return");
    private JButton btnYes = new JButton("Yes");

    /**
     * Create the frame.
     */
    public TypeofTicketPage() {
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);
    }

    void init() {

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        //set font and color of the title
        lblTypeOfTicket.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        contentPane.add(lblTypeOfTicket, BorderLayout.NORTH);


        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 4, 0, 0));


        lblType.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblType.setOpaque(true);
        lblType.setBackground(Color.ORANGE);
        panel.add(lblType);


        lblDescription.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblDescription.setOpaque(true);
        lblDescription.setBackground(new Color(255, 160, 122));
        panel.add(lblDescription);


        lblIdRequied.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblIdRequied.setBackground(Color.ORANGE);
        lblIdRequied.setOpaque(true);
        panel.add(lblIdRequied);


        lblPrice.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        lblPrice.setBackground(new Color(255, 160, 122));
        lblPrice.setOpaque(true);

        panel.add(lblPrice);
        panel.add(btnChild);
        btnChild.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        btnChild.setName("Child");
        panel.add(lblTo);
        lblTo.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(lblNone);
        lblNone.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(label);
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(btnAdult);
        btnAdult.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        btnAdult.setName("Adult");
        panel.add(lblYearsAnd);
        lblYearsAnd.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(lblNone_1);
        lblNone_1.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(label_1);
        label_1.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(btnSenior);
        btnSenior.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        btnSenior.setName("Senior");
        panel.add(lblYearsAnd_1);
        lblYearsAnd_1.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(lblNone_2);
        lblNone_2.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(label_2);
        label_2.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(btnStudent);
        btnStudent.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        btnStudent.setName("Student");
        panel.add(panel_2);
        panel_2.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(lblStudentId);
        lblStudentId.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        panel_2.setLayout(new GridLayout(2, 1, 0, 0));
        panel_2.add(lblYearsAnd_2);
        lblYearsAnd_2.setFont(new Font("Arial", Font.PLAIN, 15));
        panel_2.add(lblInFullTime);
        lblInFullTime.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        btnReturn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        btnYes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
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
