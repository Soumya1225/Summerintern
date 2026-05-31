package Book;

import Book.dao.BookDAO;
import Book.dao.BookDAOImpl;
import Book.model.Book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookDAO dao = new BookDAOImpl();

        while (true) {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    dao.addBook(
                            new Book(title, author, price)
                    );

                    break;

                case 2:

                    dao.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    dao.updateBook(
                            new Book(id, newTitle, newAuthor, newPrice)
                    );

                    break;

                case 4:

                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();

                    dao.deleteBook(deleteId);

                    break;

                case 5:

                    System.out.println("Application Closed");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}