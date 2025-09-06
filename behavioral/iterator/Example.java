package behavioral.iterator;

public class Example {
    public static void main(String[] args) {
        SimpleCollection<String> c = new SimpleCollection<>("a","b","c");
        SimpleIterator<String> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
