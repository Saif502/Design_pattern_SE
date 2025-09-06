package structural.decorator;

public class ItalicDecorator implements WrittenText {
    private WrittenText inner;
    public ItalicDecorator(WrittenText inner) {
        this.inner = inner;
    }
    public String write() {
        return "<i>" + inner.write() + "</i>";
    }
}
