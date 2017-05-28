package Controller;

import Model.Movie;
import Service.XMLManger;
import View.MovieDetailPage;
import View.SchedulePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/18.
 */
public class MovieDetailController implements ActionListener {
    private MovieDetailPage movieDetailPage;

    public MovieDetailController(MovieDetailPage myMovieDetailPage) {
        this.movieDetailPage = myMovieDetailPage;
        this.Init();
    }

    private void Init() {
        this.movieDetailPage.getInfo();
        this.movieDetailPage.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getName().equals("Return")) {
            this.movieDetailPage.dispose();
        } else {
            try {
                new ScheduleController(new SchedulePage(XMLManger.getScheduleListWithID(this.movieDetailPage.getMovieID())));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}
