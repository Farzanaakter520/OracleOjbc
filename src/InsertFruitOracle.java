import java.sql.*;

public class InsertFruitOracle extends OracleConnection {
    public void insertDummyData(String[][] fruits) {
        String insertQuery = "INSERT INTO fruit_shop (id, name, buyer, seller, price, buydate, selldate) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] fruit : fruits) {
                preparedStatement.setInt(1, Integer.parseInt(fruit[0]));
                preparedStatement.setString(2, fruit[1]);
                preparedStatement.setString(3, fruit[2]);
                preparedStatement.setString(4, fruit[3]);
                preparedStatement.setInt(5, Integer.parseInt(fruit[4]));
                preparedStatement.setDate(6, Date.valueOf(fruit[5]));
                preparedStatement.setDate(7, Date.valueOf(fruit[6]));

                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println(" Error inserting data : " + e.getMessage());
        }
    }
}
