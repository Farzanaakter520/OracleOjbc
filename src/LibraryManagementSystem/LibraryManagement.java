package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagement {
    static Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1000, 10.00, true),
            new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, 7.99, true),
            new Book("1984", "George Orwell", 1949, 328, 8.99, true)
    };

static void listOfBook(){
    System.out.println(Arrays.toString(books));
    }

    public void borrowBook(Scanner scanner) {
        System.out.println("Enter the title of the book ");
        String title = scanner.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book != null) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("\nYou have successfully borrowed '" + title + "'.");
                } else {
                    System.out.println("\nSorry, '" + title + "' is currently not available.");
                }
            } else {
                System.out.println("\nThe book '" + title + "' does not exist in the library.");
            }
        }
    }

    public void returnBook(Scanner scanner) {
        System.out.println("Enter the title of the book ");
        String title = scanner.nextLine();
        boolean found = false;
        for(Book book : books){
            if (book != null) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have successfully returned " + title);
                } else {
                    System.out.println("The book " + title + " was not borrowed.");
                }
            } else {
                System.out.println("The book " + title + " does not exist in the library.");
            }
        }
    }


    public void mainMenu(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Three options are available ");
            System.out.println("1. List of books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

            System.out.println("Choose an option (1-4): ");
            int Choice = scanner.nextInt();
            scanner.nextLine();

            switch (Choice){
                case 1:
                    listOfBook();
                    break;

                case 2:
                    System.out.println("Enter the title of the book you want to borrow ");
                    String borrowTitle = scanner.nextLine();
                    borrowBook(scanner);
                    break;

                case 3:
                    System.out.println("Enter the title of the book you want to return ");
                    String returnTitle = scanner.nextLine();
                    returnBook(scanner);

                case 4:
                    System.out.println("Exiting the programme");
                    scanner.close();
                    return;

                default:
                    System.out.println("Is not Available");
            }

        }
    }
}

