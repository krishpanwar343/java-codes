import java.io.*;

public class FileOps {
    public static void readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}