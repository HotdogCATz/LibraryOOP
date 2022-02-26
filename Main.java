//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        // create library
        Library library = new Library();
        // read File ClassicBookList.txt
        Path inFilebook = Paths.get(".", "ClassicBookList.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader s = Files.newBufferedReader(inFilebook, charset)) {
            String line;
            while ((line = s.readLine()) != null) {
                LibraryBook b = new LibraryBook();
                // Add title to the ArrayList
                String[] title = line.split(",");
                b.isbn = title[0];
                b.title = title[1];
                b.author = title[2];
                b.publisher = title[3];
                b.year = Integer.parseInt(title[4]);
                b.numberOFPages = Integer.parseInt(title[5]);
                library.setbookToLibrary(b);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        // read File ArchiveList.txt
        Path inFileArchive = Paths.get(".", "ArchiveList.txt");
        try (BufferedReader s = Files.newBufferedReader(inFileArchive, charset)) {
            String line;
            while ((line = s.readLine()) != null) {
                LibraryArchive b = new LibraryArchive();
                // Add title to the ArrayList
                String[] title = line.split(",");
                b.isbn = title[0];
                b.title = title[1];
                b.author = title[2];
                b.publisher = title[3];
                b.year = Integer.parseInt(title[4]);
                b.numberOFPages = Integer.parseInt(title[5]);
                library.setbookToLibrary(b);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        // All book
        library.printCatalog();
        // Borrow book
        library.checkOut(library.getbookByIndex(0), 2002, 9, 20);
        library.checkOut(library.getbookByIndex(3), 2002, 9, 20);
        library.printBorrowMap();
        // return Book
        System.out.println("Day: " + library.returnitem(library.getbookByIndex(0), 2022, 9, 30));
        System.out.println("Day: " + library.returnitem(library.getbookByIndex(2), 2002, 9, 30));
        // print Borrow book
        library.printBorrowMap();
    }
}