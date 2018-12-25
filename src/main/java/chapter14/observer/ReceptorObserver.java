package chapter14.observer;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class ReceptorObserver implements Observer {
    private List<Observable> observers = new ArrayList<Observable>();

    private String receptorSubjectState;


    public ReceptorObserver(String receptorSubjectState) {
        this.receptorSubjectState = receptorSubjectState;
    }

    public void attach(Observable observer) {
        observers.add(observer);
    }

    public void detach(Observable observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observable observer : observers) {
            observer.update(message);
        }
    }

    public String getReceptorSubjectState() {
        return receptorSubjectState;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReceptorObserver that = (ReceptorObserver) o;

        return new EqualsBuilder()
                .append(observers, that.observers)
                .append(receptorSubjectState, that.receptorSubjectState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(observers)
                .append(receptorSubjectState)
                .toHashCode();
    }
}
