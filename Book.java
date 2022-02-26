
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

public class Book  {
    protected String isbn; // unique code number of book
    protected String title; // Name Book
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOfPages;
    private int currentPageNumber;
    
    //default constructor
    public Book(){}

    public Book(String isbn, String title, String author, String publisher, int year, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }
    // isbn int input
    public Book(int isbn, String title, String author, String publisher, int year, int numberOfPages) {
        // Convert isbn to string
        this.isbn = String.valueOf(isbn);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    public void turnPageForward() {
        currentPageNumber += 1;
    }

    public void turnPageBackward() {
        currentPageNumber -= 1;
    }

    public String getName() {
        return title;
    }

    public int nowATPage() {
        return currentPageNumber;
    }

    @Override
    public String toString() {
        return "Token: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher
                + "\nnumberOFPages: " + numberOfPages + "\nYear: " + year;
    }


    // public boolean getStatus() {
    //     if (bookIs)
    //     return b.isAvailable();
    // }

}