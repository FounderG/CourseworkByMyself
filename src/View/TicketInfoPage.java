package View; /**
 * Created by 888888 on 2017/5/10.
 */

import Model.Movie;
import Model.Schedule;
import Service.XMLManger;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JTable;

import javax.swing.JButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TicketInfoPage extends JFrame {

    private JPanel contentPane = new JPanel();
    private JLabel lblTicketInformation = new JLabel("Ticket Information", JLabel.CENTER);//title of the page

    private JLabel lblNewLabel = new JLabel("Student Number:");
    private JTable table = new JTable();

    private JPanel panel = new JPanel(); //film customers choose and the type of the ticket
    private JLabel lblTicket = new JLabel("Film:");
    private JPanel panel_1 = new JPanel();
    private JLabel lblTicket_1 = new JLabel("Ticket:");
    private JScrollPane scrollPane = new JScrollPane();

    private JPanel panel_2 = new JPanel();//yes and return button
    private JButton btnReturn = new JButton("Return");
    private JButton btnYes = new JButton("Yes");
    private String[] Names = {"Type", "Location"};
    private DefaultTableModel defaultTableModel = null;
    private String[][] s = new String[10][2];

    /**
     * Create the frame.
     */
    public TicketInfoPage(ArrayList<String> a) {

        this.init(a);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 200, 900, 600);
        this.setVisible(true);

    }

    public void setFilm(Schedule schedule) throws Exception {
        Movie movie = XMLManger.getMovieWithID(schedule.getMovieID());
        String lbl = "Film:    " + movie.getName() + " - " + schedule.getStartTime();       
        this.lblTicket.setText(lbl);
        lblTicket.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
    }

    void init(ArrayList<String> a) {

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        lblTicketInformation.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        contentPane.add(lblTicketInformation, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        panel.setLayout(new GridLayout(3, 0, 0, 0));
        lblTicket.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
        panel.add(lblTicket);
        panel.add(panel_1);

        panel_1.setLayout(null);
        lblTicket_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
        lblTicket_1.setBounds(0,0,100,100);
        panel_1.add(lblTicket_1);

        defaultTableModel = new DefaultTableModel(initS(a), Names);
        table = new JTable(defaultTableModel);
        table.setFont(new Font("Berlin Sans FB", Font.PLAIN, 23));
        table.setRowHeight(40);
        table.getTableHeader().setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28));

        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, r);
        table.setBounds(0,20,600,400);

        scrollPane.setViewportView(table);
        scrollPane.setLocation(200,0);
        scrollPane.setSize(600,300);
        //scrollPane.setBounds(200,20,600,500);
        //scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    
        panel_1.add(scrollPane);
        contentPane.add(panel_2, BorderLayout.SOUTH);
        btnReturn.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        btnYes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
        panel_2.add(btnReturn);
        btnReturn.setName("Return");
        panel_2.add(btnYes);
        btnYes.setName("Yes");

    }

    private String[][] initS(ArrayList<String> a) {
        int t = 0;
        for (int i = 0; i < a.size() / 2; i++) {
            s[i][0] = a.get(t);
            s[i][1] = a.get(t + 1);
            t = t + 2;
        }
        return s;
    }

    public void setActionListener(ActionListener actionListener) {
        this.btnReturn.addActionListener(actionListener);
        this.btnYes.addActionListener(actionListener);
    }
}

