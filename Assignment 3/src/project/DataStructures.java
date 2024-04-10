package project;

public class DataStructures {
    public static class Node { //Start with Node class like we have done in a previous assignment for a Cycle validation class
        int val;
        Node next;

        public Node(int x) {
            this.val = x;
            this.next = null;
        }
    }
    //create instances of each of the data structures to be used
    public assignedLinkedList linkedList = new assignedLinkedList();
    public assignedStack stack = new assignedStack();
    public assignedQueue queue = new assignedQueue();

    public static class assignedLinkedList {
        private Node head = null; // The head of the linkedList

        // Insert node at the end of the list
        public void insert(int data) {
            Node newNode = new Node(data); // Create a new node with the given data
            if (head == null) {
                head = newNode; // If the list is empty, make the new node as the head
            } else {
                Node last = head; // Start with the head
                while (last.next != null) { // Traverse to the last node
                    last = last.next;
                }
                last.next = newNode; // Link the last node to the new node
            }
        }

        // Insert an array of integers into the list - used in inserting default values method in main.
        // This is the same purpose for each of the <method>Array in the following two Data Structures
        public void insertArray(int[] array) {
            for (int data : array) {
                insert(data); // Use the insert method to add each element
            }
        }

        // Delete a node from the beginning of the list
        public void remove() throws CustomDataStructureException {
            if (head == null) {
                throw new CustomDataStructureException("Cannot delete from an empty list.");//custom error handle
            }
            head = head.next; // Make the second node as the head
        }

        // Display the contents of the list
        public void display() throws CustomDataStructureException {
            if (head == null) {
                throw new CustomDataStructureException("The list is empty."); //custom error handle
            }
            Node current = head; // Start with the head
            while (current != null) {
                System.out.print(current.val + " "); // Print the data of the current node
                current = current.next; // Move to the next node
            }
            System.out.println();  // Newline after displaying the list to ensure there is a clear separation between output of these contents and any other further text
        }
    }


    public static class assignedStack {
        private Node top = null; // The top of the stack

        // Push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node with the data
            newNode.next = top; // The new node points to the previous top
            top = newNode; // Update the top to be the new node
        }

        // Push an array of integers onto the stack
        public void pushArray(int[] array) {
            for (int data : array) {
                push(data); // Use the push method to add each element
            }
        }

        // Pop an element from the stack
        public void pop() throws CustomDataStructureException {
            if (top == null) {
                throw new CustomDataStructureException("Empty Stack cannot be popped!"); //custom error handle
            }
            // The element to be popped is at the top. Update top to the next element.
            top = top.next;
        }

        // Display the stack's contents
        public void display() throws CustomDataStructureException {
            if (top == null) {
                throw new CustomDataStructureException("What stack? I don't have anything here!");//custom error handle
            }
            System.out.print("Stack: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();  // Newline after displaying the stack to ensure there is a clear separation between output of these contents and any other further text
        }
    }


    public static class assignedQueue {
        private Node front = null; // The front of the queue
        private Node rear = null; // The rear of the queue

        // Enqueue an element at the rear of the queue
        public void enqueue(int data) {
            Node newNode = new Node(data); // Create a new node
            if (rear == null) {
                // If the queue is empty, both front and rear are the new node
                front = rear = newNode;
                return;
            }
            // Add the new node at the end of the queue and update the rear
            rear.next = newNode;
            rear = newNode;
        }

        // Enqueue an array of integers into the queue
        public void enqueueArray(int[] array) {
            for (int data : array) {
                enqueue(data); // Use the enqueue method to add each element
            }
        }

        // Remove element from front of queue
        public void dequeue() throws CustomDataStructureException {
            if (front == null) {
                throw new CustomDataStructureException("Empty Queue, can't take what isn't there!");//custom error handle
            }
            // Move the front pointer to the next node
            front = front.next;
            // If the queue becomes empty after dequeuing, update rear as null
            if (front == null) {
                rear = null;
            }
        }

        // Print Queue
        public void display() throws CustomDataStructureException {
            if (front == null) {
                throw new CustomDataStructureException("You don't even HAVE a queue! No queue for you!");//custom error handle
            }
            System.out.print("Queue: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println(); // Newline after displaying the queue to ensure there is a clear separation between output of these contents and any other further text
        }
    }
}
