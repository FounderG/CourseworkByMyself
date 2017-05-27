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
 * Created by gaoyiming on 2017/5/7.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        new WelcomeController(new WelcomePage());
    }
}

