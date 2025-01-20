import java.sql.*;

public class Book {
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "hr";
    private static final String PASSWORD = "isdb62";

    public void insertDummyData(String[][] Books) {
        String insertQuery = "INSERT INTO Book1 (name, auther_name, genre, price, publish_date) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] Book : Books) {
                preparedStatement.setString(1, Book[0]);
                preparedStatement.setString(2, Book[1]);
                preparedStatement.setString(3, Book[2]);
                preparedStatement.setInt(4, Integer.parseInt(Book[3]));
                preparedStatement.setDate(5, Date.valueOf(Book[4]));

                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println(" Error inserting data : " + e.getMessage());
        }
    }
}
