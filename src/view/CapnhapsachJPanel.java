/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Class.qlsach;
import Database.DBconnect;
import Interface.Table;
import controller.ComboBoxWithSearchAndAutoOpen;
import controller.GetMa;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author lehie
 */
public class CapnhapsachJPanel extends javax.swing.JPanel implements Table{
    DBconnect db = new DBconnect();
    ComboBoxWithSearchAndAutoOpen c = new ComboBoxWithSearchAndAutoOpen();
    int pos = 0;
    qlsach x = new qlsach();
    GetMa g = new GetMa();
    List<String> nn = new ArrayList<>();
    List<String> tg = new ArrayList<>();
    List<String> tl = new ArrayList<>();
    List<String> nxb = new ArrayList<>();
    public CapnhapsachJPanel() {
        initComponents();
        this.jbnsua.setEnabled(false);
        this.jbtxoa.setEnabled(false);
        db.setcombobox(cbtl,db.getconnectma("select * from QLTHELOAI", "MATL", "THELOAI"));
        db.setcombobox(cbtg,db.getconnectma("select * from TACGIA", "MATG", "TENTG"));
        db.setcombobox(cbnn,db.getconnectma("select * from NGONNGU", "MANN", "TENNN"));
        db.setcombobox(cbnxb,db.getconnectma("select * from NHAXUATBAN", "MANXB", "TENNXATBAN"));
        this.nn = db.getconnectma("select QLSACH.MANN,TENNN from QLSACH,NGONNGU WHERE NGONNGU.MANN = QLSACH.MANN", "MANN", "TENNN");
        this.tg = db.getconnectma("select * from TACGIA,QLSACH where TACGIA.MATG = QLSACH.MATG", "MATG", "TENTG");
        this.tl = db.getconnectma("select * from QLTHELOAI,QLSACH where QLSACH.MATL = QLTHELOAI.MATL", "MATL", "THELOAI");
        this.nxb = db.getconnectma("select * from NHAXUATBAN,QLSACH where NHAXUATBAN.MANXB = QLSACH.MANXB", "MANXB", "TENNXATBAN");
        c.timkiemma(this.txtl, this.cbtl, db.getconnectma("select * from QLTHELOAI", "MATL", "THELOAI"));
        c.timkiemma(this.txtg, this.cbtg, db.getconnectma("select * from TACGIA", "MATG", "TENTG"));
        c.timkiemma(this.txnn, this.cbnn, db.getconnectma("select * from NGONNGU", "MANN", "TENNN"));
        c.timkiemma(this.txnxb, this.cbnxb, db.getconnectma("select * from NHAXUATBAN", "MANXB", "TENNXATBAN"));
        showt();
    }
    private void showt(){
        db = new DBconnect();
        db.getconnect();
        db.getResult("exec hienthiqlsach");
        db.connectqlhienthisach();
        db.view_table_qlsach(tblqls, db.qlhts);
    }
    private void view(){
        db = new DBconnect();
        db.getconnect();
        db.getResult("select * from QLSACH");
        db.connectqlsach();
        x = db.qls.get(pos);
        this.txms.setText(x.getMAS());
        this.txgb.setText(""+x.getDONGIA());
        this.txnamxb.setDate(x.getNAMXUATBAN());
        this.cbnn.setSelectedItem(nn.get(pos));
        this.cbnxb.setSelectedItem(nxb.get(pos));
        this.cbtg.setSelectedItem(tg.get(pos));
        this.cbtl.setSelectedItem(tl.get(pos));
        this.txstr.setText(""+x.getSOTRANG());
        this.txts.setText(x.getTENSACH());      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();
        jbnsua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbtl = new javax.swing.JComboBox<>();
        cbnxb = new javax.swing.JComboBox<>();
        cbnn = new javax.swing.JComboBox<>();
        cbtg = new javax.swing.JComboBox<>();
        txnamxb = new com.toedter.calendar.JDateChooser();
        txms = new javax.swing.JTextField();
        txts = new javax.swing.JTextField();
        txtl = new javax.swing.JTextField();
        txstr = new javax.swing.JTextField();
        txnxb = new javax.swing.JTextField();
        txgb = new javax.swing.JTextField();
        txnn = new javax.swing.JTextField();
        txtg = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblqls = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        jLabel8.setText("NXB :");

        jLabel9.setText("Giá bán :");

        jLabel10.setText("Ngôn ngữ :");

        jLabel11.setText("Tác giả :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconsach.png"))); // NOI18N
        jLabel1.setText("Cập nhật sách");

        jLabel2.setText("Mã sách :");

        jLabel3.setText("Tên sách :");

        jLabel13.setText("Thể loại :");

        jLabel5.setText("Năm xuất bản :");

        jLabel6.setText("Số trang :");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbtxoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtxoa.setText("Xóa");
        jbtxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtxoaActionPerformed(evt);
            }
        });

        jbnsua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbnsua.setText("Sửa");
        jbnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnsuaActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Hủy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbtl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        cbnxb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        cbnn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        cbtg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        txnamxb.setDateFormatString("dd/MM/yyyy");

        jButton5.setText("Báo cáo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txts, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txnamxb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txms)
                            .addComponent(txstr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txnxb)
                            .addComponent(txnn)
                            .addComponent(txtg, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txgb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jbtxoa)
                        .addGap(18, 18, 18)
                        .addComponent(jbnsua)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txgb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbtg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txnamxb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbtxoa)
                    .addComponent(jbnsua)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        tblqls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Mã thể loại", "Giá bán", "Năm xuất bản", "Số trang", "NXB", "Ngôn ngữ", "Tác giả", "Ngày cập nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblqls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblqlsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblqls);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Thông tin cập nhật sách");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        db.chucnang("exec themqlsach '"+this.txms.getText()+"',N'"+this.txts.getText()+"','"+g.Gma((String) this.cbtl.getSelectedItem())+"',"+this.txgb.getText()+",'"+db.getsimpeldate(this.txnamxb.getDate())+"',"+this.txstr.getText()+",'"+g.Gma((String) this.cbnxb.getSelectedItem())+"','"+g.Gma((String) this.cbnn.getSelectedItem())+"','"+g.Gma((String) this.cbtg.getSelectedItem())+"'");
        this.jbnsua.setEnabled(false);
        this.jbtxoa.setEnabled(false);
        showt();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnsuaActionPerformed
        db.chucnang("exec capnhapqlsach '"+this.txms.getText()+"',N'"+this.txts.getText()+"','"+g.Gma((String) this.cbtl.getSelectedItem())+"',"+this.txgb.getText()+",'"+db.getsimpeldate(this.txnamxb.getDate())+"',"+this.txstr.getText()+",'"+g.Gma((String) this.cbnxb.getSelectedItem())+"','"+g.Gma((String) this.cbnn.getSelectedItem())+"','"+g.Gma((String) this.cbtg.getSelectedItem())+"'");
        this.jbnsua.setEnabled(false);
        this.jbtxoa.setEnabled(false);
        this.txms.setEditable(true);
        showt();
    }//GEN-LAST:event_jbnsuaActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
        db.chucnang("delete from QLKHOSACH where MAS = '"+this.txms.getText()+"'  delete from QLSACH where MAS = '"+this.txms.getText()+"' ");
        this.jbnsua.setEnabled(false);
        this.jbtxoa.setEnabled(false);
        showt();
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void tblqlsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblqlsMouseClicked
        pos = this.tblqls.getSelectedRow();
        this.jbnsua.setEnabled(true);
        this.jbtxoa.setEnabled(true);
        this.txms.setEditable(false);
        this.txms.setEditable(true);
        
        view();
        this.cbtl.hidePopup();
    }//GEN-LAST:event_tblqlsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.txms.setText("");
        this.txgb.setText("");
        this.txnn.setText("");
        this.txnxb.setText("");
        this.txstr.setText("");
        this.txtg.setText("");
        this.txtl.setText("");
        this.txts.setText("");
        this.txms.setEditable(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            MessageFormat header = new MessageFormat("DANH SÁCH SÁCH");
            MessageFormat footer = new MessageFormat("NHÀ SÁCH TRI THỨC");
            tblqls.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException e) {
            System.err.format("Không thể in", e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbnn;
    private javax.swing.JComboBox<String> cbnxb;
    private javax.swing.JComboBox<String> cbtg;
    private javax.swing.JComboBox<String> cbtl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbnsua;
    private javax.swing.JButton jbtxoa;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    private javax.swing.JTable tblqls;
    private javax.swing.JTextField txgb;
    private javax.swing.JTextField txms;
    private com.toedter.calendar.JDateChooser txnamxb;
    private javax.swing.JTextField txnn;
    private javax.swing.JTextField txnxb;
    private javax.swing.JTextField txstr;
    private javax.swing.JTextField txtg;
    private javax.swing.JTextField txtl;
    private javax.swing.JTextField txts;
    // End of variables declaration//GEN-END:variables
}