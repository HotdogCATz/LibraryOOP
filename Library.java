
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Library implements BorrowAble {

    private HashMap<String, LocalDate> borrowHM() {
        return null;
    }

    private ArrayList<Book> allBooks() {
        return null;
    }

    // Interface

    LocalDate date;

    @Override
    public boolean checkOut(Book b, int yy, int mm, int dd) { // การนับจำนวนวันใช้ int d
                                                              // =(int)LocalDateObj1.until(LocalDateObj2,ChronoUnit.DAYS);
        return true;
    }

    @Override
    public int returnitem(Book b, int yy, int mm, int dd) {
        return 5;
    }
}
