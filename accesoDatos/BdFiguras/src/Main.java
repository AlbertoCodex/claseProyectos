import java.sql.Connection;
import java.sql.DriverManager;
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
        conex[0] = "jdbc:mysql://localhost:3306/bdfiguras";
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
            System.out.println("1- Introducir 10 rectangulos");
            System.out.println("2- Listar el contenido de la tabla");
            System.out.println("3- Listar el contenido al revés");
            System.out.println("0- Salir");
            x = sc.nextInt();
            switch (x){
                case 1:
                    addRectangulo(conex);
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }

        }
    }

    public static void addRectangulo(String[] conex) throws SQLException {
        int codigo, base, altura;
        Connection c = DriverManager.getConnection(conex[0], conex[1], conex[2]);
        try (Statement s = c.createStatement()) {
            for (int i = 0; i < 10; i++) {
                codigo = i;
                base = (int) (Math.random() * 10+1);
                altura = (int) (Math.random() * 10+1);
                s.execute("INSERT INTO rectangulos " +
                        "(codigo, base, altura) VALUES ('" + codigo + " ', '" + base + "' , ' " + altura + "')");
            }
        }
    }
}