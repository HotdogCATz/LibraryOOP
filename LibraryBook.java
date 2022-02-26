
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

public class LibraryBook extends Book {
    private boolean availForBowrow;

    public boolean isAvailable() {
        return availForBowrow;
    }

    public void setBookAvailableFalse() {
        availForBowrow = false;
    }

    public void setBookAvailableTrue() {
        availForBowrow = true;
    }
}
