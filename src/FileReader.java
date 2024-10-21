import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        Path filePath = Paths.get("src", "file.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            lines.stream()
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}