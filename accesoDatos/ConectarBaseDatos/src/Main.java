import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el usuario");
        String user = sc.nextLine();
        System.out.println("Pon la contraseña");
        String pwd = sc.nextLine();
        String urlConnection = "jdbc:mysql://localhost:3306";
        try (Connection c = DriverManager.getConnection(urlConnection, user, pwd)) {
            System.out.println("Conexion realizada");
        }
    }
}