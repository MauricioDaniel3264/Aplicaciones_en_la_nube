/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedor;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class Conexion {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("org.mariadb.jdbc.Driver");

            // Establecer la conexión
            String url = "jdbc:mariadb://localhost:3306/libreria";
            String usuario = "root";
            String contraseña = "";

            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("¡Conexión exitosa!");

            // Realizar operaciones con la base de datos aquí

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Manejo de errores
        } finally {
            // Cerrar la conexión en el bloque finally para garantizar que se cierre incluso si ocurre un error
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
