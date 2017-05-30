package Service;

import Controller.Screen_1_Controller;
import Controller.Screen_2_Controller;
import Controller.Screen_3_Controller;
import Model.Schedule;

/**
 * Created by gaoyiming on 2017/5/20.
 * this class is use to manage
 */
public class ScreenManager {
    /**
     * method that use to initial a screen
     *
     * @param schedule
     */
    public static void InitScreen(Schedule schedule) {
        int ScreenID = schedule.getScreen().get_screenID();
        if (ScreenID == 1) {
            new Screen_1_Controller(schedule);
        }
        if (ScreenID == 2) {
            new Screen_2_Controller(schedule);
        }
        if (ScreenID == 3) {
            new Screen_3_Controller(schedule);
        }
    }
}
