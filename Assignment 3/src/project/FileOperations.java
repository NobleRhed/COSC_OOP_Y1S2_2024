package project;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileOperations {
    public void writeFile(String filename, String content) throws IOException {
        File textdoc = new File("data.txt");
        if (!textdoc.exists()) {
            boolean created = textdoc.createNewFile();
            if (!created) {
                throw new IOException("File" + textdoc + "cannot be created");
            }
        }

        // Implement write logic
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
        }
    }

    public String readFile(String filename) throws IOException {
        // Implement read logic
        StringBuilder content = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null)  {
                content.append(line);
                content.append(System.lineSeparator());
            }
        }
        return content.toString();
    }
}
