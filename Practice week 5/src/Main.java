import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        String[] countries = new String[3];
        countries[0] = "Canada";
        countries[1] = "England";
        countries[2] = "Mexico";

        System.out.println(countries[countries.length-1]);

        List<String> countriesList = new ArrayList<>();
        countriesList.add("Canada");
        countriesList.add("England");
        countriesList.add("Mexico");

        System.out.println(countriesList);
        System.out.println(countriesList.getLast());

        countriesList.add("Egypt");
        System.out.println(countriesList);


        List<String> newCountriesList = Arrays.asList(countries);
        System.out.println(newCountriesList);

    }
}