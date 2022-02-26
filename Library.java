
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class Library implements BorrowAble {

    private HashMap<String, LocalDate> borrowHM = new HashMap<>();
    private ArrayList<Book> allBooks = new ArrayList<>();
    

    //Library library = new Library();
    public void BufferedReader() {
        Path inFile = Paths.get(".", "ClassicBookList.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader s = Files.newBufferedReader(inFile, charset)) {
            String line;
            while ((line = s.readLine()) != null) {
                String[] book = line.replaceAll("\"", "").split(",");
                // Add Book to Library
                LibraryBook bookList = new LibraryBook(book[0], book[1], book[2], book[3], Integer.parseInt(book[4]),
                        Integer.parseInt(book[5]));
                //library.addBook(bookList);
                allBooks.add(bookList);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        Path inFileArchive = Paths.get(".", "ArchiveList.txt");
        try (BufferedReader s = Files.newBufferedReader(inFileArchive, charset)) {
            String line;
            while ((line = s.readLine()) != null) {
                String[] book = line.replaceAll("\"", "").split(",");
                // Add Book to Library
                LibraryArchive bookList = new LibraryArchive(book[0], book[1], book[2], book[3],
                        Integer.parseInt(book[4]), Integer.parseInt(book[5]));
                allBooks.add(bookList);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    // method
    public void addBook(Book b) {
        allBooks.add(b);
    }

    public HashMap<String, LocalDate> getBorrowHM() {
        return this.borrowHM;
    }

    public Book getBookByIndex(int i) {
        return allBooks.get(i);
    }

    public void printCatalog() {
        System.out.println("\u001B[32m----------- Catalog -----------\u001B[0m");
        if (allBooks == null) {
            System.out.print("Dont have book !!");
            return;
        }
        for (Book b : allBooks) {
            if (b instanceof LibraryArchive) {
                System.out.println("Archive Resource : " + b.title);
            } else {
                System.out.println(b.title);
            }
        }
        System.out.println("\u001B[32m-------------------------------\u001B[0m");

    }

    public void printBorrowMap() {
        // Print hashmap of borrow
        System.out.println("\u001B[32m----------- BorrowMap -----------\u001B[0m");
        if (borrowHM.isEmpty()) {
            System.out.println("All book is available to borrow :)");

        } else {
            for (String key : borrowHM.keySet()) {
                System.out.println("Book key " + key + " is borrowed : " + borrowHM.get(key));
            }
        }
        System.out.println("\u001B[32m---------------------------------\u001B[0m");

    }

    // Interface

    @Override
    public boolean checkOut(Book b, int yy, int mm, int dd) { // int d =
                                                              // (int)LocalDateObj1.until(LocalDateObj2,ChronoUnit.DAYS);
        System.out.println("\u001B[32m----------- Borrow the book -----------\u001B[0m");
        // check ว่าเป็นหนังสือ LibraryBook ที่สามารถยืมได้
        if (b instanceof LibraryBook) {
            LibraryBook lb = (LibraryBook) b;
            if (lb.isAvailable()) {
                System.out.println("borrow Book name: " + b.title);
                lb.setBookAvailableFalse();
                // add Hashmap
                borrowHM.put(b.title, LocalDate.of(yy, mm, dd));
            }else{
                System.out.println("same book: "+b.title);
            }
            return true;
        } else {
            System.out.println("can't borrow  Book name: " + b.title);
            return false;
        }

    }

    @Override
    public int returnitem(Book b, int yy, int mm, int dd) {
        boolean sertBook = false;
        System.out.println("\u001B[32m-----------return the book-----------\u001B[0m");
        LibraryBook lb = (LibraryBook) b;
        int d = 0;
        // check มีหนังสือให้คืนไหม
        if (borrowHM != null) {
            for(String key : borrowHM.keySet()){
                if(key == b.title){
                    sertBook = true;
                }
            }
            if(sertBook){
                // คำนวณจำวันที่ยืม
                d = (int) borrowHM.get(b.title).until(LocalDate.of(yy, mm, dd), ChronoUnit.DAYS);
                lb.setBookAvailableTrue();
                System.out.println("returm this Book: " + b.title);
                borrowHM.remove(b.title);
            }else{
                System.out.println("dont have borrow this Book: " + lb.title);
            }
        } else {
            System.out.println("emtry");
        }
        return d;
    }

}
