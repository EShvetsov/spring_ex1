package loggers;

import beans.Event;

import java.util.List;

/**
 * Created by shvet on 07.10.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName) {
        super(fileName);
    }

    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsToFile();
            cache.clear();
        }
    }

    private void writeEventsToFile() {
        for (Event event : cache) {
            super.logEvent(event);
        }
    }
    private void destroy(){
        if(!cache.isEmpty()){
            writeEventsToFile();
        }
    }
}
