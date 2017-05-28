package Controller;

import Model.Schedule;
import Model.Ticket;
import Service.CharacterParser;
import View.Screen1Page;
import View.TypeofTicketPage;
import org.omg.CORBA.INTERNAL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/20.
 */
public class Screen_1_Controller implements ActionListener {

    private Screen1Page screen1Page;
    private Schedule schedule;
    private ArrayList<Ticket> ticketArrayList;

    public Screen_1_Controller(Schedule mySchedule) {
        this.schedule = mySchedule;
        this.Init();
    }

    private void Init() {
        //to configure the screen 1
        this.screen1Page = new Screen1Page();
        //to set the unavailable seat
        int rowBuffer = 0;
        for (Iterator it = this.schedule.getScreen().getSeats().iterator(); it.hasNext(); ) {
            ArrayList row = (ArrayList) it.next();
            rowBuffer++;
            int noBuffer = 0;
            for (Iterator no = row.iterator(); no.hasNext(); ) {
                int availability = (int) no.next();
                noBuffer++;
                if (availability == 1) {
                    this.screen1Page.occupy(rowBuffer, noBuffer);
                }
            }
        }

        //set the button
        this.screen1Page.setActionListener(this);
        this.ticketArrayList = new ArrayList<Ticket>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //when a button clicked
        //generate a tickets
        JButton btnClicked = (JButton) e.getSource();

        //judge the clicked button
        if (btnClicked.getName().equals("Yes")) {
            //turn to the next page
            if (this.ticketArrayList.size() == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "You haven't select any seat!");
            } else {
                //judge the type choose
                int judge = 1;
                for (Iterator it = this.ticketArrayList.iterator(); it.hasNext(); ) {
                    Ticket ticket = (Ticket) it.next();
                    if (ticket.get_ticketType()==0){
                        judge=0;
                        JOptionPane.showMessageDialog(new JFrame(), "The Seat: "+CharacterParser.getRowWithNum(ticket.get_row())+String.valueOf(ticket.get_No())+"'s type hasn't been assigned!");
                    }
                }
                if (judge == 1)
                    new TicketInfoController(this.ticketArrayList, this.schedule);
            }
        }
        if (btnClicked.getName().equals("Return")) {
            this.screen1Page.dispose();
        } else {
            //judge the button click, choose or cancel
            String seatClicked = btnClicked.getName();
            String[] row_no = seatClicked.split("");
            this.screen1Page.select(CharacterParser.getRowWithChar(row_no[0]), Integer.parseInt(row_no[1]));
            Color background = btnClicked.getBackground();

            if (background.equals(Color.green)) {
                //click to select
                Ticket newTicket = new Ticket(schedule.getID(), CharacterParser.getRowWithChar(row_no[0]), Integer.parseInt(row_no[1]), schedule.getOriginalPrice());
                this.ticketArrayList.add(newTicket);

                //generate the type list and choose
                TicketTypeController ticketTypeController = new TicketTypeController(new TypeofTicketPage(), newTicket);

            } else {
                //click to cancel
                for (Iterator it = this.ticketArrayList.iterator(); it.hasNext(); ) {
                    Ticket deleteTicket = (Ticket) it.next();
                    if ((deleteTicket.get_row() == CharacterParser.getRowWithChar(row_no[0])) && (deleteTicket.get_No() == Integer.parseInt(row_no[1]))) {
                        this.ticketArrayList.remove(deleteTicket);
                    }
                }
            }
        }
    }
}
