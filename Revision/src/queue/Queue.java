package src.queue;

public interface Queue<T> {

    void enqueue(T element);

    T dequeue();

    int size();

    boolean isEmpty();
}
