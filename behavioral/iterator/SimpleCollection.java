package behavioral.iterator;

public class SimpleCollection<T> {
    private T[] items;
    private int size;
    @SafeVarargs
    public SimpleCollection(T... items) {
        this.items = items;
        this.size = items.length;
    }
    public SimpleIterator<T> iterator() {
        return new SimpleIterator<T>() {
            int index = 0;
            public boolean hasNext() {
                return index < size;
            }
            public T next() {
                return items[index++];
            }
        };
    }
}
