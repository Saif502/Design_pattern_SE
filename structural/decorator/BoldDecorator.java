package structural.decorator;

public class BoldDecorator implements WrittenText {
    private WrittenText inner;
    public BoldDecorator(WrittenText inner) {
        this.inner = inner;
    }
    public String write() {
        return "<b>" + inner.write() + "</b>";
    }
}
