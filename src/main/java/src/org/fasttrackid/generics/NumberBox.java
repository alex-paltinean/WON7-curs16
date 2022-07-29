package src.org.fasttrackid.generics;

public class NumberBox<T extends Number> {
    private T item;

    public NumberBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public int getIntValue() {
        return item.intValue();
    }

    public void setItem(T item) {
        this.item = item;
    }
}
