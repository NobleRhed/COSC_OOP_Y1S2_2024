import java.util.Scanner;
import assign2.Q1stack;
import assign2.Q2Cycle.Solution;
import assign2.Q3QueueArray;

public class Main {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter text with brackets
        System.out.println("Write something with brackets to check if you remembered to close your brackets:");
        String input = scanner.nextLine(); // Read the user input

        Q1stack brackChecker = new Q1stack(); //instance of Q1stack's bracketCheck

        //Validates input for proper bracket use, if all works as expected
        //if the brackets are closed correctly, it will return true, else false
        boolean isValid = brackChecker.bracketCheck(input);

        //use the bool value to decide what print statement to display
        if (isValid) {
            System.out.println("Your string with brackets is valid");
        } else {
            System.out.println("Invalid brackets!");
        }

        //instance from Q2Cycle for a looping cycle check
        Solution answer = new Solution();

        // Example without a cycle
        Solution.Node head1 = new Solution.Node(1);
        head1.next = new Solution.Node(2);
        head1.next.next = new Solution.Node(3);
        System.out.println("List head1 is looping? " + answer.containsCycle(head1)); // Should print false

        // Example with a cycle
        Solution.Node head2 = new Solution.Node(1);
        head2.next = new Solution.Node(2);
        head2.next.next = new Solution.Node(3);
        head2.next.next.next = head2; // Creates a looping cycle
        System.out.println("List head2 is looping? " + answer.containsCycle(head2)); // Should print true

        scanner.close(); // close scanner


        Q3QueueArray queue = new Q3QueueArray(5);



    }
}
