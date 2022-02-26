
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

public class LibraryArchive extends Book{

    //constructor
    //String isbn input
    public LibraryArchive(String isbn, String title, String author, String publisher, int year, int numberOfPages){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }
    // int isbn input
    public LibraryArchive(int isbn, String title, String author, String publisher, int year, int numberOfPages){
        //Convert isbn to string
        this.isbn =  String.valueOf(isbn);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
