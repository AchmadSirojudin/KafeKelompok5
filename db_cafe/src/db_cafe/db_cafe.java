/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_cafe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eldi
 */
public class db_cafe {
    Connection con;
    Statement st;
    ResultSet rs;
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
            System.out.println("GAGAL");
        }
    }
    
    public ResultSet selectDB(){
        try {
            String sql = "select * from stok";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void insertnamastok(String nama){
        try {
            String sql = "insert into stok values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, nama);
            ps.setInt(3, 0);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletenamastok(String nama){
        try {
            String sql = "delete from stok where nama_stok=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertstok(String nama, String jumlah,String tanggal){
        try {
            String sql = "insert into detail_stok values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, nama);
            ps.setString(3, jumlah);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
