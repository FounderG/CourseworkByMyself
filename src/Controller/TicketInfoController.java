package Controller;

import Model.Schedule;
import Model.Ticket;
import Service.CharacterParser;
import Service.XMLManger;
import View.TicketInfoPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/27.
 */
public class TicketInfoController implements ActionListener {

    private TicketInfoPage ticketInfoPage;
    private ArrayList<Ticket> ticketArrayList;
    private Schedule schedule;

    public TicketInfoController(ArrayList<Ticket> MyTicketArrayList, Schedule MySchedule) {
        this.ticketArrayList = MyTicketArrayList;
        this.schedule = MySchedule;
        try {
            this.Init();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Init() throws Exception {
        ArrayList<String> a = new ArrayList<>();
        for (Iterator it = this.ticketArrayList.iterator(); it.hasNext(); ) {
            Ticket ticket = (Ticket) it.next();
            a.add(CharacterParser.getTicketTypeWithNum(ticket.get_ticketType()));
            a.add(CharacterParser.getRowWithNum(ticket.get_row()) + String.valueOf(ticket.get_No()));
        }

        this.ticketInfoPage = new TicketInfoPage(a);
        Schedule schedule = XMLManger.getScheduleWithID(((Ticket) this.ticketArrayList.get(0)).get_scheduleID());
        this.ticketInfoPage.setFilm(schedule);

        this.ticketInfoPage.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnSelected = (JButton) e.getSource();
        String nameSelect = btnSelected.getName();

        switch (nameSelect) {
            case "Yes":
                new BillPageController(this.schedule, this.ticketArrayList);
                break;
            case "Return":
                this.ticketInfoPage.dispose();
                break;
        }
    }
}
