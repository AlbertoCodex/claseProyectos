import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc:mysql://localhost:3306/?user=root";
        try (Connection c = DriverManager.getConnection(urlConnection)) {
            System.out.println("Conexion realizada");
        }
    }
}