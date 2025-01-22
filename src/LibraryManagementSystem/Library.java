package LibraryManagementSystem;

//import Books.Book;
//import Books.OracleConnection;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Library {
//    private Connection getConnection() throws SQLException {
//        return OracleConnection.getConnection();
//    }
//
//    public void BookList(BookMenu library) {
//        String sql = "INSERT INTO Books (title, author, year, numberOfPages, price) VALUES (?, ?, ?, ?, ?)";
//        try (Connection conn = getConnection();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, library.getTitle());
//            stmt.setString(2, library.getAuthor());
//            stmt.setInt(3,library.getYear());
//            stmt.setInt(4,library.getNumberOfPages());
//            stmt.setDouble(3, library.getPrice());
//
//            stmt.addBatch();
//            System.out.println("Book added successfully ");
//        } catch (SQLException e) {
//            System.err.println("Error " + e.getMessage());
//        }
//    }




