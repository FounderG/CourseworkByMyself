package Controller;

import Service.TextFileManager;
import View.MovieSelectPage;
import View.WelcomePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/18.
 */
public class WelcomeController implements ActionListener {

    private WelcomePage welcomePage;

    public WelcomeController(WelcomePage myWelcomePage) {
        this.welcomePage = myWelcomePage;
        this.Init();
    }

    private void Init() {
        this.welcomePage.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton actionButton = (JButton) e.getSource();
        if (actionButton.getName().equals("Customer")) {
            new MovieSelectController(new MovieSelectPage());
        }
        if (actionButton.getName().equals("Administrator")) {
            try {
                TextFileManager.GenerateReport();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(new JFrame(), "Done! The report has been generated!");
        }
    }
}
