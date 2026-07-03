import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceHandler {
    public void readFile() {
        // Try-with-resources automatically closes the reader resource safely
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}
