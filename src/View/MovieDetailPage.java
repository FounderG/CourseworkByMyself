package View;

import Model.Movie;
import Service.CharacterParser;
import Service.XMLManger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The class that use to represent the detailed and confirmed page when you choose a specific movie
 *
 * @author gaoyiming
 */
public class MovieDetailPage extends JFrame {

    private JLabel i;// this is the poster of the selected movie
    private JLabel t;// this is the length of the movie
    //private JLabel l;// this is the description of the selected movie
    private JPanel p = new JPanel();
    ;
    private JPanel p1_1 = new JPanel();
    ;
    private JButton Return;//button for return
    private JButton buy;//button for confirmation
    private JPanel p1 = new JPanel();
    // private JPanel p1_1= new JPanel();
    private JPanel p2 = new JPanel();
    //private JPanel p3= new JPanel();
    private String movieID;
    private JLabel l1 = new JLabel("Movie Information", JLabel.CENTER);
    private JLabel name = new JLabel();
    private JLabel length = new JLabel();
    private JTextArea des = new JTextArea();

    public MovieDetailPage(String movieID) throws Exception {
        Init(movieID);
        this.movieID = movieID;
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);
    }

    private void Init(String movieID) throws Exception {

        //get the movie object of the selected movie
        Movie movieSelected = XMLManger.getMovieWithID(movieID);
        //set the poster
        ImageIcon img = new ImageIcon(movieSelected.getPoster());
        this.i = new JLabel(img);
        // i.setBounds(20,0,300,600);
        //set the label for the length
        this.t = new JLabel();

        p1.setLayout(new GridLayout(1, 2));
        p1.add(i);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));


        p1.add(p);

        p2.setLayout(new FlowLayout(1, 50, 20));
        this.Return = new JButton("Return");
        this.buy = new JButton("Buy it");
        this.buy.setName("Buy");
        this.Return.setName("Return");
        Return.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        buy.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        p2.add(Return);
        p2.add(buy);

        l1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        this.add(BorderLayout.NORTH, l1);
        this.add(BorderLayout.CENTER, p1);
        this.add(BorderLayout.SOUTH, p2);

    }

    public String getMovieID() {
        return this.movieID;
    }

    /**
     * The method that use to set the description of a movie
     */
    public void getInfo() {
        int a = CharacterParser.getIndexWithMovieID(this.movieID);
        String s = "";
        if (a == 1) {
            s = "Description: In 1933, America, director Car decided to begin his great movie. So, he, Anne, an unemployed actress and some film producers went to an island that is full of dangers. Of course, except Car, everyone thought his or her destination is Canada. Accidentally, the ship was at last grounded at the island. There were wild people, dinosaurs and beasts everywhere. Unluckily, King Kong caught Anne. But it��s funny that King Kong was became attracted by Anne. Because of this, King Kong was caught and brought to the big city to make shows. On the first show day, King Kong escaped and went around the city to find the girl he loved. Due to this, he did lots of damages. And the army began to catch him or even kill him. When Anne knew this, she ran to King Kong. She did understand King Kong was not only a frightened huge monkey but also the one who saved her on the island. King Kong had fought with two dinosaurs to save her life. Sadly, no matter where King Kong went, no matter how hard Anne tried to protect it. Finally, King Kong was shoot and fell from the tallest building. He left his girl.";
            name.setText("Name: KONG: SKULL ISLAND ");
            length.setText("Length: 118 min");
        }
        if (a == 2) {
            s = "Description: In 2029, the world's mutant was almost eliminated, X war has been dissolved. Physically and mentally tired of the twilight of the dragon root loopholes gradually disappear, drink all day and rely on the driver to live, he was in the Mexican border to take care of suffering from tortured Charles Xavier. One day, a strange woman asked Rogen to carry a girl named Laura Ginny to the Canadian border, and at the beginning of the Reagan refused, but Charles Xavier had been waiting for the girl to appear because Laura Ginny has a super combat effectiveness, and in many ways much like Wolverine. She was killed by a strong corporate mercenary, because her DNA has a connection to the secret of Rogan, which began an endless hunt.";
            name.setText("Name: LOGAN");
            length.setText("Length: 135 min");

        }
        if (a == 3) {
            s = "Description: A merchant is lost in the forest. He enters a castle and tries to take a rose from the castle to his daughter Belle. But he is caught by the Beast. The Beast allows the merchant to go and say goodbye to his children, but says he must return to take his punishment. Feeling responsible, Belle steals her father's horse and goes to the castle.";
            name.setText("Name: BEAUTY AND THE BEAST ");
            length.setText("Length: 130 min");

        }
        if (a == 4) {
            s = "Description: Childhood of the garrison because of short stature by others called piggy. He grows in a single-parent family, and his mother yelled at him regardless of whether he was asked or not, and he was friends with the local drug dealer Juan. Juan taught him to swim, give him his own past, give him the lack of fatherly love, but at the same time continue to sell the drugs to the mother of Chiron.After the adult garrison has a strong body, as the streets of Atlanta drug lords. And he is difficult to understand the past. With a short call to the phone, he returned to his hometown of Miami and his mother bury the hatchet, and first love Kevin's meeting is still nervous. The end of the story, he no longer care about the eyes of others, began to accept their own everything.";
            name.setText("Name: MOONLIGHT ");
            length.setText("Length: 111 min");

        }
        if (a == 5) {
            s = "Description: The story takes place in Los Angeles, mia is the actress and playwright, she indulges the old movie star. She was in the Warner Brothers studio as a barista, often Tengbi to audition, if really received the play, even a small role will make her ecstatic. Sebastian is a jazz pianist with silk ties and has a near-old pursuit of art. He wanted to open the club, but he was obsessed with music more suitable for museums, almost no one would like to spend money to listen. In order to survive, he insisted on joining a popular jazz band, in front of the screaming audience fiddle with music synthesizer. The same pursuit of the dream of the two met in each other in the city, singing and dancing in the fall in love, mutual comfort support, with the pursuit of life dreams. But in the gradual realization of the dream at the same time, art and commerce, dreams and reality between the hazy game, the other two emotions are also facing the choice and test, after a series of setbacks, differences, they encourage each other not to give up the dream.";
            name.setText("Name: LA LA LAND ");
            length.setText("Length: 128 min");

        }
        des.setText(s);
        name.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        length.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        des.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        des.setEditable(false);
        des.setLineWrap(true);
        des.setWrapStyleWord(true);
        p.add(name);
        p.add(length);
        p.add(new JScrollPane(des));
    }

    /**
     * method that use to set the actionlistener to the button components
     *
     * @param actionListener
     */
    public void addActionListener(ActionListener actionListener) {
        this.Return.addActionListener(actionListener);
        this.buy.addActionListener(actionListener);
    }
}
