/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.is.oop.projek.view;

<<<<<<< HEAD
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import org.itenas.is.oop.projek.utils.PengelolaKoneksi;

/**
 *
 * @author ASUS
 */
public class viewAplikasi extends javax.swing.JFrame {


    public viewAplikasi(String pemasukan) {
        initComponents();
        loadTableData();
    }
=======
/**
 *
 * @author Achmad
 */
public class viewAplikasi extends javax.swing.JFrame {

    /**
     * Creates new form viewAplikasi
     */
    public viewAplikasi() {
        initComponents();
    }

>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCatatan = new javax.swing.JTable();
        txtTanggal = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxCari = new javax.swing.JComboBox<>();
        pilih_kategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(203, 210, 164));

<<<<<<< HEAD
        btnSubmit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\AppData\\Local\\Temp\\Rar$DRa0.448\\Images\\save.png")); // NOI18N
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\AppData\\Local\\Temp\\Rar$DRa0.023\\Images\\refresh.png")); // NOI18N
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        DELETE.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\AppData\\Local\\Temp\\Rar$DRa0.063\\Images\\delete.png")); // NOI18N
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\AppData\\Local\\Temp\\Rar$DRa0.849\\Images\\clear.png")); // NOI18N
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnKembali.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\AppData\\Local\\Temp\\Rar$DRa0.488\\Images\\exit.png")); // NOI18N
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
                .addComponent(btnKembali)
                .addGap(44, 44, 44))
        );

        tabelCatatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kategori", "Tanggal", "Deskripsi", "Jumlah"
            }
        ));
        tabelCatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCatatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCatatan);

        txtTanggal.setBackground(new java.awt.Color(204, 204, 204));
        txtTanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txtJumlah.setBackground(new java.awt.Color(204, 204, 204));
        txtJumlah.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txtDeskripsi.setBackground(new java.awt.Color(204, 204, 204));
        txtDeskripsi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeskripsiActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tanggal");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Deskripsi");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jumlah");

        ComboBoxCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Pemasukkan", "Pengeluaran" }));
        ComboBoxCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCariActionPerformed(evt);
            }
        });

        pilih_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KATEGORI", "Pemasukkan", "Pengeluaran" }));
        pilih_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_kategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(pilih_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))))
<<<<<<< HEAD
                .addContainerGap(49, Short.MAX_VALUE))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(39, Short.MAX_VALUE)
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pilih_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void txtDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeskripsiActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        
    }//GEN-LAST:event_DELETEActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearInputFields();
    }//GEN-LAST:event_btnClearActionPerformed

=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
<<<<<<< HEAD
        String kategori = (String) pilih_kategori.getSelectedItem();
        String tanggal = txtTanggal.getText();
        String deskripsi = txtDeskripsi.getText();
        String jumlah = txtJumlah.getText();

        if (kategori.isEmpty() || tanggal.isEmpty() || deskripsi.isEmpty() || jumlah.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua field!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            ConnectionManager connectionManager = new ConnectionManager();
            try (Connection conn = connectionManager.logOn()) {
                String query = "INSERT INTO catatan (kategori, tanggal, deskripsi, jumlah) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, kategori);
                ps.setString(2, tanggal);
                ps.setString(3, deskripsi);
                ps.setString(4, jumlah);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Info", JOptionPane.INFORMATION_MESSAGE);
                loadTableData(); // Refresh table
                clearInputFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new TampilanUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void ComboBoxCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCariActionPerformed
       
    }//GEN-LAST:event_ComboBoxCariActionPerformed

    private void pilih_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_kategoriActionPerformed
   
    }//GEN-LAST:event_pilih_kategoriActionPerformed

    private void tabelCatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCatatanMouseClicked
        try {
        int selectedRow = tabelCatatan.getSelectedRow();
        
        if (selectedRow >= 0) {
            String kategori = tabelCatatan.getValueAt(selectedRow, 0).toString();
            String tanggal = tabelCatatan.getValueAt(selectedRow, 1).toString();
            String deskripsi = tabelCatatan.getValueAt(selectedRow, 2).toString();
            String jumlah = tabelCatatan.getValueAt(selectedRow, 3).toString();
            
            pilih_kategori.setSelectedItem(kategori);
            txtTanggal.setText(tanggal);
            txtDeskripsi.setText(deskripsi);
            txtJumlah.setText(jumlah);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error selecting row: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_tabelCatatanMouseClicked
=======

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
int selectedRow = tabelCatatan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diperbarui!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            tabelCatatan.setValueAt(txtTanggal.getText(), selectedRow, 1);
            tabelCatatan.setValueAt(txtDeskripsi.getText(), selectedRow, 2);
            tabelCatatan.setValueAt(txtJumlah.getText(), selectedRow, 3);
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!", "Info", JOptionPane.INFORMATION_MESSAGE);
            clearInputFields();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

    }//GEN-LAST:event_DELETEActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed

    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tabelCatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCatatanMouseClicked

    }//GEN-LAST:event_tabelCatatanMouseClicked

    private void txtDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeskripsiActionPerformed

    private void ComboBoxCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCariActionPerformed

    }//GEN-LAST:event_ComboBoxCariActionPerformed

    private void pilih_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_kategoriActionPerformed

    }//GEN-LAST:event_pilih_kategoriActionPerformed
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da

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
            java.util.logging.Logger.getLogger(viewAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
<<<<<<< HEAD
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
=======
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                new viewAplikasi("pemasukan").setVisible(true);
            }
        });
    }
    
    private void clearInputFields() {
    txtTanggal.setText("");
    txtDeskripsi.setText("");
    txtJumlah.setText("");

}
=======
                new viewAplikasi().setVisible(true);
            }
        });
    }
>>>>>>> bd6189c89bc2e02562b41b598b9a3e8c0c99b6da

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCari;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pilih_kategori;
    private javax.swing.JTable tabelCatatan;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
