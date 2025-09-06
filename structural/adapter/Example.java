package structural.adapter;

public class Example {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rect = new SquareToRectangleAdapter(square);
        System.out.println(rect.area());
    }
}
