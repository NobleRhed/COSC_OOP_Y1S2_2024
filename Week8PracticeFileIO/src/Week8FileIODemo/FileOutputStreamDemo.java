package Week8FileIODemo;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author MEEEEE!
 * @version 1.0
 *
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String data = "This text was written via output stream.";

        try (FileOutputStream output = new FileOutputStream("outputStream.txt")) {

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);
            System.out.println("Content is written to the sample output stream.");

        }

        catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}