/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Daotaikhoan;
import MODEL.Modeltaikhoan;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Viewdangnhap extends javax.swing.JFrame {

    public Viewdangnhap() {
        initComponents();
    }

    private Viewdangnhap(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtdanhnhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtondangnhap = new javax.swing.JButton();
        jButtonquenmk = new javax.swing.JButton();
        jtmatkhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(196, 233, 245));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP TÀI KHOẢN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên đăng nhập");

        jtdanhnhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jtdanhnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdanhnhapActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu");

        jButtondangnhap.setBackground(new java.awt.Color(196, 233, 245));
        jButtondangnhap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtondangnhap.setForeground(new java.awt.Color(102, 102, 102));
        jButtondangnhap.setText("Đăng Nhập");
        jButtondangnhap.setBorder(null);
        jButtondangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondangnhapActionPerformed(evt);
            }
        });

        jButtonquenmk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonquenmk.setText("Quên Mật Khẩu ?");
        jButtonquenmk.setBorder(null);
        jButtonquenmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonquenmkActionPerformed(evt);
            }
        });

        jtmatkhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jtmatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtmatkhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtdanhnhap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jtmatkhau)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonquenmk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtondangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtdanhnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtondangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonquenmk))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(276, 276, 276))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtdanhnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdanhnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdanhnhapActionPerformed

    private void jButtondangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondangnhapActionPerformed
        checkLogin(); 
        
    }//GEN-LAST:event_jButtondangnhapActionPerformed

    private void jButtonquenmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonquenmkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonquenmkActionPerformed

    private void jtmatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtmatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtmatkhauActionPerformed
    public void checkLogin() {
        String usercheck = jtdanhnhap.getText();
        String passwordcheck = new  String(jtmatkhau.getPassword());
        if (usercheck.equals("") || passwordcheck.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
        } else {
            try {                
                Modeltaikhoan acc = Daotaikhoan.getInstance().selectById(usercheck);                
                if (acc == null) {
                    JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại trên hệ thống !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (passwordcheck.equals(acc.getPassword())) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        dispose();
                        String role = acc.getRole();
                         
                        switch (role) {
                            case "BANQUANLY" -> {
                                Viewbql viewbql = new Viewbql();
                                viewbql.show();
                                dispose();
                                
                                //ad.setName(NhanVienDAO.getInstance().selectById(acc.getMaNV()).getTenNV());
                            }
                            case "NHANVIEN" -> {
                                Viewnhanvien viewnv = new Viewnhanvien();
                                viewnv.show();
                                dispose();
                               
                                //bh.setName(NhanVienDAO.getInstance().selectById(acc.getMaNV()).getTenNV());
                            }
                            case "CUDAN" -> {
                                Viewcudan viewcd = new Viewcudan();
                                viewcd.show();
                                dispose();  // Hiển thị frame Viewcudan
                                //nh.setName(NhanVienDAO.getInstance().selectById(acc.getMaNV()).getTenNV());
                            }
                        }
                    } else 
                        JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Cảnh báo !", JOptionPane.WARNING_MESSAGE);
                } 
                } catch (Exception e) {
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Tạo một đối tượng Viewdangnhap và hiển thị nó
            new Viewdangnhap().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtondangnhap;
    private javax.swing.JButton jButtonquenmk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtdanhnhap;
    private javax.swing.JPasswordField jtmatkhau;
    // End of variables declaration//GEN-END:variables
}