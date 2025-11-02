import java.io.File;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class frmPenghitunganKata extends javax.swing.JFrame {

    public frmPenghitunganKata() {
        initComponents();
        setTitle("Aplikasi Penghitung Kata");
        setLocationRelativeTo(null); // posisi tengah layar
        realTimeHitung(); // aktifkan hitung otomatis
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTeks = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        lblKata = new javax.swing.JLabel();
        lblKarakter = new javax.swing.JLabel();
        lblKalimat = new javax.swing.JLabel();
        lblParagraf = new javax.swing.JLabel();
        lblHasilCari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 245, 240));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJudul.setText("Aplikasi Penghitungan Kata");

        txtTeks.setColumns(20);
        txtTeks.setRows(5);
        jScrollPane1.setViewportView(txtTeks);

        btnHitung.setBackground(new java.awt.Color(242, 234, 211));
        btnHitung.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(52, 79, 31));
        btnCari.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCari.setText("Cari Kata");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(244, 153, 26));
        btnSimpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSimpan.setText("Simpan Ke File");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtCari.setToolTipText("kata dicari");
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        lblKata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKata.setText("Menampilkan jumlah kata");

        lblKarakter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKarakter.setText("Menampilkan jumlah karakter");

        lblKalimat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKalimat.setText("Menampilkan jumlah kalimat");

        lblParagraf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblParagraf.setText("Menampilkan jumlah paragraf");

        lblHasilCari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHasilCari.setText("Hasil Pencarian:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblParagraf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHasilCari)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblKalimat)
                                .addComponent(lblKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblKata))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(lblKata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKarakter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblKalimat, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblParagraf)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHasilCari)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// === Method untuk menghitung kata, karakter, kalimat, paragraf ===
    private void hitungSemua() {
        String teks = txtTeks.getText().trim();
        if (teks.isEmpty()) {
            lblKata.setText("Jumlah Kata: 0");
            lblKarakter.setText("Jumlah Karakter: 0");
            lblKalimat.setText("Jumlah Kalimat: 0");
            lblParagraf.setText("Jumlah Paragraf: 0");
            return;
        }

        int jumlahKata = teks.split("\\s+").length;
        int jumlahKarakter = teks.replaceAll("\\s+", "").length();
        int jumlahKalimat = teks.split("[.!?]+").length;
        int jumlahParagraf = teks.split("\\n+").length;

        lblKata.setText("Jumlah Kata: " + jumlahKata);
        lblKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
        lblKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
        lblParagraf.setText("Jumlah Paragraf: " + jumlahParagraf);
    }

    // === Fitur cari kata ===
    private void cariKata() {
        String teks = txtTeks.getText().toLowerCase();
        String kataCari = txtCari.getText().toLowerCase();

        if (kataCari.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari!");
            return;
        }

        int count = 0;
        for (String kata : teks.split("\\W+")) {
            if (kata.equals(kataCari)) count++;
        }
        
        lblHasilCari.setText("Kata \"" + kataCari + "\" muncul sebanyak " + count + " kali.");

    }

    // === Fitur simpan ke file ===
    private void simpanKeFile() {
        try {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                PrintWriter writer = new PrintWriter(file);
                writer.println("Teks:");
                writer.println(txtTeks.getText());
                writer.println();
                writer.println("=== Hasil Perhitungan ===");
                writer.println(lblKata.getText());
                writer.println(lblKarakter.getText());
                writer.println(lblKalimat.getText());
                writer.println(lblParagraf.getText());
                writer.close();
                JOptionPane.showMessageDialog(this, "File berhasil disimpan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }

    // === Hitung otomatis setiap ada perubahan teks ===
    private void realTimeHitung() {
        txtTeks.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { hitungSemua(); }
            public void removeUpdate(DocumentEvent e) { hitungSemua(); }
            public void changedUpdate(DocumentEvent e) { hitungSemua(); }
        });
    }

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       String teks = txtTeks.getText().trim();
    if (teks.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan teks terlebih dahulu!");
        return;
    }

    int jumlahKata = teks.split("\\s+").length;
    int jumlahKarakter = teks.replaceAll("\\s+", "").length();
    int jumlahKalimat = teks.split("[.!?]+").length;
    int jumlahParagraf = teks.split("\\n+").length;

    lblKata.setText("Jumlah Kata: " + jumlahKata);
    lblKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
    lblKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
    lblParagraf.setText("Jumlah Paragraf: " + jumlahParagraf);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
            cariKata();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    try {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            PrintWriter writer = new PrintWriter(file);
            
            writer.println("Teks:");
            writer.println(txtTeks.getText());
            writer.println();
            writer.println("=== Hasil Perhitungan ===");
            writer.println(lblKata.getText());
            writer.println(lblKarakter.getText());
            writer.println(lblKalimat.getText());
            writer.println(lblParagraf.getText());
            writer.close();

            JOptionPane.showMessageDialog(this, "File berhasil disimpan!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }    
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

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
            java.util.logging.Logger.getLogger(frmPenghitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPenghitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPenghitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPenghitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPenghitunganKata().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHasilCari;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKalimat;
    private javax.swing.JLabel lblKarakter;
    private javax.swing.JLabel lblKata;
    private javax.swing.JLabel lblParagraf;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextArea txtTeks;
    // End of variables declaration//GEN-END:variables
}
