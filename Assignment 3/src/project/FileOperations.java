package project;

//imports
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileOperations {
    public void writeFile(String filename, String content) throws IOException {
        File textdoc = new File("data.txt"); //write to data.txt
        if (!textdoc.exists()) { //If no txt doc, make one
            boolean created = textdoc.createNewFile();
            if (!created) { //error catch if file cannot be created for any reason
                throw new IOException("File" + textdoc + "cannot be created");
            }
        }

        // Implement write logic
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
        }
    }

    public String readFile(String filename) throws IOException {
        // Implement read logic - use StringBuilder to collect the
        // lines of text in the file. Discovered via stack overflow as
        // a recommendation to more efficient way to create string in memory
        // ref: https://stackoverflow.com/a/28613262.

        StringBuilder content = new StringBuilder();
        // a recommended alternative for StringBuffer, designed apparently for use
        // as a drop-in replacement for it. Allows for more efficient creation of
        // string in memory.
        // Found here ref: https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            //Read file line by line until end of file is reached
            String line;
            while ((line = br.readLine()) != null)  {
                content.append(line);
                content.append(System.lineSeparator());
                //lineSeparator is the OS version of \n.
                // Also a way for once you reach end of line of text,
                // start next line down. ref: https://docs.oracle.com/javase/9/docs/api/java/lang/System.html#lineSeparator--
            }
        }
        return content.toString();
    }
}
