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
        System.out.println("Bruh");
        library.printCatalog();
        library.printBorrowMap();
       
    }
}