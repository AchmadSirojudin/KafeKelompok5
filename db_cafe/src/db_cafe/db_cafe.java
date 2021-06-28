/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_cafe;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eldi
 */
public class db_cafe {
    Connection con;
    Statement stm;
    ResultSet st;
    PreparedStatement ps;
    
    public void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cafe","root","");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(String nama, String password, 
                       String alamat, String jenisKelamin, String status){
        try {
            String sql = "insert into pegawai values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, nama);
            ps.setString(5, password);
            ps.setString(4, alamat);
            ps.setString(3, jenisKelamin);
            ps.setString(6, status);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("GAGAl");
        }
    }
}
