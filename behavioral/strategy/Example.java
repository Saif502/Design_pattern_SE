package behavioral.strategy;

public class Example {
    public static void main(String[] args) {
        Context ctx = new Context(new AddStrategy());
        System.out.println(ctx.execute(3,4));
        ctx = new Context(new MultiplyStrategy());
        System.out.println(ctx.execute(3,4));
    }
}
