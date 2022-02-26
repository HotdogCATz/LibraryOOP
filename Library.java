
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class Library implements BorrowAble {

    private HashMap<String, LocalDate> borrowHM() {
        return null;
    }

    public ArrayList<Book> allBooks() {
        return null;
    }

    // Interface

    LocalDate date;

    @Override
    public boolean checkOut(Book b, int yy, int mm, int dd) { // การนับจำนวนวันใช้ int d = (int)LocalDateObj1.until(LocalDateObj2,ChronoUnit.DAYS);
        if(((LibraryBook) b).isAvailable((Library) b)){
            date = LocalDate.of(yy, mm, dd);
            borrowHM().put(b.isbn, date);
            return true;
        }
        return false;
        
    }

    @Override
    public int returnitem(Book b, int yy, int mm, int dd) {
        LocalDate returnDate = LocalDate.of(yy, mm, dd);
        int sumDate = (int)date.until(returnDate, ChronoUnit.DAYS);
        borrowHM().remove(b.isbn);
        return sumDate;
    }
}
