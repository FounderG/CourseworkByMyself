package View;

import Model.Schedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gaoyiming on 2017/5/18.
 * use to represent the Schedule choose window
 *
 * @author gaoyiming
 */
public class SchedulePage extends JFrame {
    //seperate into two panel, one is for the top label, one is for the schedule list
    //declare the components
    private JPanel schedulePanel;
    private JPanel topLabelPanel;
    private JLabel topLabel;
    private ArrayList<JButton> buttonList;

    public SchedulePage(ArrayList scheduleList) {
        this.Init(scheduleList);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);
    }

    private void Init(ArrayList scheduleList) {
        this.topLabel = new JLabel("Please Choose The Schedule");
        this.topLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        this.topLabelPanel = new JPanel();
        topLabelPanel.add(topLabel, BorderLayout.CENTER);
        //wait for the font set

        this.schedulePanel = new JPanel();
        this.buttonList = new ArrayList<JButton>();
        this.schedulePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        for (Iterator it = scheduleList.iterator(); it.hasNext(); ) {
            Schedule schedule = (Schedule) it.next();//get the schedule

            //generate the button
            JButton button = new JButton(schedule.getStartTime());
            button.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
            button.setName(schedule.getID());
            this.buttonList.add(button);
            this.schedulePanel.add(button);
        }

        this.setLayout(new BorderLayout());
        this.add(topLabelPanel, BorderLayout.NORTH);
        this.add(schedulePanel, BorderLayout.CENTER);
    }


    /**
     * method to construct the action of choose
     * @param actionListener
     */
    public void addListenerToScheduleButtons(ActionListener actionListener) {
        for (Iterator it = this.buttonList.iterator(); it.hasNext(); ) {
            JButton button = (JButton) it.next();
            button.addActionListener(actionListener);
        }
    }

}
