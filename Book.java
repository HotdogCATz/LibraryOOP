
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

public class Book extends Library {
    protected String isbn; // search book isbn; it's unique code number of book
    protected String title; // Name Book
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOFPages;
    private int currentPageNumber;

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
        return "Token: " + isbn + "Title: " + title + "Author: " + author + "Publisher: " + publisher
                + "numberOFPages: " + numberOFPages + "Year:"
                + year;
    }

}