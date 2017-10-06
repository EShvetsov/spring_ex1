package loggers;

import beans.Event;

/**
 * Created by Evgeniy_Shvetsov on 10/6/2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
