package Library.utils;

import Library.books.FictionBook;

public class BookUtils {

    public static void printBookDetails(FictionBook book) {
        System.out.println("Printing Book Details from Utility Class");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
    }
    
}