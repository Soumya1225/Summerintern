package Book.dao;

import Book.model.Book;
import Book.util.DBConnection;

import java.sql.*;

public class BookDAOImpl implements BookDAO {

    Connection con = DBConnection.getConnection();

    @Override
    public void addBook(Book book) {

        String sql =
                "INSERT INTO books(title,author,price) VALUES(?,?,?)";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());

            ps.executeUpdate();

            System.out.println("Book Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewBooks() {

        String sql = "SELECT * FROM books";

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | "
                                + rs.getString("title") + " | "
                                + rs.getString("author") + " | "
                                + rs.getDouble("price")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(Book book) {

        String sql =
                "UPDATE books SET title=?, author=?, price=? WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setDouble(3, book.getPrice());
            ps.setInt(4, book.getId());

            ps.executeUpdate();

            System.out.println("Book Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int id) {

        String sql =
                "DELETE FROM books WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}