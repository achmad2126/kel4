/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFile;
import MainFile.Laporan.laporan_barang;
import MainFile.master.pelanggan;
import java.awt.Dimension;
import java.awt.Toolkit;
import MainFile.pelayanan.maintanance;
import MainFile.pelayanan.instalasi;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import MainFile.transaksi.invoice_maintenance;

/**
 *
 * @author Nur
 */
public class MenuUtama extends javax.swing.JFrame {
   public final Connection Conn = new Koneksi().Connect();
    private maintanance mainten;
            instalasi ins;
             // pemutusan putus;
            invoice_maintenance inMaint;
            //invoice_instalasi inIns;
            //invoice_pemutusan insP;
//    Fasilitas Fasilitas;  
//    Pendaftaran Pendaftaran;
//    
//    PoliUmum PoliUmum;
//    PoliGigi PoliGigi;
//    Bidan Bidan;
//    
//    Biaya Biaya;
//    
//    Laporan_DataPasien Laporan_DataPasien;
//    Laporan_DataKeuangan Laporan_DataKeuangan;
    
    
    
    private void initForm(){
//        Informasi = new InformasiUmum();
//        Fasilitas = new Fasilitas();           
//        Pendaftaran = new Pendaftaran();
//        
//        PoliUmum = new PoliUmum();
//        PoliGigi= new PoliGigi();
//        Bidan = new Bidan();
//        
//        Biaya = new Biaya();
//        
//        Laporan_DataPasien = new Laporan_DataPasien();
//        Laporan_DataKeuangan = new Laporan_DataKeuangan();
        
    }

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        initForm();
        
        Toolkit kit = getToolkit();
        Dimension size = kit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        master = new javax.swing.JComboBox<>();
        pelayanan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transaksi = new javax.swing.JLabel();
        laporan = new javax.swing.JComboBox<>();
        jCtransaksi = new javax.swing.JComboBox<>();
        background = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAPORAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA MASTER");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PELAYANAN");

        master.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        master.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "PROSEDUR ESKALASI", "FASILITAS", "KARYAWAN", "PELANGGAN" }));
        master.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterActionPerformed(evt);
            }
        });

        pelayanan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pelayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "INSTALASI", "MAINTENANCE", "PEMUTUSAN" }));
        pelayanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelayananActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ctreated by || Kelompok 4 , Jakarta 2021");

        transaksi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transaksi.setForeground(new java.awt.Color(255, 255, 255));
        transaksi.setText("TRANSAKSI");
        transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });

        laporan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "LAPORAN INSTALASI", "LAPORAN MAINTANANCE", "LAPORAN PEMUTUSAN", "LAPORAN BARANG", "LAPORAN PELANGGAN" }));
        laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });

        jCtransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "TRANSAKSI INSTALASI", "TRANSAKSI MAINTENANCE", "TRANSAKSI PEMUTUSAN" }));
        jCtransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCtransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(laporan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pelayanan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(master, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pelayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jCtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        background.setBackground(new java.awt.Color(0, 153, 153));
        background.setForeground(new java.awt.Color(0, 153, 153));
        background.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SYSTEM HELP DESK TICKETING BERBASIS DEKSTOP JAVA NETBEANS ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N

        background.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        String pilih = laporan.getSelectedItem().toString();

        switch(pilih){
            case "LAPORAN INSTALASI" :
                background.removeAll();
                background.repaint();

                instalasi n1 = new instalasi();
                background.add(n1);
                n1.setVisible(true);
            
            break;
            
                case "LAPORAN MAINTENANCE" :
                background.removeAll();
                background.repaint();    

                maintanance n2 = new maintanance();
                background.add(n2);
                n2.setVisible(true);
            
            break;
             
                case "LAPORAN PEMUTUSAN" :
                background.removeAll();
                background.repaint();    

                maintanance n3 = new maintanance();
                background.add(n3);
                n3.setVisible(true);
            
            break;
            case "LAPORAN BARANG" :
                background.removeAll();
                background.repaint();    

                laporan_barang n4 = new laporan_barang();
                background.add(n4);
                n4.setVisible(true);
            break;
            case "LAPORAN PELANGGAN":
//                background.removeAll();
//                background.repaint();    
//
//                pelanggan n5 = new pelanggan();
//                background.add(n4);
//                n4.setVisible(true);
            break;
        }
    }//GEN-LAST:event_laporanActionPerformed

    private void pelayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelayananActionPerformed
        // Memilih combo box dan memngaarahkan nya ke jinternalframe

        String pilih = pelayanan.getSelectedItem().toString();

        switch(pilih){
            case "INSTALASI" :
            background.removeAll();
            background.repaint();
                
            instalasi n = new instalasi();
            background.add(n);
            n.setVisible(true);
            
      

            break;
            case "MAINTENANCE" :
            background.removeAll();
            background.repaint();    
                
            maintanance n1 = new maintanance();
            background.add(n1);
            n1.setVisible(true);
            
            
            
            break;
            case "PEMUTUSAN":

            break;

        }

    }//GEN-LAST:event_pelayananActionPerformed

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
          
            
    }//GEN-LAST:event_transaksiMouseClicked

    private void masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterActionPerformed
        
        String pilih = master.getSelectedItem().toString();

        switch(pilih){
            case "PROSEDUR ESKALASI" :
//                background.removeAll();
//                background.repaint();
//
//                instalasi n = new instalasi();
//                background.add(n);
//                n.setVisible(true);
            break;
            case "FASILITAS" :
//                background.removeAll();
//                background.repaint();
//
//                instalasi n = new instalasi();
//                background.add(n);
//                n.setVisible(true);
            break;
            case "KARYAWAN" :
//                background.removeAll();
//                background.repaint();
//
//                instalasi n = new instalasi();
//                background.add(n);
//                n.setVisible(true);
            break;
            case "PELANGGAN" :
                background.removeAll();
                background.repaint();

                pelanggan n4 = new pelanggan();
                background.add(n4);
                n4.setVisible(true);
            break;
        }
    }//GEN-LAST:event_masterActionPerformed

    private void jCtransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtransaksiActionPerformed
         String pilih = jCtransaksi.getSelectedItem().toString();

        switch(pilih){
            case "TRANSAKSI INSTALASI" :
//            background.removeAll();
//            background.repaint();
//                
//            instalasi n1 = new instalasi();
//            background.add(n1);
//            n1.setVisible(true);
            
      

            break;
            case "TRANSAKSI MAINTENANCE" :
            background.removeAll();
            background.repaint();    
                
            invoice_maintenance n2 = new invoice_maintenance();
            background.add(n2);
            n2.setVisible(true);
            
            
            
            break;
            case "TRANSAKSI PEMUTUSAN":

            break;

        }
    }//GEN-LAST:event_jCtransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane background;
    private javax.swing.JComboBox<String> jCtransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> laporan;
    private javax.swing.JComboBox<String> master;
    private javax.swing.JComboBox<String> pelayanan;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
