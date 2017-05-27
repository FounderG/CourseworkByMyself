package Model;

import java.util.Random;

/**
 * Created by gaoyiming on 2017/5/20.
 */
public class Ticket {
    private String _ID;
    private String _scheduleID;

    public void set_Reference(String _Reference) {
        this._Reference = _Reference;
    }

    private String _Reference;

    public void set_ticketType(int _ticketType) {
        this._ticketType = _ticketType;
    }

    private int _ticketType;//child/Adult/Senior/Student
    private int _row;
    private int _No;
    private double _originalPrice;
    private double _actualPrice;

    public Ticket(String scheduleID, int row, int no, double originalPrice) {
        this._scheduleID = scheduleID;
        this._ticketType = 0;
        this._row = row;
        this._No = no;
        this._originalPrice = originalPrice;

        this.Init();
    }

    private void Init() {
        //to automatically generate the 8-bit uid
        Random random = new Random();
        this._ID = "";
        for (int i = 0; i < 8; i++) {
            //首字母不能为0
            this._ID += (random.nextInt(3) + 1);
        }
        //to automatically generate the actual price

        //set the reference for identity
        this._Reference = "NONEED";
    }

    public void generateActualPrice() {
        switch (this._ticketType) {
            case 1:
                //child
                this._actualPrice = this._originalPrice * (1 - 0.5);
                break;
            case 2:
                //adult
                this._actualPrice = this._originalPrice * (1 - 0);
                break;
            case 3:
                //senior
                this._actualPrice = this._originalPrice * (1 - 0.2);
                break;
            case 4:
                //student
                this._actualPrice = this._originalPrice * (1 - 0.15);
                break;
        }
    }

    //the getter and setter
    public String get_ID() {
        return this._ID;
    }

    public String get_scheduleID() {
        return this._scheduleID;
    }

    public int get_ticketType() {
        return this._ticketType;
    }

    public int get_row() {
        return this._row;
    }

    public int get_No() {
        return this._No;
    }

    public double get_originalPrice() {
        return this._originalPrice;
    }

    public double get_actualPrice() {
        return this._actualPrice;
    }

    public String get_Reference() {
        return this._Reference;
    }

    public void set_StudentID(String studentID) {
        this._Reference = studentID;
    }
}
