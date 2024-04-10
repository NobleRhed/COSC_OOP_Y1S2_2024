package project;

//custom exception class to catch errors in DataStructure
// and display custom message
public class CustomDataStructureException extends Exception{
    CustomDataStructureException(String message) {
        super(message);
    }
}
