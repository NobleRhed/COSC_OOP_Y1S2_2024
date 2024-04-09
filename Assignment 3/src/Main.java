import project.*;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Instantiate DataStructures
        DataStructures dataStructures = new DataStructures();

        // Array to be inserted into each data structure
        int[] elements = {1, 2, 3, 4, 5};

        // Insert array into LinkedList, Stack, and Queue
        dataStructures.linkedList.insertArray(elements);
        dataStructures.stack.pushArray(elements);
        dataStructures.queue.enqueueArray(elements);

        // Display the contents of each data structure
        dataStructures.linkedList.display();
        dataStructures.stack.display();
        dataStructures.queue.display();
    }

        // Demonstrate file operations
        String filename = "data.txt";
        FileOperations fileOps = new FileOperations();

        //Write
        try {
            fileOps.writeFile(filename, "Transmission send!\nTesting,testing,123!\nDo you hear me Will Robinson?");
            System.out.println("Write to file SUCCESS");
        } catch (IOException e) {
            System.err.println("Write to file FAILED" + e.getMessage());
        }
        //Read
        try {
            String content = fileOps.readFile(filename);
            System.out.println("Contents: " + content);
        } catch (IOException e) {
            System.err.println("Cannot read file" + e.getMessage());
        }
    }
}