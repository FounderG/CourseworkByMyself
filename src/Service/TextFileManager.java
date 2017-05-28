package Service;

import Model.Movie;
import Model.Schedule;
import Model.Screen;
import Model.Ticket;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/28.
 */
public class TextFileManager {
    /**
     * The method to generate the ticket with the txt file format
     *
     * @param ticketArrayList
     */
    public static void TicketPrinter(ArrayList<Ticket> ticketArrayList) throws Exception {
        for (Iterator it = ticketArrayList.iterator(); it.hasNext(); ) {
            Ticket ticket = (Ticket) it.next();
            Schedule schedule = XMLManger.getScheduleWithID(ticket.get_scheduleID());
            Movie movie = XMLManger.getMovieWithID(schedule.getMovieID());

            FileWriter writer = new FileWriter("src/TicketOut/" + ticket.get_ID() + ".txt");

            writer.write("Ticket ID: " + ticket.get_ID() + "\n");
            writer.write("Movie Name: " + movie.getName() + "\n");
            writer.write("Start Time: " + schedule.getStartTime() + "\n");
            writer.write("Screen: " + String.valueOf(schedule.getScreen().get_screenID()) + "\n");
            writer.write("Seat: " + CharacterParser.getRowWithNum(ticket.get_row()) + String.valueOf(ticket.get_No()) + "\n");
            writer.write("Ticket Type: " + CharacterParser.getTicketTypeWithNum(ticket.get_ticketType()) + "\n");
            if (ticket.get_ticketType() == 4) {
                writer.write("Student ID: " + ticket.get_Reference());
            }

            writer.close();
        }
    }
}
