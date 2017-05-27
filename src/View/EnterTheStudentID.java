package View;

import Controller.TicketTypeController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/25.
 */
public class EnterTheStudentID extends JFrame {
    private TicketTypeController ticketTypeController;

    private JLabel Title;

    public String getStuIDField() {
        return StuIDField.getText();
    }

    private JTextField StuIDField;
    private JButton btnYes;
    private Thread thread;

    public EnterTheStudentID(TicketTypeController MyTicketTypeController, Thread Mythread) {
        this.ticketTypeController = MyTicketTypeController;
        this.thread = Mythread;

        this.Title = new JLabel("Please Enter the StudentID");
        this.StuIDField = new JTextField();
        this.btnYes = new JButton("Confirm");
        this.btnYes.setName("ConfirmStuID");
        this.btnYes.addActionListener(MyTicketTypeController);

        this.getContentPane().add(this.Title, BorderLayout.NORTH);
        this.getContentPane().add(this.StuIDField, BorderLayout.CENTER);
        this.getContentPane().add(this.btnYes, BorderLayout.SOUTH);

        this.setSize(400, 150);
        this.setVisible(true);
    }

}
