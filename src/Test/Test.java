package Test;

import Controller.WelcomeController;
import Model.PurchaseInfo;
import Model.Schedule;
import Model.Screen;
import Model.Ticket;
import Service.XMLManger;
import View.*;

import java.util.ArrayList;

/**
 * This is the main method, the entrance od the whole system
 */
public class Test {
    public static void main(String[] args) throws Exception {
        new WelcomeController(new WelcomePage());
    }
}

