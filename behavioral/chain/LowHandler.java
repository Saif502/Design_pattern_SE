package behavioral.chain;

public class LowHandler extends Handler {
    public void handle(int request) {
        if (request < 10) {
            System.out.println("LowHandler handled " + request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Unhandled " + request);
        }
    }
}
