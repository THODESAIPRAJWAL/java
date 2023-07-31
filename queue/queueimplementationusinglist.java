import  java.util.*;

public class Queue<T> {
    private ArrayList<T> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }
}


public class queueimplementationusinglist {

    
    public static void main(String[] args) {
        dequeue a=new ArrayDeque<>()
        
    }
}

