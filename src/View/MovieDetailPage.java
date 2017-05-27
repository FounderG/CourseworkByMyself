package View;

import Model.Movie;
import Service.XMLManger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MovieDetailPage extends JFrame {

    private JLabel i;// this is the poster of the selected movie
    private JLabel t;// this is the length of the movie
    //private JLabel l;// this is the description of the selected movie
    private JPanel p;
    private JButton Return;//button for return
    private JButton buy;//button for confirmation

    private String movieID;

    public MovieDetailPage(String movieID) throws Exception {
        Init(movieID);
        this.movieID = movieID;
        this.setSize(1600, 1000);
        this.setVisible(true);
    }

    private void Init(String movieID) throws Exception {

        //get the movie object of the selected movie
        Movie movieSelected = XMLManger.getMovieWithID(movieID);

        this.p = new JPanel();
        //f.add(p);
        p.setLayout(null);

        //set the poster
        ImageIcon img = new ImageIcon(movieSelected.getPoster());
        this.i = new JLabel(img);

        //set the label for the length
        this.t = new JLabel(String.valueOf(movieSelected.getLength()));


        this.Return = new JButton("Return");
        this.buy = new JButton("Buy it");
        Return.setFont(new Font("Return", Font.PLAIN, 20));
        buy.setFont(new Font("", Font.PLAIN, 20));


        //this.l = new JLabel("<html>Kong: Skull Island is a 2017 American monster film directed by Jordan Vogt-Roberts and written by Dan Gilroy,Max Borenstein and Derek Connolly, from a story by John Gatins.The film is a reboot of the King Kong franchise and serves as the second film in Legendary's MonsterVerse. It stars an ensemble cast consisting of Tom Hiddleston, Samuel L. Jackson, John Goodman, Brie Larson, Jing Tian, Toby Kebbell, John Ortiz, Corey Hawkins, Jason Mitchell, Shea Whigham, Thomas Mann, Terry Notary and John C. Reilly. The film follows a team of scientists and Vietnam War soldiers who travel to an uncharted island in the Pacific and encounter terrifying creatures and the mighty Kong.</html>");
        //this.l.setFont(new Font("Kong: Skull Island is a 2017 American monster film directed by Jordan Vogt-Roberts and written by Dan Gilroy, Max Borenstein and Derek Connolly, from a story by John Gatins. The film is a reboot of the King Kong franchise and serves as the second film in Legendary's MonsterVerse. It stars an ensemble cast consisting of Tom Hiddleston, Samuel L. Jackson, John Goodman, Brie Larson, Jing Tian, Toby Kebbell, John Ortiz, Corey Hawkins, Jason Mitchell, Shea Whigham, Thomas Mann, Terry Notary and John C. Reilly. The film follows a team of scientists and Vietnam War soldiers who travel to an uncharted island in the Pacific and encounter terrifying creatures and the mighty Kong.", Font.PLAIN, 20));
        //this.t.setFont(new Font("118 min", Font.PLAIN, 25));

        i.setBounds(100, 80, 194, 289);
        //l.setBounds(800, 100, 700, 600);
        t.setBounds(400, 600, 100, 100);
        ;
        Return.setBounds(1000, 750, 100, 50);
        buy.setBounds(1200, 750, 100, 50);

        //p.add(l);
        p.add(i);
        this.i.setVisible(true);
        p.add(t);
        p.add(Return);
        p.add(buy);

        this.buy.setName("Buy");
        this.Return.setName("Return");

        this.setContentPane(p);
    }

    public String getMovieID() {
        return this.movieID;
    }

    public void addActionListener(ActionListener actionListener) {
        this.Return.addActionListener(actionListener);
        this.buy.addActionListener(actionListener);
    }
}
