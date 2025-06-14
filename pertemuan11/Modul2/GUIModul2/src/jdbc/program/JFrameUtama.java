/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;

import java.util.List;
import javax.swing.DefaultListModel;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author TUF GAMING
 */
public class JFrameUtama extends javax.swing.JFrame {
    private MysqlMahasiswaService service = new MysqlMahasiswaService(); 
    private DefaultListModel<String> dlmID = new DefaultListModel<>();
    private DefaultListModel<String> dlmNama = new DefaultListModel<>();
    

    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        NAMA.setModel(dlmNama);
        ID.setModel(dlmID);
        
        ID.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    int selectedIndex = ID.getSelectedIndex();
                    if (selectedIndex >= 0) {
                        String selectedID = ID.getSelectedValue();
                        String selectedNama = dlmNama.getElementAt(selectedIndex);

                        IDEDIT.setText(selectedID);
                        NAMAEDIT.setText(selectedNama);
                        IDHAPUS.setText(selectedID);
                        NAMAHAPUS.setText(selectedNama);

                        NAMA.setSelectedIndex(selectedIndex);
                    }
                }
            }
        });
    
    // Listener untuk JList NAMA
        NAMA.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    int selectedIndex = NAMA.getSelectedIndex();
                    if (selectedIndex >= 0) {
                        String selectedNama = NAMA.getSelectedValue();
                        String selectedID = dlmID.getElementAt(selectedIndex);

                        IDEDIT.setText(selectedID);
                        NAMAEDIT.setText(selectedNama);
                        IDHAPUS.setText(selectedID);
                        NAMAHAPUS.setText(selectedNama);

                        ID.setSelectedIndex(selectedIndex);
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void tampilkan(){
        dlmID.clear();
        dlmNama.clear();
        
        List<Mahasiswa> list = service.getAll();
        
        for (Mahasiswa mhs : list) {
            dlmID.addElement(String.valueOf(mhs.getId()));
            dlmNama.addElement(mhs.getNama());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ID = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        NAMA = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        AMBILDATA = new javax.swing.JButton();
        TAMBAHKAN = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        HAPUS = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        NAMATAMBAHKAN = new javax.swing.JTextField();
        IDEDIT = new javax.swing.JTextField();
        NAMAEDIT = new javax.swing.JTextField();
        IDHAPUS = new javax.swing.JTextField();
        NAMAHAPUS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("NAMA:");

        ID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ID);

        NAMA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(NAMA);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("KELOLA DATA MAHASISWA");

        AMBILDATA.setText("Ambil Semua Data");
        AMBILDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMBILDATAActionPerformed(evt);
            }
        });

        TAMBAHKAN.setText("TAMBAHKAN");
        TAMBAHKAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMBAHKANActionPerformed(evt);
            }
        });

        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        HAPUS.setText("HAPUS");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        RESET.setText("RESET INDEX");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        NAMATAMBAHKAN.setText("Hadyan Kholish Prasetio");
        NAMATAMBAHKAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMATAMBAHKANActionPerformed(evt);
            }
        });

        IDEDIT.setText("ID");
        IDEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEDITActionPerformed(evt);
            }
        });

        NAMAEDIT.setText("NAMA");
        NAMAEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMAEDITActionPerformed(evt);
            }
        });

        IDHAPUS.setText("ID");

        NAMAHAPUS.setText("NAMA");

        jLabel4.setText("NAMA :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NAMATAMBAHKAN)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AMBILDATA)
                                            .addComponent(jLabel4)
                                            .addComponent(TAMBAHKAN))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NAMAEDIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EDIT)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NAMAHAPUS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HAPUS))
                                    .addComponent(RESET))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(AMBILDATA)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMATAMBAHKAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TAMBAHKAN)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NAMAEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDIT))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NAMAHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HAPUS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(RESET)))
                .addGap(13, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AMBILDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMBILDATAActionPerformed
        tampilkan(); 
    }//GEN-LAST:event_AMBILDATAActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        try{
            int id = Integer.parseInt(IDEDIT.getText().trim());
            String nama = NAMAEDIT.getText().trim();

            if(nama.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "mohon di isi namanya");
                return;
            }

            Mahasiswa mhs = service.getById(id);
            if (mhs == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Mahasiswa dengan ID " + id + " tidak ditemukan!");
                return;
            }
            mhs.setNama(nama);
            service.update(mhs);

            tampilkan();
            javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
        }
        catch (NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this, "ID harus INTEGER");
        }
    }//GEN-LAST:event_EDITActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        try {
            if (IDHAPUS.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "ID tidak boleh kosong!");
                return;
            }

            int id = Integer.parseInt(IDHAPUS.getText().trim());

            Mahasiswa mhs = service.getById(id);
            if (mhs == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Mahasiswa dengan ID " + id + " tidak ditemukan!");
                return;
            }

            service.delete(id);
            tampilkan();
            javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
        }
        catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID nya angka, pls");
        }
    }//GEN-LAST:event_HAPUSActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        service.indexReset();
        javax.swing.JOptionPane.showMessageDialog(this, "Index berhasil direset!");
        tampilkan();
    }//GEN-LAST:event_RESETActionPerformed

    private void TAMBAHKANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMBAHKANActionPerformed
        try {
            String nama = NAMATAMBAHKAN.getText().trim();
            if (nama.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nama jangan kosong!");
                return;
            }

            if (nama.length() > 20) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nama terlalu panjang! Maksimal 20 karakter.");
                return;
            }

            Mahasiswa mhs = new Mahasiswa(0, nama);
            service.add(mhs);
            tampilkan();
            NAMATAMBAHKAN.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "Berhasil ditambahkan!");

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_TAMBAHKANActionPerformed

    private void IDEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEDITActionPerformed
        
    }//GEN-LAST:event_IDEDITActionPerformed

    private void NAMATAMBAHKANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMATAMBAHKANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMATAMBAHKANActionPerformed

    private void NAMAEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMAEDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMAEDITActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AMBILDATA;
    private javax.swing.JButton EDIT;
    private javax.swing.JButton HAPUS;
    private javax.swing.JList<String> ID;
    private javax.swing.JTextField IDEDIT;
    private javax.swing.JTextField IDHAPUS;
    private javax.swing.JList<String> NAMA;
    private javax.swing.JTextField NAMAEDIT;
    private javax.swing.JTextField NAMAHAPUS;
    private javax.swing.JTextField NAMATAMBAHKAN;
    private javax.swing.JButton RESET;
    private javax.swing.JButton TAMBAHKAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
