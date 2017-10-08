package loggers;

import beans.Event;

import java.util.List;

/**
 * Created by shvet on 09.10.2017.
 */
public class CombinedEventLogger implements EventLogger {
    private List<EventLogger> eventLoggers;

    public CombinedEventLogger(List<EventLogger> eventLoggers) {
        this.eventLoggers = eventLoggers;
    }

    public void logEvent(Event event) {
        for(EventLogger eventLogger: eventLoggers){
            eventLogger.logEvent(event);
        }
    }
}
