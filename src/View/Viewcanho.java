/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
//import controller.TimSanPham;
//import dao.NhaCungCapDAO;
import DAO.Daocanho;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumn;
import MODEL.Modelcanho;
import controler.Timcanho;
/**
 *
 * @author HP
 */
public class Viewcanho extends javax.swing.JFrame {
    
     private DefaultTableModel tblModel;
    DecimalFormat formatter = new DecimalFormat("###,###,###");

     /**
     * Creates new form NewJFrame
     */
    public Viewcanho() {
        initComponents();
        jTableCanho.setDefaultEditor(Object.class, null);
              initTable();
       loadDataToTable();
        //filltable();
        
        changeTextFind();
    }
     public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã căn hộ", "Diện Tích", "LoạiCH", "Số Phòng Ngủ", "Số Phòng Tắm", "Tầng", "Giá Thuê", "Phí DV","Giá Xe","SL xe"};
        tblModel.setColumnIdentifiers(headerTbl);
        jTableCanho.setModel(tblModel);
        jTableCanho.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTableCanho.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTableCanho.getColumnModel().getColumn(5).setPreferredWidth(20);        
        jTableCanho.getColumnModel().getColumn(6).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(7).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(8).setPreferredWidth(20);
        jTableCanho.getColumnModel().getColumn(9).setPreferredWidth(20);
    
       
        
    }

     public void changeTextFind() {
        txttracuu.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                /* do nothing */
                if (txttracuu.getText().length() == 0) {
                    loadDataToTable();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                /* do nothing */

            }
        });
    }
    public ArrayList<Modelcanho> searchFn(String luaChon, String content) {
        ArrayList<MODEL.Modelcanho> result = new ArrayList<>();
        Timcanho timch = new Timcanho();
        switch (luaChon) {
            case "MACH":
                result = timch.searchMACH(content);
                break;
            case "LoaiCH":
                result = timch.searchLoaiCH(content);
                break;
            
        }
        return result;
    }
     public void loadDataToTable() {
    try {
        Daocanho chdao = new Daocanho();
        ArrayList<MODEL.Modelcanho> arms = chdao.selectAll();
        tblModel.setRowCount(0);
        for (MODEL.Modelcanho i : arms ) {
            tblModel.addRow(new Object[]{
                    i.getMACH(), i.getDienTich(),i.getLoaiCH(),i.getSoPhongNgu(),i.getSoPhongTam(),i.getTang(),formatter.format(i.getGiaThue()) + "đ",formatter.format(i.getPHIDV()) + "đ",
                formatter.format(i.getGIAXE()) + "đ",i.getSLXE()
                  
            });
        }
    } catch (Exception e) {
        System.err.println(e.toString());
        
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

        jPanel1 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btntracuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCanho = new javax.swing.JTable();
        labQLCH = new javax.swing.JLabel();
        txttracuu = new javax.swing.JTextField();
        jButtontrangchu = new javax.swing.JButton();
        jComboluachon = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        jPanel1.setBackground(new java.awt.Color(196, 233, 245));
        jPanel1.setForeground(new java.awt.Color(196, 233, 245));

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btntracuu.setText("Tra cứu");
        btntracuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntracuuMouseClicked(evt);
            }
        });
        btntracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntracuuActionPerformed(evt);
            }
        });

        jTableCanho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Căn Hộ", "Diện Tích", "Loại Căn Hộ", "Số Phòng Ngủ", "Số Phòng Tắm", "Tầng", "Giá Thuê", "Phí Dịch Vụ", "Giá Xe", "Số Lượng Xe"
            }
        ));
        jTableCanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCanhoMouseClicked(evt);
            }
        });
        jTableCanho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableCanhoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCanho);
        if (jTableCanho.getColumnModel().getColumnCount() > 0) {
            jTableCanho.getColumnModel().getColumn(4).setMinWidth(50);
        }

        labQLCH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labQLCH.setText("QUẢN LÝ CĂN HỘ");

        txttracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttracuuActionPerformed(evt);
            }
        });

        jButtontrangchu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtontrangchu.setText("TRANG CHỦ");
        jButtontrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontrangchuActionPerformed(evt);
            }
        });

        jComboluachon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MACH", "LoaiCH", " ", " ", " " }));
        jComboluachon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboluachonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtontrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(labQLCH)))
                .addContainerGap(283, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboluachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btntracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labQLCH)
                    .addComponent(jButtontrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntracuu)
                    .addComponent(txttracuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboluachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttracuuActionPerformed
        // TODO add your handling code here:
         String luaChon = jComboluachon.getSelectedItem().toString();
        String content = txttracuu.getText();
        ArrayList<MODEL.Modelcanho> result = searchFn(luaChon, content);
        loadDataToTableSearch(result);
    }//GEN-LAST:event_txttracuuActionPerformed

    private void jButtontrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontrangchuActionPerformed
        Viewbql viewbql= new Viewbql();
        viewbql.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtontrangchuActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
            Viewthemcanho viewch=new Viewthemcanho();
            viewch.show();
            dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        Viewsuacanho viewch=new Viewsuacanho();
        viewch.show();
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jTableCanhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCanhoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCanhoKeyReleased

    private void jTableCanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCanhoMouseClicked
                        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCanhoMouseClicked
 public void loadDataToTableSearch(ArrayList<MODEL.Modelcanho> result) {
        try {
            tblModel.setRowCount(0);
            for (MODEL.Modelcanho i : result) {
                tblModel.addRow(new Object[]{
                    i.getMACH(), i.getDienTich(),i.getLoaiCH(),i.getSoPhongNgu(),i.getSoPhongTam(),i.getTang(),formatter.format(i.getGiaThue()) + "đ",formatter.format(i.getPHIDV()) + "đ",
                formatter.format(i.getGIAXE()) + "đ",i.getSLXE()
                });
            }
        } catch (Exception e) {  
        }
    }

    private void btntracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntracuuActionPerformed
           jComboluachon.setSelectedIndex(0);
           loadDataToTable();
    }//GEN-LAST:event_btntracuuActionPerformed

    private void jComboluachonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboluachonActionPerformed
        // TODO add your handling code here:
         String luaChon = jComboluachon.getSelectedItem().toString();
        String content = txttracuu.getText();
        ArrayList<MODEL.Modelcanho> result = searchFn(luaChon, content);
        loadDataToTableSearch(result);
    }//GEN-LAST:event_jComboluachonActionPerformed

    private void btntracuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntracuuMouseClicked

                   // TODO add your handling code here:
        String luaChon = jComboluachon.getSelectedItem().toString();
        String content = txttracuu.getText();
        ArrayList<MODEL.Modelcanho> result = searchFn(luaChon, content);
        loadDataToTableSearch(result);
    }//GEN-LAST:event_btntracuuMouseClicked

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
            java.util.logging.Logger.getLogger(Viewcanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewcanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewcanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewcanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewcanho().setVisible(true);
            }
        });
    
  
    }
    
    
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntracuu;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButtontrangchu;
    private javax.swing.JComboBox<String> jComboluachon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCanho;
    private javax.swing.JLabel labQLCH;
    private javax.swing.JTextField txttracuu;
    // End of variables declaration//GEN-END:variables
}
