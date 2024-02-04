/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComboBox;

import MySQLConector.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class RellenarCombos {
    public void RellenarComboNombre(String tabla, String valor, JComboBox combo){
        String sql = "select *from " + tabla;
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.conectar();
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR" + e.toString());
        }
    
    }
    
    public void RellenarComboGenero(String tabla, String valor, JComboBox combo){
        String sql = "select *from " + tabla;
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.conectar();
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR" + e.toString());
        }
    }
    
    public void RellenarComboIdioma(String tabla, String valor, JComboBox combo){
        String sql = "select *from " + tabla;
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.conectar();
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR" + e.toString());
        }
    }
    
    public void RellenarComboModificarGenero(String tabla, String valor, JComboBox combo){
        String sql = "select *from " + tabla;
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.conectar();
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                combo.addItem(rs.getString(valor));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR" + e.toString());
        }
    }
}
