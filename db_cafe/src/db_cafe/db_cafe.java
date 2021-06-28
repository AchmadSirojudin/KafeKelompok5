/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_cafe;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eldi
 */
public class db_cafe {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql;//localhost/mydb";
    String user = "root";
    String pass = "";
    
    Connection con;
    Statement stmt;
    ResultSet st;
    
    public void koneksi(){
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = (Connection) DriverManager.getConnection(dbURL,user,pass);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
