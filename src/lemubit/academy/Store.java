package lemubit.academy;

public class Store<T extends Number> {
    T value;

    public Store(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
