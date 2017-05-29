package Service;

import Model.Movie;
import Model.Schedule;
import Model.Screen;
import Model.Ticket;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.ElementModifier;
import org.dom4j.io.SAXReader;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

            FileWriter writer = new FileWriter("TicketOut/" + ticket.get_ID() + ".txt");

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

    public static void GenerateReport() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/PurchaseList.xml");

        Element rootNode = document.getRootElement();
        List purchaseInfoList = rootNode.elements();

        ArrayList movieCount = new ArrayList();
        for (int i = 0; i < XMLManger.getMovieNum(); i++) {
            movieCount.add(Double.valueOf(0.0));
        }

        ArrayList typeCount = new ArrayList();
        for (int i = 0; i < 4; i++) {
            typeCount.add(Double.valueOf(0.0));
        }

        Double totalCount = 0.0;

        for (Iterator it = purchaseInfoList.iterator(); it.hasNext(); ) {
            Element element = (Element) it.next();
            Element ticketList = element.element("TicketList");

            List MyTickets = ticketList.elements();

            for (Iterator iter = MyTickets.iterator(); iter.hasNext(); ) {
                Element ticket = (Element) iter.next();

                //process
                double price = Double.parseDouble(ticket.elementText("Price"));
                totalCount = totalCount + price;

                int type = Integer.parseInt(ticket.elementText("Type"));
                typeCount.set(type - 1, (double) typeCount.get(type - 1) + price);

                int movie = CharacterParser.getIndexWithMovieID(XMLManger.getScheduleWithID(ticket.elementText("Schedule")).getMovieID());
                movieCount.set(movie - 1, (double) movieCount.get(movie - 1) + price);
            }
        }

        FileWriter writer = new FileWriter("ReportOut/Report.txt");

        writer.write("Total: " + String.valueOf(totalCount) + " YUAN\n\n");

        writer.write("Classification With Movies:\n");

        int count_m = 0;
        for (Iterator it = movieCount.iterator(); it.hasNext(); ) {
            double price = (double) it.next();
            writer.write(XMLManger.getMovieWithID("000" + String.valueOf(count_m + 1)).getName() + ": " + String.valueOf(price) + " YUAN\n");

            count_m++;
        }

        writer.write("\nClassification With Types:\n");

        int count_t = 0;
        for (Iterator it = typeCount.iterator(); it.hasNext(); ) {
            double price = (double) it.next();
            writer.write(CharacterParser.getTicketTypeWithNum(count_t + 1) + ": " + String.valueOf(price) + " YUAN\n");

            count_t++;
        }

        writer.close();
    }
}
