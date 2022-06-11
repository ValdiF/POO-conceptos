/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.java_CRUD_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author valdi
 */
public class DB_Connect {
    
    Connection con;
    
    final String driver="com.mysql.cj.jdbc.Driver";
    final String connect="jdbc:mysql://localhost:3306/java_crud";
    final String usuario="root";
    final String psw="";
    
    public DB_Connect(){
        try {
            Class.forName(driver);
            try {
                con=DriverManager.getConnection(connect, usuario, psw);
            } catch (SQLException ex) {
                Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Se ha conectado con éxito");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Connection getConnection(){
        return con;
    }
}
