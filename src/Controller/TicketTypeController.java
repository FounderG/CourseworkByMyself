package Controller;

import Model.Ticket;
import View.EnterTheStudentID;
import View.TypeofTicketPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/25.
 */
public class TicketTypeController implements ActionListener {
    private TypeofTicketPage typeofTicketPage;
    private Ticket ticket;
    private EnterTheStudentID enterTheStudentID;

    public int getTicketType() {
        return ticketType;
    }

    public String getReference() {
        return reference;
    }

    private int ticketType;

    public void setReference(String reference) {
        this.reference = reference;
    }

    private String reference;

    public TicketTypeController(TypeofTicketPage MyTypeofTicketPage, Ticket MyTicket) {
        this.typeofTicketPage = MyTypeofTicketPage;
        this.ticket = MyTicket;
        this.Init();
    }

    private void Init() {
        this.typeofTicketPage.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnClicked = (JButton) e.getSource();

        String typeChosen = btnClicked.getName();

        switch (typeChosen) {
            case "Child":
                this.ticket.set_ticketType(1);
                this.ticket.generateActualPrice();
                break;
            case "Adult":
                this.ticket.set_ticketType(2);
                this.ticket.generateActualPrice();
                break;
            case "Senior":
                this.ticket.set_ticketType(3);
                this.ticket.generateActualPrice();
                break;
            case "Student":
                this.ticket.set_ticketType(4);
                this.ticket.generateActualPrice();
                Object myThis = this;
                this.enterTheStudentID = new EnterTheStudentID((TicketTypeController) myThis, Thread.currentThread());
                break;
            case "ConfirmStuID":
                this.ticket.set_Reference(this.enterTheStudentID.getStuIDField());
                this.enterTheStudentID.dispose();
                break;
            case "Yes":
                this.typeofTicketPage.dispose();
                break;
        }
    }
}
