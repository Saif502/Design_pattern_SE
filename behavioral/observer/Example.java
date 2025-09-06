package behavioral.observer;

public class Example {
    public static void main(String[] args) {
        Subject s = new Subject();
        new ConcreteObserver(s, "A");
        new ConcreteObserver(s, "B");
        s.setState(5);
        s.setState(10);
    }
}
