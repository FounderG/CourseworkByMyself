package AppEntrance;

import Controller.WelcomeController;
import View.*;

/**
 * This is the main method, the entrance od the whole system
 */
public class App {
    public static void main(String[] args) throws Exception {
        new WelcomeController(new WelcomePage());
    }
}

