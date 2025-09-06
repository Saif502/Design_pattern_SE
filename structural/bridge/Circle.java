package structural.bridge;

public class Circle {
    private Renderer renderer;
    private int radius;
    public Circle(Renderer renderer, int radius) {
        this.renderer = renderer;
        this.radius = radius;
    }
    public String draw() {
        return renderer.renderCircle(radius);
    }
    public void resize(int factor) {
        radius *= factor;
    }
}
