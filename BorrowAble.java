
//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี

public interface BorrowAble {
    public boolean checkOut(Book b, int yy, int mm, int dd);

    public int returnitem(Book b, int yy, int mm, int dd);
}
