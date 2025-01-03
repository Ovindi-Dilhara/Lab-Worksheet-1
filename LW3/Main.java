package Answers;

public class Main {
    
    public static void main(String[] args) {

        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        Library library = new Library();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        library.displayLibraryInfo();
        library.listAvailableItems();
        library.checkoutItem("Island of a Thousand Mirrors");
        library.listAvailableItems();
        library.displayLibraryInfo();
        
    }
}