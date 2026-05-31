package Book.dao;

import Book.model.Book;

public interface BookDAO {

    void addBook(Book book);

    void viewBooks();

    void updateBook(Book book);

    void deleteBook(int id);
}