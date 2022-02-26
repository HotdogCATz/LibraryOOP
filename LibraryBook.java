
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

//HEllo
public class LibraryBook {
    private boolean availForBorrow ;
    public LibraryBook(){}

    Library library = new Library();
    public boolean isAvailable(Book b) {
        if( b instanceof Library && !((library.getBorrowHM()).containsKey(b.title))){
            setBookAvailableTrue();
        }else{
            setBookAvailableFalse();
        }
        return availForBorrow;
    }

    public boolean setBookAvailableFalse() {
        return this.availForBorrow = false;
    }

    public boolean setBookAvailableTrue() {
        return this.availForBorrow = true;
    }
    public boolean getavailForBorrow(){
        return availForBorrow;
    }


}
