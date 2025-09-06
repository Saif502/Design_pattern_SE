package structural.decorator;

public class Example {
    public static void main(String[] args) {
        WrittenText plain = new PlainText("hello");
        WrittenText bold = new BoldDecorator(plain);
        WrittenText fancy = new ItalicDecorator(bold);
        System.out.println(fancy.write());
    }
}
