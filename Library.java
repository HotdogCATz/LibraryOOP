
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
import java.io.Console;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class Library implements BorrowAble {
    //หนีงสือที่ถุกยืม
    private HashMap<String, LocalDate> borrowHM = new HashMap<String, LocalDate>();
    //หนังสือทั้งหมด
    private ArrayList<Book> allBooks = new ArrayList<Book>();

    public void setbookToLibrary(Book b) {
        allBooks.add(b);
    }

    public Book getbookByIndex(int i) {
        return allBooks.get(i);
    }
    //แสดงหนังสือทั้งหมดและหมวดหมู่หนังสือ
    public void printCatalog() {
        System.out.println("\u001B[32m----------- Catalog -----------\u001B[0m");
        //ถ้าไม่มีหนังสือที่ถูกยืมให้ออกจาก method
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
    }
    //แสดงข้อมูลหนังสือที่ถูกยืม
    public void printBorrowMap() {
        System.out.println("\u001B[32m----------- BorrowMap -----------\u001B[0m");
        //ถ้าไม่มีหนังสือที่ถูกยืมให้ออกจาก method
        if (borrowHM == null) {
            System.out.print("Dont have book Borrow!!");
            return;
        }
        for (String bn : borrowHM.keySet()) {
            System.out.println("Title: " + bn + " Date: " + borrowHM.get(bn));
        }
    }
    // Interface
    //ยืมหนังสือ
    @Override
    public boolean checkOut(Book b, int yy, int mm, int dd) {
        System.out.println("\u001B[32m----------- Borrow the book -----------\u001B[0m");
        //check ว่าเป็นหนังสือ LibraryBook ที่สามารถยืมได้
        if (b instanceof LibraryBook) {
            System.out.println("borrow Book name: " + b.title);
            LibraryBook lb = (LibraryBook) b;
            lb.setBookAvailableTrue();
            //add Hashmap
            borrowHM.put(b.title, LocalDate.of(yy, mm, dd));
            return true;
        } else {
            System.out.println("can't borrow  Book name: " + b.title);
            return false;
        }
    }
    // returnbook เช็คว่าอยู่ในหนังสือที่ยืมไหม ถ้าอยู่ก็เช็ควันที่ยืมคำนวณวันคืนจะ return ค่า day ออกไป
    @Override
    public int returnitem(Book b, int yy, int mm, int dd) {
        System.out.println("\u001B[32m-----------return the book-----------\u001B[0m");
        LibraryBook lb = (LibraryBook) b;
        int d = 0;
        //check ว่ายืมได้ไหม
        if (lb.isAvailable()) {
            lb.setBookAvailableFalse();
            //คำนวณจำวันที่ยืม
            d = (int) borrowHM.get(b.title).until(LocalDate.of(yy, mm, dd), ChronoUnit.DAYS);
            System.out.println("returm this Book: " + b.title);
            borrowHM.remove(b.title);
        } else {
            System.out.println("dont have borrow this Book: " + lb.title);
        }
        return d;
    }
}
