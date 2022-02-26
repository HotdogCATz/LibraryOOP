//64050231 วุฒิชัย ปัดไธสง
//64050229 วิศว์ ศิริวัฒน์
//64050108 ธนวัฒน์ เขียวขจี
public class Main {

    public static void main(String[] args){
        //Create Object Library.java
        Library library = new Library();
        library.BufferedReader();

        //Print test
        library.printCatalog();
        library.checkOut(library.getBookByIndex(0), 2022, 5, 23);
        library.checkOut(library.getBookByIndex(0), 2022, 5, 23);
        System.out.println("Day: "+library.returnitem(library.getBookByIndex(0), 2022, 6, 10));
        System.out.println("Day: "+library.returnitem(library.getBookByIndex(1), 2022, 6, 10));
        library.printCatalog();
        library.printBorrowMap();
    }
}