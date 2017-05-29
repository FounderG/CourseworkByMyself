package Model;

import java.util.ArrayList;

/**
 * Created by gaoyiming on 2017/5/13.
 */
public class Screen {

    private int _screenID;
    private ArrayList _seats;

    public Screen(int id) {
        this._screenID = id;
        this._seats = new ArrayList();
        Init();
    }

    public int get_screenID() {
        return this._screenID;
    }

    public ArrayList getSeats() {
        return this._seats;
    }

    private void Init() {
        switch (this._screenID) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    this._seats.add(new ArrayList());
                    for (int j = 0; j < 8; j++) {
                        ((ArrayList) this._seats.get(i)).add(0);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    this._seats.add(new ArrayList());
                    if (i == 3) {
                        for (int j = 0; j < 8; j++) {
                            ((ArrayList) this._seats.get(i)).add(0);
                        }
                    } else {
                        for (int j = 0; j < 6; j++) {
                            ((ArrayList) this._seats.get(i)).add(0);
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    this._seats.add(new ArrayList());
                    if (i == 4) {
                        for (int j = 0; j < 8; j++) {
                            ((ArrayList) this._seats.get(i)).add(0);
                        }
                    } else {
                        for (int j = 0; j < 6; j++) {
                            ((ArrayList) this._seats.get(i)).add(0);
                        }
                    }
                }
                break;
        }
    }

    //this method can be used to set the availability of a specific seat
    public void setSeats(int row, int no, int value) {
        ((ArrayList) this._seats.get(row - 1)).set(no - 1, value);
    }

    ;
}
