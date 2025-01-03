package Answers;

import java.util.ArrayList;
import java.util.List;

public class Library {
    
    private List<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equals(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void listAvailableItems() {
        System.out.println("Available Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Total Items: " + borrowableItemsList.size());
        System.out.println("Available Items: " + availableCount);
    }
}