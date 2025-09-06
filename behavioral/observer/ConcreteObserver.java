package behavioral.observer;

public class ConcreteObserver implements Observer {
    private Subject subject;
    private String name;
    public ConcreteObserver(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
        this.subject.attach(this);
    }
    public void update() {
        System.out.println(name + " observed state: " + subject.getState());
    }
}
