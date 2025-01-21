import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentOracle extends OracleConnection {


    public void insertDummyData(String[][] students) {
        String insertQuery = "INSERT INTO studentjdbc1 (name, age, email) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] student : students) {
                preparedStatement.setString(1, student[0]);
                preparedStatement.setInt(2, Integer.parseInt(student[1]));
                preparedStatement.setString(3, student[2]);

                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println(" Error inserting data : " + e.getMessage());
        }
    }

    int id;
    String name;
    int age;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
