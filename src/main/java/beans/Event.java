package beans;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Evgeniy_Shvetsov on 10/6/2017.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.id = new SecureRandom().nextInt();
        this.date = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
