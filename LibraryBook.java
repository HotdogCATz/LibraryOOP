
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์

public class LibraryBook extends Book {
    private boolean availForBowrow;

    private boolean isAvailable(){
        
        return availForBowrow;
    }

    public boolean setBookAvailableFalse() {
        return availForBowrow = false;
    }

    public boolean setBookAvailableTrue() {
        return availForBowrow = true;
    }
}
