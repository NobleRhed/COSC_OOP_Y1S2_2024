package com.practice;

public class main {
    public static void Main(String[] args) throws IOException {
        arrayExample();
    }
}
public static void arrayExample() {
    int[] arrayNum = {-10, 3, 27, 8, -34, 76, 1, 12};
    int sum = 0;
    double average = 0;

    for (int num:arrayNum) {
        sum = sum + num;
    }

    average = (double) sum/arrayNum.length;
    //double is needed to make the exact value display, as INT has no decimal

    System.out.println("The sum is - "+ sum + " and the average is - " + average);
}



