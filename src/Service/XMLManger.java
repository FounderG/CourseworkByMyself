package Service;

import Model.*;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gaoyiming on 2017/5/7.
 */
public class XMLManger {
    /**
     * method that use to get a sepecific movie using movie ID
     *
     * @param id
     * @return movie
     * @throws Exception
     */
    public static Movie getMovieWithID(String id) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/Movies.xml");

        Element rootElement = document.getRootElement();
        List movieNode = rootElement.elements("Movie");

        for (Iterator it = movieNode.iterator(); it.hasNext(); ) {
            Element elm = (Element) it.next();
            if (elm.attributeValue("ID").equals(id)) {
                Movie myMovie = new Movie(id, elm.elementText("Name"), Integer.parseInt(elm.elementText("Length")), elm.elementText("Poster"));
                return myMovie;
            }
        }

        return null;
    }

    public static int getMovieNum() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/Movies.xml");

        Element rootElement = document.getRootElement();
        List movieNode = rootElement.elements("Movie");

        return movieNode.size();
    }

    /**
     * this function can return the list of schedules of specific movie using the movie ID
     *
     * @param movieID
     * @return schedule
     * @throws Exception
     */
    public static ArrayList<Schedule> getScheduleListWithID(String movieID) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/Schedule.xml");

        Element rootElement = document.getRootElement();
        List scheduleNodes = rootElement.elements("Schedule");

        ArrayList<Schedule> mySchedule = new ArrayList<Schedule>();

        for (Iterator it = scheduleNodes.iterator(); it.hasNext(); ) {
            Element elm = (Element) it.next();//get a schedule and check

            //check the movie ID
            if (elm.elementText("Movie").equals(movieID)) {
                //the id is equal
                //generate the schedule object
                String scheduleID = elm.attributeValue("ID");
                String scheduleTime = elm.elementText("Time");

                //deal with the screen and seats
                Element seatElm = elm.element("Screen");//get the seats element
                int screenID = Integer.parseInt(seatElm.attributeValue("ID"));

                //generate the screen object
                Screen screen = new Screen(screenID);

                List seats = seatElm.elements("Seat");
                for (Iterator j = seats.iterator(); j.hasNext(); ) {
                    //to set the availability
                    Element seat = (Element) j.next();

                    int row = Integer.parseInt(seat.attributeValue("Row"));
                    int no = Integer.parseInt(seat.attributeValue("No"));
                    int ava = Integer.parseInt(seat.getText());
                    screen.setSeats(row, no, ava);
                }

                Schedule schedule = new Schedule(
                        scheduleID, movieID, scheduleTime
                );

                schedule.setScreen(screen);
                mySchedule.add(schedule);
            }
        }

        return mySchedule;
    }

    /**
     * function that use to update the screen status
     *
     * @param schedule
     * @throws Exception
     */
    public static void updateSchedule(Schedule schedule) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/Schedule.xml");

        //first, find and delete the specific schedule that is waiting for the update
        Element root = document.getRootElement();
        List scheduleList = root.elements();

        for (Iterator it = scheduleList.iterator(); it.hasNext(); ) {
            Element candidate = (Element) it.next();
            if (candidate.attributeValue("ID").equals(schedule.getID())) {
                root.remove(candidate);//delete the node
                break;
            }
        }

        //add the updated schedule to the root node
        Element updatedSchedule = root.addElement("Schedule");
        updatedSchedule.addAttribute("ID", schedule.getID());

        Element updatedMovie = updatedSchedule.addElement("Movie");
        updatedMovie.setText(schedule.getMovieID());

        Element updatedTime = updatedSchedule.addElement("Time");
        updatedTime.setText(schedule.getStartTime());

        Element updatedScreen = updatedSchedule.addElement("Screen");
        updatedScreen.addAttribute("ID", String.valueOf(schedule.getScreen().get_screenID()));
        //insert the seats
        ArrayList seatList = schedule.getScreen().getSeats();

        int rowNum = 0;
        for (Iterator row = seatList.iterator(); row.hasNext(); ) {
            //iterate the row
            ArrayList specificRow = (ArrayList) row.next();
            rowNum++;
            //iterate the number
            int seatNum = 0;
            for (Iterator num = specificRow.iterator(); num.hasNext(); ) {
                Object specificSeat = num.next();
                seatNum++;
                int value = (int) specificSeat;

                //generate the node
                Element seatNode = updatedScreen.addElement("Seat");
                seatNode.addAttribute("Row", String.valueOf(rowNum));
                seatNode.addAttribute("No", String.valueOf(seatNum));
                seatNode.setText(String.valueOf(value));

                //End node construction
            }
        }

        Element updatedPrice = updatedSchedule.addElement("Price");
        updatedPrice.setText(String.valueOf(schedule.getOriginalPrice()));

        //save the change
        XMLWriter writer = new XMLWriter(new FileWriter("Resource/Schedule.xml"));
        writer.write(document);
        writer.close();
    }

    /**
     * method that use to get schedule
     *
     * @param scheduleID
     * @return schedule
     * @throws Exception
     */
    public static Schedule getScheduleWithID(String scheduleID) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/Schedule.xml");

        Element root = document.getRootElement();
        List schedulesRaw = root.elements();

        for (Iterator it = schedulesRaw.iterator(); it.hasNext(); ) {
            Element schedule = (Element) it.next();
            if (schedule.attributeValue("ID").equals(scheduleID)) {
                //we get the right element, start parsing
                String movieID = schedule.elementText("Movie");
                String startTime = schedule.elementText("Time");

                //deal with the screen and seats
                Element seatElm = schedule.element("Screen");//get the seats element
                int screenID = Integer.parseInt(seatElm.attributeValue("ID"));

                //generate the screen object
                Screen screen = new Screen(screenID);

                List seats = seatElm.elements("Seat");
                for (Iterator j = seats.iterator(); j.hasNext(); ) {
                    //to set the availability
                    Element seat = (Element) j.next();

                    int row = Integer.parseInt(seat.attributeValue("Row"));
                    int no = Integer.parseInt(seat.attributeValue("No"));
                    int ava = Integer.parseInt(seat.getText());
                    screen.setSeats(row, no, ava);
                }

                Schedule mySchedule = new Schedule(scheduleID, movieID, startTime);
                mySchedule.setScreen(screen);

                return mySchedule;
            }
        }

        return null;
    }

    /**
     * method that use to update the purchase infomation
     *
     * @param purchaseInfo
     * @throws Exception
     */
    public static void AddPurchaseInfo(PurchaseInfo purchaseInfo) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("Resource/PurchaseList.xml");

        Element root = document.getRootElement();

        Element newNode = root.addElement("PurchaseInfo");
        newNode.addAttribute("ID", purchaseInfo.get_ID());
        newNode.addAttribute("Time", purchaseInfo.get_Time());

        Element newTicketList = newNode.addElement("TicketList");

        for (Iterator it = purchaseInfo.get_TicketsList().iterator(); it.hasNext(); ) {
            Ticket ticket = (Ticket) it.next();

            Element newTicket = newTicketList.addElement("Ticket");
            newTicket.addAttribute("ID", ticket.get_ID());

            Element newSchedule = newTicket.addElement("Schedule");
            newSchedule.setText(ticket.get_scheduleID());

            Element newType = newTicket.addElement("Type");
            newType.setText(String.valueOf(ticket.get_ticketType()));

            Element newSeat = newTicket.addElement("Seat");
            newSeat.setText(CharacterParser.getRowWithNum(ticket.get_row()) + String.valueOf(ticket.get_No()));

            Element newPrice = newTicket.addElement("Price");
            newPrice.setText(String.valueOf(ticket.get_actualPrice()));

            Element newReference = newTicket.addElement("Reference");
            newReference.setText(ticket.get_Reference());
        }

        XMLWriter writer = new XMLWriter(new FileWriter("Resource/PurchaseList.xml"));
        writer.write(document);
        writer.close();
    }
}
