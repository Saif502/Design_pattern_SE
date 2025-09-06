package structural.decorator;

public class PlainText implements WrittenText {
    private String text;
    public PlainText(String text) {
        this.text = text;
    }
    public String write() {
        return text;
    }
}
