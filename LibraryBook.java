
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

//HEllo
public class LibraryBook extends Book {
    private boolean availForBorrow = true;
    public LibraryBook(){}

    public LibraryBook(String isbn, String title, String author, String publisher, int year, int numberOfPages) {
        super(isbn, title, author, publisher, year, numberOfPages);
    }
    // isbn int input
    public LibraryBook(int isbn, String title, String author, String publisher, int year, int numberOfPages) {
        // Convert isbn to string
        super(isbn, title, author, publisher, year, numberOfPages);
    }

    Library library = new Library();
    /*
    public boolean isAvailable(Book b) {
        if( b instanceof Library && !((library.getBorrowHM()).containsKey(b.title))){
            setBookAvailableTrue();
        }else{
            setBookAvailableFalse();
        }
        return availForBorrow;
    }*/

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
