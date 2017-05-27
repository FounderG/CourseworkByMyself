package Controller;

import Service.XMLManger;
import View.MovieDetailPage;
import View.MovieSelectPage;
import View.SchedulePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaoyiming on 2017/5/18.
 */
public class MovieSelectController implements ActionListener {
    private MovieSelectPage movieSelectPage;

    public MovieSelectController(MovieSelectPage myMovieSelectPage) {
        this.movieSelectPage = myMovieSelectPage;
        this.Init();
    }

    private void Init() {
        this.movieSelectPage.ListenToMovieSelected(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String movieID = ((JButton) e.getSource()).getName();
        try {
            new MovieDetailController(new MovieDetailPage(movieID));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
