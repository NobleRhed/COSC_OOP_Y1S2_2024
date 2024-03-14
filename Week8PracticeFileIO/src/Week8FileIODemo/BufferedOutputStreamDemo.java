package Week8FileIODemo;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class BufferedOutputStreamDemo {
    public static void main(String[] args) {

        String data = "This content is written using Buffered Output stream.";
        String fileName = "BufferedOutputStream.txt";
        handleFile(fileName, data);

    }

    /**
     *
     * @param fileName
     * @param content
     */
    private static void handleFile(String fileName, String content) {
        try (
                // Creates a FileOutputStream
                FileOutputStream file =
                        new FileOutputStream(fileName);

                // Creates a BufferedOutputStream
                BufferedOutputStream output =
                        new BufferedOutputStream(file);) {

            byte[] array = content.getBytes();

            // Writes data to the output stream
            output.write(array);
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}