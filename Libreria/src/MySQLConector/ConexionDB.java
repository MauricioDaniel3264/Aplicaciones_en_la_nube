/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQLConector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ConexionDB {
    
    public static Connection con;
    private static final String driver = "com-mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/libros";
    
    public Connection conectar(){
    con = null;
    try{
        con = (Connection) DriverManager.getConnection(url, user, pass);
        if(con != null){
            
        }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error" + e.toString());
    }
    return con;
    }
}
