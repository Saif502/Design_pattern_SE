package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    public void attach(Observer o) {
        observers.add(o);
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public int getState() {
        return state;
    }
    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
