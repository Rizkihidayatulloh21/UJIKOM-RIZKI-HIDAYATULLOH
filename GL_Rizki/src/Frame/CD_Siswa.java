/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.koneksi;
/**
 *
 * @author lenovo
 */
public class CD_Siswa extends javax.swing.JFrame {

    /**
     * Creates new form CD_Siswa
     */
    public CD_Siswa() {
        initComponents();
        tampilkan();
        KELAS();
        TAHUN();
        
        butonupdate.setEnabled(false);
    }
int _kelas;    
    int _tahun;

    Statement st;
    Connection con = koneksi.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        Nisn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NamaSiswa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BoxKelas = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        butonsimpan = new javax.swing.JButton();
        butonupdate = new javax.swing.JButton();
        butuondelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NoTelp = new javax.swing.JTextField();
        BoxSpp = new javax.swing.JComboBox();
        Cari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelsiswa = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PENDATAAN PETUGAS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nisn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NISN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        Nis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Siswa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        NamaSiswa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(NamaSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        BoxKelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BoxKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nama Kelas" }));
        BoxKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxKelasActionPerformed(evt);
            }
        });
        getContentPane().add(BoxKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 160, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        Alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 160, 30));

        butonsimpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        butonsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/003-save-file.png"))); // NOI18N
        butonsimpan.setText("Save");
        butonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(butonsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        butonupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        butonupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/003-save-file-picsay.png"))); // NOI18N
        butonupdate.setText("Edit");
        butonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonupdateActionPerformed(evt);
            }
        });
        getContentPane().add(butonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 90, -1));

        butuondelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        butuondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/004-delete.png"))); // NOI18N
        butuondelete.setText("Delete");
        butuondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butuondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(butuondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 100, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/004-delete-picsay.png"))); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon (123).png"))); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Telp");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Spp");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        NoTelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(NoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 160, 30));

        BoxSpp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BoxSpp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Spp" }));
        BoxSpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSppActionPerformed(evt);
            }
        });
        getContentPane().add(BoxSpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 160, 30));

        Cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 480, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cari NISN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        Tabelsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabelsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelsiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabelsiswa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 820, 170));

        jPanel7.setBackground(new java.awt.Color(0, 51, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PENDATAAN SISWA");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SMK AL - IHSAN BATUJAJAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(89, 89, 89))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 580, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BG-Data.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BoxKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxKelasActionPerformed
        // TODO add your handling code here:
        try {
            String comboboxIsi = BoxKelas.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from kelas where nama_kelas='"+comboboxIsi+"'");
            while(rs.next()) {
                _kelas = Integer.parseInt(rs.getString("id_kelas"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BoxKelasActionPerformed

    private void butonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonsimpanActionPerformed
        // TODO add your handling code here:
        String nisn = Nisn.getText();
        String nis = Nis.getText();
        String nama = NamaSiswa.getText();
        int kelas =  _kelas;
        String alamat = Alamat.getText();
        String telp = NoTelp.getText();
        int tahun =  _tahun;

        try{
            con.createStatement().executeUpdate("insert into siswa value ('"+nisn+"','"+nis+"','"+nama+"','"+BoxKelas.getSelectedItem()+"','"+alamat+"','"+telp+"','"+BoxSpp.getSelectedItem()+"')");
            JOptionPane.showMessageDialog(null, "Data siswa berhasil ditambahkan");
            resetForm();

        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }//GEN-LAST:event_butonsimpanActionPerformed

    private void butonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonupdateActionPerformed
        // TODO add your handling code here
        try {
            String valueKelas = BoxKelas.getSelectedItem().toString();
            String valueTahun = BoxSpp.getSelectedItem().toString();

            ResultSet rsKelas = con.createStatement().executeQuery("select id_kelas from kelas where nama_kelas='"+valueKelas+"'");
            ResultSet rsTahun = con.createStatement().executeQuery("select id_spp from spp where tahun='"+valueTahun+"'");

            while(rsKelas.next()) {
                _kelas = Integer.parseInt(rsKelas.getString("id_kelas"));
            }
            while(rsTahun.next()) {
                _tahun = Integer.parseInt(rsTahun.getString("id_spp"));
            }
            String nis = Nis.getText();
            String nama = NamaSiswa.getText();
            String alamat = Alamat.getText();
            String telp = NoTelp.getText();

            con.createStatement().executeUpdate("update siswa set nis='"+nis+"', nama='"+nama+"',id_kelas='"+BoxKelas.getSelectedItem()+"', alamat='"+alamat+"', no_telp='"+telp+"', id_spp='"+BoxSpp.getSelectedItem()+"' where nisn='"+Nisn.getText()+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
        }
        resetForm();
    }//GEN-LAST:event_butonupdateActionPerformed

    private void butuondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butuondeleteActionPerformed
        // TODO add your handling code here:
        try {
            con.createStatement().executeUpdate("delete from siswa where nisn ='"+Nisn.getText()+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_butuondeleteActionPerformed

    private void BoxSppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSppActionPerformed
        // TODO add your handling code here:
        try {
            String comboboxIsi = BoxKelas.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from kelas where nama_kelas='"+comboboxIsi+"'");
            while(rs.next()) {
                _kelas = Integer.parseInt(rs.getString("id_kelas"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BoxSppActionPerformed

    private void TabelsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelsiswaMouseClicked
        // TODO add your handling code here:
        int i = Tabelsiswa.getSelectedRow();
        Nisn.setText(model.getValueAt(i, 0).toString());
        Nis.setText(model.getValueAt(i, 1).toString());
        NamaSiswa.setText(model.getValueAt(i, 2).toString());
        BoxKelas.setSelectedItem(model.getValueAt(i, 3));
        Alamat.setText(model.getValueAt(i, 4).toString());
        NoTelp.setText(model.getValueAt(i, 5).toString());
        BoxSpp.setSelectedItem(model.getValueAt(i, 6));

        //       disabled item on klik row table
        Nisn.setEnabled(false);
        butonsimpan.setEnabled(false);
        butonupdate.setEnabled(true);
    }//GEN-LAST:event_TabelsiswaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      resetForm();
        butonupdate.setEnabled(false);
        butonsimpan.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Form_Utama dsb = new Form_Utama ();
        dsb.dashAdmin();
        dsb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CD_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CD_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CD_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CD_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CD_Siswa().setVisible(true);
            }
        });
    }

    private void tampilkan() {
        String[] judul = {"NISN","NIS","Nama","Kelas","Alamat","Telepon","ID SPP"};
        model = new DefaultTableModel(judul,0);
        Tabelsiswa.setModel(model);
        String sql = "SELECT * FROM siswa WHERE nisn LIKE '%"+Cari.getText()+"%' OR nis LIKE '%"+Cari.getText()+"%' OR nama LIKE '%"+Cari.getText()+"%' OR id_kelas LIKE '%"+Cari.getText()+"%' OR alamat LIKE '%"+Cari.getText()+"%' OR no_telp LIKE '%"+Cari.getText()+"%' OR id_spp LIKE '%"+Cari.getText()+"%' ";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                String data[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)};
                model.addRow(data);
                }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    
    private void KELAS() {                
       try {
           rs = con.createStatement().executeQuery("select * from kelas");
           while (rs.next()) {
               BoxKelas.addItem(rs.getString("id_kelas"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }
    
    private void TAHUN() {                
       try {
           rs = con.createStatement().executeQuery("select * from spp");
           while (rs.next()) {
               BoxSpp.addItem(rs.getString("id_spp"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }

    public void resetForm(){
        Nisn.setText("");
        Nis.setText("");
        NamaSiswa.setText("");
        BoxKelas.setSelectedItem("~ Pilih Kelas");
        Alamat.setText("");
        NoTelp.setText("");
        BoxSpp.setSelectedItem("~ Angkatan Tahun");
        
        tampilkan();
        butonsimpan.setEnabled(true);
        Nisn.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox BoxKelas;
    private javax.swing.JComboBox BoxSpp;
    private javax.swing.JTextField Cari;
    private javax.swing.JTextField NamaSiswa;
    private javax.swing.JTextField Nis;
    private javax.swing.JTextField Nisn;
    private javax.swing.JTextField NoTelp;
    private javax.swing.JTable Tabelsiswa;
    private javax.swing.JButton butonsimpan;
    private javax.swing.JButton butonupdate;
    private javax.swing.JButton butuondelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
