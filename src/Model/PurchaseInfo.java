package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by gaoyiming on 2017/5/20.
 */
public class PurchaseInfo {

    private String _ID;
    private ArrayList<Ticket> _TicketsList;
    private String _Time;

    public PurchaseInfo(ArrayList<Ticket> ticketArrayList) {
        this._TicketsList = ticketArrayList;
        this.Init();
    }

    private void Init() {
        //automatically gener the uuid
        this._ID = UUID.randomUUID().toString();

        //automatically generate the time
        this._Time = LocalDateTime.now().toString();
    }

    public String get_ID() {
        return this._ID;
    }

    public ArrayList<Ticket> get_TicketsList() {
        return this._TicketsList;
    }

    public String get_Time() {
        return this._Time;
    }
}
