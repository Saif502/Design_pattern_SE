package behavioral.chain;

public class Example {
    public static void main(String[] args) {
        Handler low = new LowHandler();
        Handler high = new HighHandler();
        low.setNext(high);
        low.handle(2);
        low.handle(20);
    }
}
