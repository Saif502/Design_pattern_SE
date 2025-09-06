package structural.bridge;

public class Example {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Circle circle = new Circle(vector, 5);
        System.out.println(circle.draw());
        circle.resize(2);
        System.out.println(circle.draw());
        Renderer raster = new RasterRenderer();
        Circle c2 = new Circle(raster, 3);
        System.out.println(c2.draw());
    }
}
