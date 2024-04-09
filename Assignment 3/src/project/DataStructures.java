package project;

import java.util.LinkedList;
import java.util.NoSuchElementException;
public class DataStructures {
    public LinkedList linkedList = new LinkedList();
    public Stack stack = new Stack();
    public Queue queue = new Queue();


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
         public void insertArray(int[] array) {
            for (int element : array) {
                insert(element);
            }
         }
        private Node head;

        public void insert(int data) {
            // Implement insertion logic
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node last = head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
        }

        public void delete() throws CustomDataStructureException {
            // Implement deletion logic
            if (head == null) {
                throw new CustomDataStructureException("Cannot delete! List is empty!");
            }
            head = head.next;
        }

        public void display() {
            // Implement traversal logic
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    class Stack {
        public void pushArray(int[] array){
            for (int element : array) {
                push(element);
            }
        }
        private int[] elements;
        private int size;
        private static final int MAX_STACK = 5;

        public Stack() {
            elements = new int[MAX_STACK];
            size = 0;
        }

        public void push(int data) {
            // Implement push logic

        }

        public int pop() throws CustomDataStructureException {
            // Implement pop logic
            if (size == 0) {
                throw new CustomDataStructureException("Empty Stack!");
            }
            return elements[--size];
        }

        public void display() {
            // Implement display logic
            for (int count = size - 1; count >= 0; count--) {
                System.out.println(elements[count]);
            }
        }
    }
    public class Queue {
        private final LinkedList<Integer> queue;
        private final int maxSize;

        // Queue with a maximum size
        public Queue(int maxSize) {
            this.maxSize = maxSize;
            this.queue = new LinkedList<>();
        }
    }

        //Add elements with array
        public enQueueArray(int[] array) {
            for (int element : array) {
                enQueue(element);
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
        public enQueue(int element) {
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
}
