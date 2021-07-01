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
    
    public ResultSet selectnamastok(){
        try {
            String sql = "select * from stok";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet selectpegawai(){
        try {
            String sql = "select * from pegawai";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet selectstok(){
        try {
            String sql = "select * from stok inner join detail_stok on detail_stok.id_stok = stok.id_stok where detail_stok.id_detail_stok";
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
    
    public void deletepegawai(String nama){
        try {
            String sql = "delete from pegawai where username=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nama);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletestok(String idD){
        try {
            String sql = "delete from detail_stok where id_detail_stok=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, idD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatepegawai(String id,String nama,String password,
                              String jeniskelamin,String alamat,
                              String status){
        try {
            String sql = "update pegawai set username=?,jenis_kelamin=?,alamat=?,password=?,status=? where id_pegawai=?";
            ps = con.prepareStatement(sql);
            ps.setString(6, id);
            ps.setString(1, nama);
            ps.setString(4, password);
            ps.setString(3, alamat);
            ps.setString(2, jeniskelamin);
            ps.setString(5, status);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatedstok(String jumlah, String idB, String nama){
        try {
            String sql = "update stok set nama_stok=?,jumlah_stok=? where id_stok=?";
            ps = con.prepareStatement(sql);
            ps.setString(3, idB);
            ps.setString(1, nama);
            ps.setString(2, jumlah);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insertdstok(String nama,
                            String tanggal, String idP, 
                            String idB){
        try {
            String sql = "insert into detail_stok values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, idP);
            ps.setString(3, idB);
            ps.setString(4, tanggal);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertstok(String jumlah){
        try {
            String sql = "insert into stok values (?,?,?=\"jumlah_stok + new.jumlah_input\")";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, null);
            ps.setString(3, jumlah); 
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} 
