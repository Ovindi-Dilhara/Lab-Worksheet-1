package Library;

import Library.books.FictionBook;
import Library.utils.BookUtils;

public class Main {   
    public static void main(String[] args) {
        FictionBook book = new FictionBook("1984", "George Orwell", "Dystopian");
        book.displayInfo();
        System.out.println();

        BookUtils.printBookDetails(book);      
    }  
}