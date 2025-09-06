package creational.prototype;

public class Example {
    public static void main(String[] args) {
        User original = new User("Alice", 30);
        User copy = (User) original.clone();
        copy.setName("Bob");
        System.out.println(original);
        System.out.println(copy);
    }
}
