import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your first decimal number");
        double val1 = userInput.nextDouble();

        System.out.print("Enter your second decimal number");
        double val2 = userInput.nextDouble();

        System.out.print("Enter your last decimal number");
        double val3 = userInput.nextDouble();

        userInput.close();

        double max = findMax(val1, val2, val3);
        double min = findMin(val1, val2, val3);

        System.out.println("The max value is: " + max);
        System.out.println("The minimum value is: " + min);

    }
    private static double findMax(double a, double b, double c)
    {
        return Math.max(Math.max(a, b), c);

    }

    private static double findMin(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}

