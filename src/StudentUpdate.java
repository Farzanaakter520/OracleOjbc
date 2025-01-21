import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdate extends OracleConnection {
    public void updateStudent(Student student){
        String sql = "UPDATE studentjdbc1 SET name = ? WHERE id = ?";
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement stmt = connection.prepareStatement(sql)){


            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getId());


            int rowsAffected = stmt.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Name update successfully ");
            }else {
                System.out.println("Not Found ");
            }
        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }
    }



}
