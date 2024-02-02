import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a whole number. NO DECIMALS!");
        int kbIn = userInput.nextInt();


        userInput.close();

        if (kbIn % 2 == 0) {
        System.out.println("Even");

        } else {
        System.out.println("Odd");
        }
    }

}

