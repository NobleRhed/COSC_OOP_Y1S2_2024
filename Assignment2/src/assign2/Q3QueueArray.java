package assign2;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Q3QueueArray {
    private final LinkedList<Integer> queue;
    private final int maxSize;

    // Queue with a maximum size
    public Q3QueueArray(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    //True Queue is full
    public Boolean isFull() {
        return queue.size() == maxSize;
    }

    //True Queue is empty
    public Boolean isEmpty() {
        return queue.isEmpty();
    }

    // Insert an element into the queue
    public void enQueue(int element) {
        if (!isFull()) {
            queue.addLast(element);
        }
        //if full, let the user know
        else {
            System.out.println("Cannot enqueue " + element + ". The queue is full.");
        }
    }

    // Remove the front element from the Queue
    public int deQueue() {
        if (!isEmpty()) {
            return queue.removeFirst();
        } else {
            //throw exception for empty queue
            throw new NoSuchElementException("Queue is empty");
        }
    }

    // Display Queue members
    public void display() {
        if (!isEmpty()) {
            System.out.println("Elements in the queue: " + queue);
        } else {
            System.out.println("Nobody here...");
        }
    }
}
