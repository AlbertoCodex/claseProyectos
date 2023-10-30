import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        String[] conex = conexionBD();
        menu(conex);
    }

    public static String[] conexionBD() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String[] conex = new String[3];
        conex[0] = "jdbc:mysql://localhost:3306/bdejer1";
        System.out.println("Pon el usuario");
        conex[1] = sc.nextLine();
        System.out.println("Pon la contraseña");
        conex[2] = sc.nextLine();
        try (Connection c = DriverManager.getConnection(conex[0], conex[1], conex[2])) {
            System.out.println("Conexion realizada");
            return conex;
        }
    }

    public static void menu(String[] conex) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = -1;
        while (x != 0) {
            System.out.println("1- Introducir una nueva persona");
            System.out.println("2- Listar el contenido de la tabla");
            System.out.println("3- Listar el contenido al revés");
            System.out.println("0- Salir");
            x = sc.nextInt();
            switch (x){
                case 1:
                    addPersona(conex);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        }
    }

    public static void addPersona(String[] conex) throws SQLException {
        Connection c = DriverManager.getConnection(conex[0], conex[1], conex[2]);
        // Continue - Cambiar ejemplo por pedir mediante consola los datos
        try (Statement s = c.createStatement()) {
            s.execute("INSERT INTO personas " +
                    "(DNI, Nombre, Apellidos) VALUES ('12345678A', 'Alberto', 'Naranjo')");
        }
    }
}