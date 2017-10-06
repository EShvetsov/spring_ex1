import beans.Client;
import beans.Event;
import loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shvet on 07.10.2017.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(Event event){
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        app.logEvent((Event) ctx.getBean("event"));

    }
}
