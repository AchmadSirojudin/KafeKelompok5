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
import javax.swing.JOptionPane;

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
    
    public void insert(String id,String nama, String password, 
                       String alamat, String jenisKelamin, String status,String absen){
        try {
            String sql = "insert into pegawai values (?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, nama);
            ps.setString(5, password);
            ps.setString(4, alamat);
            ps.setString(3, jenisKelamin);
            ps.setString(6, status);
            ps.setString(7, absen);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("GAGAL");
        }
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
            String sql = "select * from stok";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet selectprodukt(){
        try {
            String sql = "select * from produk ";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet selectproduk(){
        try {
            String sql = "select p.id_produk,nama_produk,harga_produk,id_stok,jumlah_pakai from produk p join detail_produk dp on p.id_produk = dp.id_produk";
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
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
            String sql = "delete from stok where id_stok=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, idD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteproduk(String idD,String nama){
        try {
            String sql = "delete detail_produk from detail_produk inner join produk on (detail_produk.id_produk = produk.id_produk) where produk.id_produk =? and produk.nama_produk=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, idD);
            ps.setString(2, nama);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Harap Muat Ulang Untuk Menghapus Produk", "BERHASIL", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(String idD){
        try {
            String sql = "delete from produk where id_produk=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, idD);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatepegawai(String id,String nama,String password,
                              String jeniskelamin,String alamat,
                              String status,String absen){
        try {
            String sql = "update pegawai set username=?,jenis_kelamin=?,alamat=?,password=?,status=?,jam=? where id_pegawai=?";
            ps = con.prepareStatement(sql);
            ps.setString(7, id);
            ps.setString(1, nama);
            ps.setString(4, password);
            ps.setString(3, alamat);
            ps.setString(2, jeniskelamin);
            ps.setString(5, status);
            ps.setString(6, absen);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatestok(String jumlah, String id, String nama){
        try {
            String sql = "update stok set nama_stok=?,jumlah_stok=? where id_stok=?";
            ps = con.prepareStatement(sql);
            ps.setString(3, id);
            ps.setString(1, nama);
            ps.setString(2, jumlah);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateproduk(String jumlah, String id, String nama,String harga){
        try {
            String sql = "update detail_produk dp inner join produk p on dp.id_produk = p.id_produk set nama_produk=?,harga_produk=?,jumlah_pakai=? where id_detail_produk=?";
            ps = con.prepareStatement(sql);
            ps.setString(4, id);
            ps.setString(1, nama);
            ps.setString(2, harga);
            ps.setString(3, jumlah);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Harap Muat Ulang", "GAGAL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertstok(String nama, int i, String idB) {
        try {
            String sql = "insert into stok values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, idB);
            ps.setString(2, nama);
            ps.setInt(3, i);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(db_cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertkomposisi( int i, String idB, String idP) {
        try {
            
            String query = "insert into detail_produk values (?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setString(2, idP);
            ps.setString(3, idB);
            ps.setInt(4, i);
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Harap Muat Ulang", "GAGAL", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertallproduk(String nama, int j, int i, String idB, String idP) {
        try {
            String sql = "insert into produk values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, idP);
            ps.setString(2, nama);
            ps.setInt(3, j);
            ps.execute();
            ps.close();
            
            String query = "insert into detail_produk values (?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setString(2, idP);
            ps.setString(3, idB);
            ps.setInt(4, i);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Harap Muat Ulang Untuk Menambah Komposisi", "BERHASIL", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Harap Muat Ulang", "GAGAL", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}