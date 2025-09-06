package behavioral.chain;

public class HighHandler extends Handler {
    public void handle(int request) {
        if (request >= 10) {
            System.out.println("HighHandler handled " + request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Unhandled " + request);
        }
    }
}
