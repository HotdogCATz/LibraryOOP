
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
public class Main extends Library{

    public static void main(String[] args) throws IOException {

        Path inFile = Paths.get(".", "ClassicBookList.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader s = Files.newBufferedReader(inFile, charset)) {
            String line;
            int bookAt = 0;
            while ((line = s.readLine()) != null) {
                // Add book to the ArrayList

                String[] book = line.replaceAll("\"", "").split(",");

				// The Data of the book has 6 columns
                // System.out.println(book[0]);
                // System.out.println(book[1]);
                // System.out.println(book[2]);
                // System.out.println(book[3]);
                // System.out.println(book[4]);
                // System.out.println(book[5]);
                // Add the book to the ArrayList
                p(book[bookAt]);
                bookAt++;

            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}