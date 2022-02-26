
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
public class Main {

    public static void main(String[] args) throws IOException {

        Path inFile = Paths.get(".", "ClassicBookList.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader s = Files.newBufferedReader(inFile, charset)) {
            String line;
            while ((line = s.readLine()) != null) {
                // Add title to the ArrayList
                String[] title = line.split("\\|");
                System.out.println(title[0]);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}