package Controller;

import Model.Schedule;
import Model.Ticket;
import Service.CharacterParser;
import View.Screen2Page;
import View.Screen3Page;
import View.TypeofTicketPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/27.
 */
public class Screen_3_Controller implements ActionListener {
    private Screen3Page screen3Page;
    private Schedule schedule;
    private ArrayList<Ticket> ticketArrayList;

    public Screen_3_Controller(Schedule mySchedule) {
        this.schedule = mySchedule;
        this.Init();
    }

    private void Init() {
        //to configure the screen 1
        this.screen3Page = new Screen3Page();
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
                    this.screen3Page.occupy(rowBuffer, noBuffer);
                }
            }
        }

        //set the button
        this.screen3Page.setActionListener(this);
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
                new TicketInfoController(this.ticketArrayList, this.schedule);
            }
        }
        if (btnClicked.getName().equals("Return")) {
            this.screen3Page.dispose();
        } else {
            //judge the button click, choose or cancel
            String seatClicked = btnClicked.getName();
            String[] row_no = seatClicked.split("");
            this.screen3Page.select(CharacterParser.getRowWithChar(row_no[0]), Integer.parseInt(row_no[1]));
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
