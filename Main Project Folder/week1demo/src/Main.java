//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Missing code to run correctly, this was just example code.
//consider practice further, look for methods to make what we did still work.
//Prof mentioned could just be additional work we will revisit next class

import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void dataTypes () {
        int i = 123456789;
        double d;
        String s;
        boolean b;

        d=1.23456789;
        s="string";
        b=true;

        System.out.println("Integer i =" + i);
        System.out.println("Double d =" + d);
        System.out.println("string s =" + s);
        System.out.println("Boolean b =" + b);

    }

    public static void standardInputOutput() throws IOException {
        InputStreamReader inp = null;
        inp = new InputStreamReader(System.in);

        System.out.println("Enter characters, "
                + " and '0' to quit");
        char c;
        do {
            c = (char) inp.read();
            System.out.println(c);
        } while (c != '0');
    }

}