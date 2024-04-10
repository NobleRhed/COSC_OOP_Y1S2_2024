//Benjamin Langammer
//100941988
//09-04-24 (D-M-Y)
//Assignment 3 - DataStructureFileIO project



import project.CustomDataStructureException;
import project.DataStructures;
import project.FileOperations;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Intro message for the user with menu to follow
        System.out.println("""
                Welcome to Assignment 3 - The Data Structure Demonstration Program!
                Here we can showcase our abilities to Save/Remove/Display from 3 Data Structure types
                - LinkedList
                - Stack
                - and Queue!
                and provide a demonstration of File Write and Read!
                Be sure to either start with adding data to the data structures
                or by selecting Demo Data to send in default values""");
        //Create an instance of DataStructures
        DataStructures dataStructures = new DataStructures();
        //Scanner to be used to capture user input
        Scanner scanner = new Scanner(System.in);
        boolean loop = true; //loop control with Main Menu and its options
        while (loop) {
            System.out.println("""
                    |||MAIN MENU|||
                    Choose a Data Structure to manipulate:
                    1: LinkedList
                    2: Stack
                    3: Queue
                    4: File Operations
                    5: Send in Default Values
                    6: Exit""");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            //I wanted a more simple method to make multiple options and have them rep separate code blocks,
            // so I read up on Switch & Cases on W3 (https://www.w3schools.com/java/java_switch.asp)
            switch (choice) {
                case 1:
                    menuLinkedList(dataStructures.linkedList, scanner);
                    break;
                case 2:
                    menuStack(dataStructures.stack, scanner);
                    break;
                case 3:
                    menuQueue(dataStructures.queue, scanner);
                    break;
                case 4:
                    fileOperationsMenu(scanner);
                    break;
                case 5:
                    sendDefaultsIn(dataStructures);
                    System.out.println("Defaults applied!");
                    break;
                case 6:
                    System.out.println("Thank you for using our demonstration program! \nI hope everything was to your satisfaction. ");
                    loop = false;
                    break;
                default: //The above represent each option in the menu, and the default is my validation catch - if no match, print error
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
        scanner.close(); //Scanner closed
    }

    //Following methods handle LinkedList, Stack, and Queue. Similar structure for each with a menu, options to execute the selected operation,
    //and handle exceptions when necessary
    private static void menuLinkedList(DataStructures.assignedLinkedList linkedList, Scanner scanner) {
        boolean menu1 = true;
        while (menu1) {
            System.out.println("LinkedList Operations: 1: Add, 2: Remove, 3: Display, 4:Main Menu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Add
                    System.out.print("Enter integer to add: ");
                    int toAdd = scanner.nextInt();
                    linkedList.insert(toAdd);
                    break;
                case 2: // Remove
                    try {
                        linkedList.remove();
                        System.out.println("First element removed.");
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3: // Display
                    try {
                        linkedList.display();
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4: //Exit submenu
                    System.out.println("Returning to Main Menu");
                    menu1 = false;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }
    //Method to send in defaults for rapid testing purposes
    private static void sendDefaultsIn(DataStructures dataStructures) {
        FileOperations fileOps = new FileOperations();
        int[] elements = {5, 8, 13, 14, 25};
        // Insert array into LinkedList, Stack, and Queue

        dataStructures.linkedList.insertArray(elements);
        dataStructures.stack.pushArray(elements);
        dataStructures.queue.enqueueArray(elements);
        System.out.println("Default values of " + Arrays.toString(elements) + "added successfully");
        //Used arrays.toString to print values inside array. ref: https://www.geeksforgeeks.org/how-to-convert-an-array-to-string-in-java/

        try {
            fileOps.writeFile("data.txt", "John Jacob Jingle Himershmidt");
            System.out.println("Message 'John Jacob Jingle Himershmidt' written to file successfully.");
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }
    }
    private static void menuStack(DataStructures.assignedStack stack, Scanner scanner) {
        boolean menu2 = true;
        while (menu2) {
            System.out.println("Stack Operations: 1: Push, 2: Pop, 3: Display, 4: Main Menu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Push
                    System.out.print("Enter integer to push: ");
                    stack.push(scanner.nextInt());
                    break;
                case 2: // Pop
                    try {
                        stack.pop();
                        System.out.println("Top element popped.");
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3: // Display
                    try {
                        stack.display();
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4: //Exit submenu
                    System.out.println("Returning to Main Menu");
                    menu2 = false;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
                }
            }
        }


    private static void menuQueue(DataStructures.assignedQueue queue, Scanner scanner) {
        boolean menu3 = true;
        while (menu3) {
            System.out.println("Queue Operations: 1: Enqueue, 2: Dequeue, 3: Display, 4: Main Menu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Enqueue
                    System.out.print("Enter integer to enqueue: ");
                    queue.enqueue(scanner.nextInt());
                    break;
                case 2: // Dequeue
                    try {
                        queue.dequeue();
                        System.out.println("Front element dequeued.");
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3: // Display
                    try {
                        queue.display();
                    } catch (CustomDataStructureException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4: //Exit submenu
                    System.out.println("Returning to Main Menu");
                    menu3 = false;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }

    // File Operations submenu to demonstrate writing to and reading from a file.
    // The user is prompted for input when writing, and the content is displayed when reading.
    //File is started as data.txt like what was found in the FileOperations class
    private static void fileOperationsMenu(Scanner scanner) {
        FileOperations fileOps = new FileOperations();
        boolean menu4 = true;
        while (menu4) {
            System.out.println("File Operations: 1: Write to File, 2: Read File, 3: Main Menu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Write to file
                    System.out.print("Enter a message to write to the file: ");
                    scanner.nextLine(); // Consume newline left-over
                    String message = scanner.nextLine();
                    try {
                        fileOps.writeFile("data.txt", message);
                        System.out.println("Message written to file successfully.");
                    } catch (IOException e) {
                        System.err.println("Failed to write to file: " + e.getMessage());
                    }
                    break;
                case 2: // Read from file
                    try {
                        String content = fileOps.readFile("data.txt");
                        System.out.println("File content: " + content);
                    } catch (IOException e) {
                        System.err.println("Failed to read the file: " + e.getMessage());
                    }
                    break;
                case 3: //Exit submenu
                    System.out.println("Returning to Main Menu");
                    menu4 = false;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }
}
