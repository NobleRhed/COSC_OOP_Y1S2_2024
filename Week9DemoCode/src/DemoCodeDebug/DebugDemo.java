package DemoCodeDebug;

import java.util.ArrayList;
import java.util.List;

public class DebugDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Aloha";
        String str3 = "Hi";

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add(str1);
        listOfStrings.add(str2);
        listOfStrings.add(str3);

        for (String string: listOfStrings) {
            String firstThree = string.substring(0,3);
            System.out.println(firstThree);
        }
    }
}