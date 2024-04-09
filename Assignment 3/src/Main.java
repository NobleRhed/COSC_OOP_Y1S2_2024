import project.*;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        DataStructures dataStructures = new DataStructures();
        //Array to insert elements into the data structures
        int[] elements = {5, 11, 14, 21, 5};

        // Insert elements into data structures and add parameters to each instance
        dataStructures.linkedList.insertArray(elements);
        dataStructures.stack.pushArray(elements);
        dataStructures.queue.enQueueArray(elements);


        // Perform operations and handle exceptions
        dataStructures.linkedList.insert(1);
        dataStructures.stack.push(1);
        dataStructures.queue.enQueue(1);

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