package chapter14.entrust.event;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<Event>();
    }


    public void addEvent(Object object, String methodName, Object... params) {
        events.add(new Event(object, methodName, params));
    }

    public void notifyEvents() {
        for (Event event : events) {
            event.invoke();
        }
    }
}
