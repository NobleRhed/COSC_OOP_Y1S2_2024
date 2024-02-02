import org.dc.java.Bicycle;
import org.dc.java.Vehicle;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bicycle();
        Vehicle v2 = new Car(numberOfWheels: 4);
        v2 = v;
        v2.howDoesItRun();
    }

    public void initializeArray(int size) {
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++)
            intArray[i] = i + 1;
        int sum = findSum(intArray);

        System.out.println("Sum of the sequence is: " + sum);
    }

    public static void findSum() {
        int sum = 0;


        //provide some values for the array
        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(intArray);
        }
    }

    public static void studentHelper() {
        List<Student> listOfStudents = new ArrayList<>();

        Student student1 = new Student();
        student1.hasHair = false;
        student1.setGender("Male");
        student1.setId("1");
        student1.setFirstName("Dude");
        student1.setLastName("McCool");

        System.out.println("First name of the student is : " + student1.getFirstName());
        Student student2 = new Student();
        student2.hasHair = true;
        student2.setGender("Male");
        student2.setId("2");
        student2.setFirstName("John");
        student2.setLastName("Doe");

        System.out.println("First name of the student is : " + student2.getFirstName());
        Student student3 = new Student();
        student3.hasHair = true;
        student3.setGender("Female");
        student3.setId("3");
        student3.setFirstName("Big");
        student3.setLastName("Lady");

        System.out.println("First name of the student is : " + student3.getFirstName());

        listOfStudents.add(student2);
        listOfStudents.add(student1);
        listOfStudents.add(student3);

        for (int i=0; i< listOfStudents.size(); i++) {
            System.out.println("Name of student is : " + listOfStudents.get(i).getFirstName());
        }
    }
}