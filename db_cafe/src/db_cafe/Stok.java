/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_cafe;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eldi
 */
public class Stok extends javax.swing.JFrame {

    /**
     * Creates new form Stok
     */
    
    Statement stm;
    
    public Stok() {
        db = new db_cafe();
        initComponents();
        tampil_comboB();
        tampil_comboP();
        tampilB();
        tampilP();
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height){
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width){
            frameSize.width = screenSize.width;
        }this.setLocation((screenSize.width - frameSize.width) /  2, 
              (screenSize.height - frameSize.height) / 2);
    }
    public void reset(){
        txt_jumlahbarang.setText(null);
        jDateChooser1.setDate(null);
    }
    
    public void tampil_comboB(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_barang.addItem(rs.getString("id_stok"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampil_comboP(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_pegawai.addItem(rs.getString("id_pegawai"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampilB(){
        try {
            String sql = "Select nama_stok from stok where id_stok='"+cb_barang.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namabarang.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilP(){
        try {
            String sql = "Select username from pegawai where id_pegawai='"+cb_pegawai.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namapegawai.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil_comboB(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_barang.addItem(rs.getString("id_stok"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampil_comboP(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_pegawai.addItem(rs.getString("id_pegawai"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampilB(){
        try {
            String sql = "Select nama_stok from stok where id_stok='"+cb_barang.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namabarang.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilP(){
        try {
            String sql = "Select username from pegawai where id_pegawai='"+cb_pegawai.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namapegawai.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil_comboB(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_barang.addItem(rs.getString("id_stok"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampil_comboP(){
       try{
           String sql = "Select * From detail_stok";
           java.sql.Connection conn = (Connection) koneksi.getConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               cb_pegawai.addItem(rs.getString("id_pegawai"));
               
           }       
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();           
       }catch(Exception e){
           System.out.println("GAGAL");
       }
    }
    
    public void tampilB(){
        try {
            String sql = "Select nama_stok from stok where id_stok='"+cb_barang.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namabarang.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilP(){
        try {
            String sql = "Select username from pegawai where id_pegawai='"+cb_pegawai.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] ob = new Object[1];
            ob[0]=  rs.getString(1);
            
            txt_namapegawai.setText((String) ob[0]);
        }
        rs.close();
	pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Stok.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_change = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_jumlahbarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stok = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
<<<<<<< Updated upstream
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_pendapatan = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
=======
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cb_pegawai = new javax.swing.JComboBox<>();
        cb_barang = new javax.swing.JComboBox<>();
        btn_addNama = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_namabarang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_namapegawai = new javax.swing.JTextField();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/db_cafe/image/add.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/db_cafe/image/home.png"))); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/db_cafe/image/delete.png"))); // NOI18N

        btn_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/db_cafe/image/remake.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(194, Short.MAX_VALUE))
>>>>>>> Stashed changes
=======
                .addContainerGap(194, Short.MAX_VALUE))
>>>>>>> Stashed changes
=======
                .addContainerGap(194, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA BARANG");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JUMLAH BARANG");

        txt_jumlahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahbarangActionPerformed(evt);
            }
        });

        tbl_stok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAMA BARANG", "JUMLAH BARANG", "TANGGAL"
            }
        ));
        jScrollPane1.setViewportView(tbl_stok);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TANGGAL");

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(320, 48));

        jLabel4.setText("PENDAPATAN PERBULAN : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

<<<<<<< Updated upstream
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel3.setText("LOGO");
=======
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID BARANG");
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("NAMA KAFE");

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setForeground(new java.awt.Color(255, 0, 0));
        btn_logout.setText("LOG OUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(btn_logout))
                .addContainerGap(44, Short.MAX_VALUE))
        );
=======
        tbl_stok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PEGAWAI", "NAMA PEGAWAI", "ID BARANG", "NAMA BARANG", "JUMLAH", "TANGGAL"
            }
        ));
        jScrollPane1.setViewportView(tbl_stok);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TANGGAL");
>>>>>>> Stashed changes

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID PEGAWAI");

        cb_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pegawaiActionPerformed(evt);
            }
        });

        btn_addNama.setText("ADD");
        btn_addNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNamaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA BARANG");

        txt_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namabarangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAMA PEGAWAI");

        txt_namapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namapegawaiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID PEGAWAI");

        cb_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pegawaiActionPerformed(evt);
            }
        });

        btn_addNama.setText("ADD");
        btn_addNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNamaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA BARANG");

        txt_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namabarangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAMA PEGAWAI");

        txt_namapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namapegawaiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID PEGAWAI");

        cb_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pegawaiActionPerformed(evt);
            }
        });

        btn_addNama.setText("ADD");
        btn_addNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNamaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA BARANG");

        txt_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namabarangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAMA PEGAWAI");

        txt_namapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namapegawaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txt_jumlahbarang)
                    .addComponent(txt_namabarang))
                .addContainerGap(859, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel6Layout.createSequentialGroup()
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel6Layout.createSequentialGroup()
>>>>>>> Stashed changes
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel6Layout.createSequentialGroup()
>>>>>>> Stashed changes
                .addGap(79, 79, 79)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(134, 134, 134)
                        .addComponent(cb_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(81, 81, 81)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_namapegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_jumlahbarang, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_pegawai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(26, 26, 26)
                .addComponent(btn_addNama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_jumlahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
=======
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
=======
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> Stashed changes
=======
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> Stashed changes
                    .addComponent(jLabel9)
                    .addComponent(cb_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_namapegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_addNama)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_namabarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_jumlahbarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want LOGOUT", "EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            Login lg = new Login();
            lg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_jumlahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahbarangActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        menu mn = new menu();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String nama,jumlah,tanggal;
        int id_pegawai,id_stok;
        jumlah = txt_jumlahbarang.getText();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        tanggal = jDateChooser1.getDateFormatString();
        db.insertstok(nama,jumlah,tanggal);
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        tanggal = txt_date.getDateFormatString();
//        id_pegawai = cb_pegawai.getSelectedItem();
//        id_stok = cb_barang.getSelectedItem();
//        db.insertstok(jumlah,tanggal,id_pegawai,id_stok);
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        reset();
        tampil_comboB();
        tampil_comboP();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_addNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addNamaActionPerformed
        // TODO add your handling code here:
        transaksi ts = new transaksi();
        ts.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_addNamaActionPerformed

    private void cb_pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pegawaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_pegawaiActionPerformed

    private void txt_namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namabarangActionPerformed

    private void txt_namapegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namapegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namapegawaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stok().setVisible(true);
            }
        });
    }
db_cafe db;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addNama;
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    private com.toedter.calendar.JDateChooser jDateChooser1;
=======
    private javax.swing.JComboBox<String> cb_barang;
    private javax.swing.JComboBox<String> cb_pegawai;
>>>>>>> Stashed changes
=======
    private javax.swing.JComboBox<String> cb_barang;
    private javax.swing.JComboBox<String> cb_pegawai;
>>>>>>> Stashed changes
=======
    private javax.swing.JComboBox<String> cb_barang;
    private javax.swing.JComboBox<String> cb_pegawai;
>>>>>>> Stashed changes
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_stok;
    private javax.swing.JTextField txt_jumlahbarang;
    private javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_namapegawai;
    private javax.swing.JTextField txt_pendapatan;
    // End of variables declaration//GEN-END:variables
}
