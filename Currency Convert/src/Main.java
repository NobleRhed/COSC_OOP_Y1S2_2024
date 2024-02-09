/*
Name: Benjamin Langhammer
StID: 100941988
DMY: 07-02-2024
Currency conversion application
*/

//Imports validation exception, scanner and currencies package
import Currencies.*;
import java.util.Scanner;

public class Main {
//My array to hold instances of currency classes for conversion
    private static final currency[] globalCurrencies = {
            new canadianDollar(),
            new usDollar(),
            new chineseYuan(),
            new britPound(),
            new japYen()
    };
    //Converts the given amount of money from one currency to another. Takes the value and reverts to base CAD,
    //then uses established exchange rates found on each class to convert out
    private static double conversion(int fromValue, int toValue, double moneyIn) {
        currency startRate = globalCurrencies[fromValue - 1];
        currency endRate = globalCurrencies[toValue - 1];

        double amountInCAD = endRate.toCAD(moneyIn);

        return startRate.fromCAD(amountInCAD);
    }
    public static void main(String[] args) {
        System.out.println("""
                Currency Conversion! We support currently 5 different countries:
                Canadian Dollar CAD
                American Dollar USD
                Chinese Yuan RMB
                British Pound GBP
                and Japanese Yen JPY\s""");
        System.out.println("We start with your currency on you and you decide what country to compare it to!" +
                "\n Now lets get started!");
        //Use scanner to get input
        Scanner askForInput = new Scanner(System.in);
        //Loop state is set
        boolean loop = true;
        while (loop) {

            //Visual list for user to select starting value
            System.out.println("""
                    Select starting currency:
                     1: CAD$
                     2: USD$
                     3: RMB¥
                     4: GBP£
                     5: JPY¥""");
            //User's input for currency origin value
            try {

                int userIn = askForInput.nextInt();
                if (userIn > 5 || userIn < 1) {//make sure input is within selection
                    System.out.println("Selection must be between 1-5");
                    continue;//Go back to start
                }
                //List for output value
                System.out.println("""
                        Select converted currency
                         1: CAD$
                         2: USD$
                         3: RMB¥
                         4: GBP£
                         5: JPY¥""");
                //User's input for currency destination value
                int userOut = askForInput.nextInt();
                if (userOut > 5 || userOut < 1) { //make sure input is within selection
                    System.out.println("Selection must be between 1-5");
                    continue;//Go back to start
                }
                //User's input for the money's value

                System.out.println("So uh... Just how much money are we talking about?");
                double cashValue = askForInput.nextDouble();
                if (cashValue < 0) {//Make sure positive number entered
                    System.out.println("Selection must be a positive number!");
                    continue; //Go back to start
                }

                //conversion function used to get correct value
                System.out.println("Let's see what its worth!");
                double conversionFinal = conversion(userIn, userOut, cashValue);
                if (userOut == 5) {
                    //JPY has no decimals, if JPY is the final value no decimals
                    System.out.printf("Final total: %.0f ¥", conversionFinal);
                    //end loop
                    loop = false;
                } else if (userOut == 1 || userOut == 2)  {
                    //else print final value to 2 decimal points include dollar unit
                    System.out.printf("Final total: %.2f $", conversionFinal);
                    //end loop
                    loop = false;
                } else if (userOut == 4) {
                    //else print final value to 2 decimal points include pound unit
                    System.out.printf("Final total: %.2f £", conversionFinal);
                    //end loop
                    loop = false;
                } else {
                    //else print final value to 2 decimal points include Yuan/Yen unit
                    System.out.printf("Final total: %.2f ¥", conversionFinal);
                    //end loop
                    loop = false;
                }

            }
            catch (Exception e) { //If not a number, return error and try again
                System.out.println("Error: Must be a number inside the ranges provided \nNo letters or special characters permitted!");
                askForInput.nextLine(); //Clears the value, otherwise loop goes on and on


            }

        }
        //close scanner
        askForInput.close();
    }

}