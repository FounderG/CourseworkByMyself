package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MovieSelectPage extends JFrame {

    private JButton i1;
    private JButton i2;
    private JButton i3;
    private JButton i4;
    private JButton i5;

    public MovieSelectPage() {
        Init();
        this.setSize(1600, 1000);
        this.setVisible(true);
    }

    private void Init() {
        JPanel p = new JPanel();
        p.setLayout(null);

        ImageIcon img1 = new ImageIcon("src/Resource/0001.png");
        ImageIcon img2 = new ImageIcon("src/Resource/0002.png");
        ImageIcon img3 = new ImageIcon("src/Resource/0003.png");
        ImageIcon img4 = new ImageIcon("src/Resource/0004.png");
        ImageIcon img5 = new ImageIcon("src/Resource/0005.png");

        JLabel l = new JLabel("FILM TODAY");
        this.i1 = new JButton(img1);
        i1.setName("0001");
        this.i2 = new JButton(img2);
        i2.setName("0002");
        this.i3 = new JButton(img3);
        i3.setName("0003");
        this.i4 = new JButton(img4);
        i4.setName("0004");
        this.i5 = new JButton(img5);
        i5.setName("0005");


        l.setFont(new Font("", Font.PLAIN, 35));


        l.setBounds(700, 50, 400, 100);
        i1.setBounds(175, 150, 194, 289);
        i2.setBounds(650, 150, 194, 289);
        i3.setBounds(1125, 150, 194, 289);
        i4.setBounds(650, 550, 194, 289);
        i5.setBounds(1125, 550, 194, 289);

        p.add(l);
        p.add(i1);
        p.add(i2);
        p.add(i3);
        p.add(i4);
        p.add(i5);

        this.add(p);
    }

    public void ListenToMovieSelected(ActionListener actionListener) {
        this.i1.addActionListener(actionListener);
        this.i2.addActionListener(actionListener);
        this.i3.addActionListener(actionListener);
        this.i4.addActionListener(actionListener);
        this.i5.addActionListener(actionListener);
    }
}
