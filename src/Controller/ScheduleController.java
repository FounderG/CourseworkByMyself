package Controller;

import Model.Schedule;
import Service.ScreenManager;
import Service.XMLManger;
import View.SchedulePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/18.
 */
public class ScheduleController implements ActionListener {
    private SchedulePage schedulePage;

    public ScheduleController(SchedulePage mySchedulePage) {
        this.schedulePage = mySchedulePage;
        this.Init();
    }

    private void Init() {
        this.schedulePage.addListenerToScheduleButtons(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //to get the selected schedule
        JButton selectedSchedule = (JButton) e.getSource();
        String scheduleID = selectedSchedule.getName();

        //then we can get the specific schedule
        //then turn to the specific screen

        try {
            Schedule scheduleChosen = XMLManger.getScheduleWithID(scheduleID);
            //turn to the different screen
            ScreenManager.InitScreen(scheduleChosen);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
