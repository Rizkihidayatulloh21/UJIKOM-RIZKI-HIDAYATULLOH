/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.koneksi;
/**
 *
 * @author lenovo
 */
public class CD_Spp extends javax.swing.JFrame {

    /**
     * Creates new form CD_Spp
     */
    public CD_Spp() {
        initComponents();
         tabelSpp();
        Butonupdate.setEnabled(false);
    }
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

        jLabel2 = new javax.swing.JLabel();
        IDspp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tahun = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelspp = new javax.swing.JTable();
        Nominal = new javax.swing.JTextField();
        Butonupdate = new javax.swing.JButton();
        Butonsimpan = new javax.swing.JButton();
        Butondelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Spp");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        IDspp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(IDspp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tahun");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        Tahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nominal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        Cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        Cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CariKeyReleased(evt);
            }
        });
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 580, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cari SPP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        Tabelspp.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabelspp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelsppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabelspp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 700, 210));

        Nominal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominalActionPerformed(evt);
            }
        });
        getContentPane().add(Nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 160, 30));

        Butonupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Butonupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/003-save-file-picsay.png"))); // NOI18N
        Butonupdate.setText("Edit");
        Butonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonupdateActionPerformed(evt);
            }
        });
        getContentPane().add(Butonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        Butonsimpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Butonsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/003-save-file.png"))); // NOI18N
        Butonsimpan.setText("Save");
        Butonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Butonsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        Butondelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Butondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/004-delete.png"))); // NOI18N
        Butondelete.setText("Delete");
        Butondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Butondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/004-delete-picsay.png"))); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 110, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon (123).png"))); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, 30));

        jPanel7.setBackground(new java.awt.Color(0, 51, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PENDATAAN SPP");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SMK AL - IHSAN BATUJAJAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel7)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 580, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BG-Data.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CariKeyPressed
        // TODO add your handling code here:
        tabelSpp();
    }//GEN-LAST:event_CariKeyPressed

    private void CariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CariKeyReleased
        // TODO add your handling code here:
        tabelSpp();
    }//GEN-LAST:event_CariKeyReleased

    private void NominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NominalActionPerformed

    private void ButonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonupdateActionPerformed
        // TODO add your handling code here:
        try {
            String tahun = Tahun.getText();
            String nominal = Nominal.getText();

            con.createStatement().executeUpdate("update spp set tahun='"+tahun+"', nominal='"+nominal+"' where id_spp='"+model.getValueAt(Tabelspp.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Data Gagal Di Edit");
        }
        resetForm();
    }//GEN-LAST:event_ButonupdateActionPerformed

    private void ButonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonsimpanActionPerformed
        // TODO add your handling code here:
        String tahun = Tahun.getText();
        String nominal = Nominal.getText();
        
        try{ 
           con.createStatement().executeUpdate("insert into spp value ('"+IDspp.getText()+"', '"+tahun+"','"+nominal+"')");
           JOptionPane.showMessageDialog(null, "Kelas baru berhasil ditambahkan!");
           resetForm();
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!"); 
        }
    }//GEN-LAST:event_ButonsimpanActionPerformed

    private void ButondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButondeleteActionPerformed
        // TODO add your handling code here:
        try {
            con.createStatement().executeUpdate("delete from spp where id_spp ='"+model.getValueAt(Tabelspp.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_ButondeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        resetForm();
        Butonsimpan.setEnabled(true);
        Butonupdate.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TabelsppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelsppMouseClicked
        // TODO add your handling code here:
        int i = Tabelspp.getSelectedRow();
       IDspp.setText(model.getValueAt(i, 0).toString());
       Tahun.setText(model.getValueAt(i, 1).toString());
       Nominal.setText(model.getValueAt(i, 2).toString());
             
       //disabled item on klik row table
       Butonsimpan.setEnabled(false);
       Butonupdate.setEnabled(true);
       IDspp.setEnabled(false);
    }//GEN-LAST:event_TabelsppMouseClicked

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariActionPerformed

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
            java.util.logging.Logger.getLogger(CD_Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CD_Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CD_Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CD_Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CD_Spp().setVisible(true);
            }
        });
    }

    private void tabelSpp() {
        String[] judul = {"ID SPP","Angkatan Tahun","Nominal Bayar"};
        model = new DefaultTableModel(judul,0);
        Tabelspp.setModel(model);
        String sql = "SELECT * FROM spp where tahun like '%"+Cari.getText()+"%' or nominal like '%"+Cari.getText()+"%'or id_spp like '%"+Cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String id = rs.getString("id_spp");
               String tahun = rs.getString("tahun");
               String nominal = rs.getString("nominal");
               
                
               String[] data = {id,tahun,nominal};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }

    public void resetForm(){
        IDspp.setText("");
        Tahun.setText("");
        Nominal.setText("");
        tabelSpp();
        
        Butonsimpan.setEnabled(true);
        IDspp.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butondelete;
    private javax.swing.JButton Butonsimpan;
    private javax.swing.JButton Butonupdate;
    private javax.swing.JTextField Cari;
    private javax.swing.JTextField IDspp;
    private javax.swing.JTextField Nominal;
    private javax.swing.JTable Tabelspp;
    private javax.swing.JTextField Tahun;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}