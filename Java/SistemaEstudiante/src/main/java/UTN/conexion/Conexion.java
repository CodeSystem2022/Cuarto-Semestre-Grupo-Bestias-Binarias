package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
        Connection conoxion = null;
        // Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2022";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        // Cargamos el driver de MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conoxion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" Ocurrio un Error al conectar con la base de datos " + e.getMessage());
        } // Fin try-catch
        return conoxion;
    } // Fin  metodo Connection
}
