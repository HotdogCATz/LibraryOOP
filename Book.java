
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
    //     // Return true if the book is available, false otherwise
    //     if (bookIs)
    //     return b.isAvailable();
    // }

}