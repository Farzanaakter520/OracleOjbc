import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private Connection getConnection() throws SQLException{
        return OracleConnection.getConnetion();
    }

    public void addBook(Book book){
        String sql = "INSERT INTO Books (title, author, price, available) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setDouble(3,book.getPrice());
            stmt.setBoolean(4,book.isAvailable());
            stmt.executeUpdate();
            System.out.println("");
        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public Book getBookById(int id){
        String sql = "SELECT * FROM Books WHERE id = ?";

        try(Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){

        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }

    public List<Book>getAllBooks(){
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM Books";

        try(Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()) {
                books.add(new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("auther"),
                        rs.getDouble("price"),
                        rs.getBoolean("available")
                ));

            }
        }catch (SQLException e){
        System.out.println("Error " + e.getMessage());
    }
        return null;
}

}
