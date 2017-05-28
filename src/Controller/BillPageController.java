package Controller;

import Model.PurchaseInfo;
import Model.Schedule;
import Model.Ticket;
import Service.CharacterParser;
import Service.TextFileManager;
import Service.XMLManger;
import View.BillPage;
import View.GoodByePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/27.
 */
public class BillPageController implements ActionListener {

    private Schedule schedule;
    private BillPage billPage;
    private ArrayList<Ticket> ticketArrayList;

    public BillPageController(Schedule MySchedule, ArrayList<Ticket> MyTicketArrayList) {
        this.schedule = MySchedule;
        this.ticketArrayList = MyTicketArrayList;
        this.Init();
    }

    private void Init() {
        ArrayList<String> a = new ArrayList<>();
        for (Iterator it = this.ticketArrayList.iterator(); it.hasNext(); ) {
            Ticket ticket = (Ticket) it.next();
            a.add(CharacterParser.getTicketTypeWithNum(ticket.get_ticketType()));
        }

        this.billPage = new BillPage(a);
        this.billPage.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnSelected = (JButton) e.getSource();
        String nameSelect = btnSelected.getName();

        switch (nameSelect) {
            case "Pay":
                //update the schedule
                for (Iterator it = this.ticketArrayList.iterator(); it.hasNext(); ) {
                    Ticket ticket = (Ticket) it.next();
                    this.schedule.getScreen().setSeats(ticket.get_row(), ticket.get_No(), 1);
                }
                try {
                    XMLManger.updateSchedule(this.schedule);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                //store the purchase info
                try {
                    XMLManger.AddPurchaseInfo(new PurchaseInfo(this.ticketArrayList));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                //print out the ticket(s)
                try {
                    TextFileManager.TicketPrinter(this.ticketArrayList);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new GoodByePage();
                break;
            case "Return":
                this.billPage.dispose();
                break;
        }
    }
}
