package org.dc.exceptionsDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class exceptionsDemoMulti {
        public static void main(String[] args) {
            try {
                openFile();
                doMath();
            } catch (IOException e){
                System.out.println(e.getMessage());
            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getStackTrace());
            }
        }
    /**
     * Javadoc comment
     */
        public static void doMath(){
            int x = 20;
            int div = 0;
            if (div==0) {
                throw new ArithmeticException();
            }
        }
        public static void openFile() throws IOException{

            try (FileInputStream fos = new FileInputStream("testFile.txt")) {

                String text = "Hello Durham College! This is OOP 1 class";


                System.out.println("Written Successfully to file!");
            }
        }
}

