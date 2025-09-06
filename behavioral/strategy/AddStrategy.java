package behavioral.strategy;

public class AddStrategy implements Strategy {
    public int doOperation(int a, int b) {
        return a + b;
    }
}
