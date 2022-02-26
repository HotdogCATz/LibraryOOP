
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

//HEllo
public class LibraryBook extends Book {
    private boolean availForBowrow;

    public boolean isAvailable(Library b) {
        
        return availForBowrow;
    }

    public boolean setBookAvailableFalse() {
        return this.availForBowrow = false;
    }

    public boolean setBookAvailableTrue() {
        return this.availForBowrow = true;
    }


}
