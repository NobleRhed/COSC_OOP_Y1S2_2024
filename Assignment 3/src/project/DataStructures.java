import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
    public assignedLinkedList linkedList = new assignedLinkedList();
    public assignedStack stack = new assignedStack();
    public assignedQueue queue = new assignedQueue();

    public class assignedLinkedList {
        private LinkedList<Integer> list = new LinkedList<>();

        public void insertArray(int[] array) {
            for (int element : array) {
                list.add(element);
            }
        }

        public void display() {
            System.out.println("LinkedList: " + list);
        }
    }

    public class assignedStack {
        private Stack<Integer> stack = new Stack<>();

        public void pushArray(int[] array) {
            for (int element : array) {
                stack.push(element);
            }
        }

        public void display() {
            System.out.println("Stack: " + stack);
        }
    }

    public class assignedQueue {
        private Queue<Integer> queue = new LinkedList<>();

        public void enqueueArray(int[] array) {
            for (int element : array) {
                queue.add(element);
            }
        }

        public void display() {
            System.out.println("Queue: " + queue);
        }
    }
}
