package structural.bridge;

public class RasterRenderer implements Renderer {
    public String renderCircle(int radius) {
        return "Drawing pixels for a circle of radius " + radius;
    }
}
