import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series till " + terms + " terms:");

        for (int i = 1; i <= terms; ++i) {
            System.out.print(num1 + " ");

            // compute the next term
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
        System.out.println("\nFinal value: " + (num1));
    }
}