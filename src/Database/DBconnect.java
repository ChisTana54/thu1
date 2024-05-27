/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Class.DangNhap;
import Class.Hoadon;
import Class.KhachHang;
import Class.Kho;
import Class.NhapKho;
import Class.QL;
import Class.Sach;
import Class.ThongKeKH;
import Class.ThongKeNV;
import Class.TimKiem;
import Class.qlhienthis;
import Class.qlsach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;


public class DBconnect{
    public Connection conn; 
    public Statement stmt;
    public ResultSet rs;
    boolean bl;
    public List<Sach> s = new ArrayList<>();
    public List<String> mass = new ArrayList<>();
    public List<Hoadon> hd = new ArrayList<>();
    public List<TimKiem> tk = new ArrayList<>();
    public List<DangNhap> dn = new ArrayList<>();
    public List<QL> qll = new ArrayList<>();
    public List<String> cbql = new ArrayList<>();
    public List<qlsach> qls = new ArrayList<>();
    public List<qlhienthis> qlhts = new ArrayList<>();
    public List<Kho> kho = new ArrayList<>();
    public List<NhapKho> nhapkho = new ArrayList<>();
    public List<KhachHang> kh = new ArrayList<>();
    public List<ThongKeNV> tknv = new ArrayList<>();
    public List<ThongKeKH> tkkh = new ArrayList<>();
    public void getconnect(){
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QLBS1;user=sa;password=111111118";
            conn = DriverManager.getConnection(dbURL);
            stmt = conn.createStatement();
        } catch (Exception e) {
            int choice = JOptionPane.showConfirmDialog(null, "Lỗi:"+e.toString(), "ERO", JOptionPane.YES_OPTION);
        }
    }
    public Connection getconnectl(){
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QLBS1;user=sa;password=111111118";
            conn = DriverManager.getConnection(dbURL);
            stmt = conn.createStatement();
        } catch (Exception e) {
            int choice = JOptionPane.showConfirmDialog(null, "Lỗi:"+e.toString(), "ERO", JOptionPane.YES_OPTION);
        }
        return conn;
    }
    public void getResult(String sql){    
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: "+ex.getMessage(),"Thông báo",JOptionPane.OK_OPTION);
        }
    }
    public void getbolen(String sql){    
        try {
            bl = stmt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: "+ex.getMessage(),"Thông báo",JOptionPane.OK_OPTION);
        }
    }
    public void chucnang(String sql){
        try {
            DBconnect db = new DBconnect();
            db.getconnect();
            db.getbolen(sql);        
        }catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi: "+ex.getMessage(),"Loi",JOptionPane.OK_OPTION);
        }
    }
    public void chucnangbs(String sql){
        try {
            DBconnect db = new DBconnect();
            db.getconnect();
            db.getbolen(sql);        
        }catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Số điện thoại này chưa được đặng ký","Loi",JOptionPane.OK_OPTION);
        }
    }
    public String getss(){
        int ss = 0;
        try {
             while (rs.next()) {                
                ss = rs.getInt("SOSACH"); 
            }         
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Lỗi : "+e.getMessage());
        }
        return ""+ss;
    }
    public String getst(){
        double ss = 0;
        try {
             while (rs.next()) {                
                ss = rs.getDouble("SOTIEN"); 
            }
          
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Lỗi : "+e.getMessage());
        }
        return ""+ss;
    }
    public int getsosachkho(){
        int ss = 0;
        try {
             while (rs.next()) {                
                ss = rs.getInt("SOLUONG"); 
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Lỗi : "+e.getMessage());
        }
        return ss;
    }

    public void connectqlsach(){       
        try {
            while (rs.next()) {
                qlsach qlss = new qlsach();
                qlss.setMAS(rs.getString("MAS"));
                qlss.setTENSACH(rs.getString("TENSACH"));
                qlss.setMATL(rs.getString("MATL"));
                qlss.setMANN(rs.getString("MANN"));
                qlss.setMANXB(rs.getString("MANXB"));
                qlss.setMATG(rs.getString("MATG"));
                qlss.setDONGIA(rs.getDouble("DONGIA"));
                qlss.setNAMXUATBAN(rs.getDate("NAMXUATBAN"));
                qlss.setSOTRANG(rs.getInt("SOTRANG"));
                qls.add(qlss);      
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectqlhienthisach(){       
        try {
            while (rs.next()) {
                qlhienthis qlss = new qlhienthis();
                qlss.setMAS(rs.getString("MAS"));
                qlss.setTENSACH(rs.getString("TENSACH"));
                qlss.setTHELOAI(rs.getString("THELOAI"));
                qlss.setTENNN(rs.getString("TENNN"));
                qlss.setTENNXATBAN(rs.getString("TENNXATBAN"));
                qlss.setTENTG(rs.getString("TENTG"));
                qlss.setDONGIA(rs.getDouble("DONGIA"));
                qlss.setNAMXUATBAN(rs.getDate("NAMXUATBAN"));
                qlss.setSOTRANG(rs.getInt("SOTRANG"));
                qlss.setNGAYCAPNHAP(rs.getDate("NGAYCAPNHAP"));
                qlhts.add(qlss);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectdangnhap(){
        try {
            while (rs.next()) {
                DangNhap dnn = new DangNhap();
                dnn.setTaikhoan(rs.getString("TAIKHOAN"));
                dnn.setMatkhau(rs.getString("MATKHAU"));
                dnn.setMaq(rs.getString("MAQ"));
                dnn.setTennv(rs.getString("TENNV"));
                dnn.setCmnd(rs.getString("CMND"));
                dnn.setGioitinh(rs.getString("GIOITINH"));
                dn.add(dnn);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectthongkenv(){
        try {
            while (rs.next()) {
                ThongKeNV tknvv = new ThongKeNV();
                tknvv.setTENNV(rs.getString("TENNV"));
                tknvv.setCMND(rs.getString("CMND"));
                tknvv.setSOLUONG(rs.getInt("SOLUONG"));
                tknvv.setTONGSOTIEN(rs.getDouble("TONGSOTIEN"));
                tknv.add(tknvv);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectthongkekh(){
        try {
            while (rs.next()) {
                ThongKeKH tkkhh = new ThongKeKH();
                tkkhh.setSDTKH(rs.getString("SDTKH"));
                tkkhh.setTENKH(rs.getString("TENKH"));
                tkkhh.setSOLUONG(rs.getInt("SOLUONG"));
                tkkhh.setTONGSOTIEN(rs.getDouble("TONGSOTIEN"));
                tkkh.add(tkkhh);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectkho(){
        try {
            while (rs.next()) {
                Kho khoo = new Kho();
                khoo.setMAS(rs.getString("MAS"));
                khoo.setTENSACH(rs.getString("TENSACH"));
                khoo.setSOLUONG(rs.getInt("SOLUONG"));
                kho.add(khoo);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectnhapkho(){
        try {
            while (rs.next()) {
                NhapKho nhapkhoo = new NhapKho();
                nhapkhoo.setMAS(rs.getString("MAS"));
                nhapkhoo.setTENSACH(rs.getString("TENSACH"));
                nhapkhoo.setSOLUONG(rs.getInt("SOLUONG"));
                nhapkhoo.setNGAYPHAPKHO(rs.getDate("NGAYNHAPKHO"));
                nhapkho.add(nhapkhoo);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connecthoadon(){
        try {
            while (rs.next()) {               
                Sach ls = new Sach();
                ls.setMAS(rs.getString("MAS"));
                ls.setTENS(rs.getString("TENSACH"));
                ls.setDONGIA(rs.getDouble("DONGIA"));
                ls.setSOLUONG(rs.getInt("SOLUONG"));
                ls.setTHANHTIEN(rs.getDouble("THANHTIEN"));
                s.add(ls);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connecthoadonhd(){
        try {
            while (rs.next()) {                
                Hoadon hdd = new Hoadon();
                hdd.MAHD = rs.getInt("MAHD");
                hdd.NGAYBAN = rs.getString("NGAYBAN");
                hdd.TENSACH = rs.getString("TENSACH");
                hdd.DONGIA = rs.getDouble("DONGIA");
                hdd.SOLUONG = rs.getInt("SOLUONG");
                hdd.THANHTIEN = rs.getDouble("THANHTIEN");
                hdd.TONG = rs.getDouble("TONG");
                hd.add(hdd);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: "+ex.getMessage());
        }
    }
    
    public void connectmas(){
        try {
            while (rs.next()) {                
                String ms;
                String ts;
                ms=rs.getString("MAS");
                ts=rs.getString("TENSACH");
                String msss = ""+ms+" - "+ts;
                mass.add(msss);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "lỗi: "+ex.getMessage());
        }
    }
    public void connecttimkiem(){
        try {
            while (rs.next()) {                
                TimKiem tkk = new TimKiem();
                tkk.MAS=rs.getString("MAS");
                tkk.TENSACH=rs.getString("TENSACH");
                tkk.SOLUONG=rs.getInt("SOLUONG");
                tk.add(tkk);                       
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "lỗi: "+ex.getMessage());
        }
    }
    public void connectkhachhang(){
        try {
            while (rs.next()) {                
                KhachHang khh = new KhachHang();
                khh.setSDTKH(rs.getString("SDTKH"));
                khh.setTENKH(rs.getString("TENKH"));
                khh.setGIOITINH(rs.getString("GIOITINH"));
                kh.add(khh);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "lỗi: "+ex.getMessage());
        }
    }
    public void connectQL(String ma,String ten){
        try {
            while (rs.next()) {                
                QL qlll = new QL();
                qlll.ma = rs.getString(ma);
                qlll.ten = rs.getString(ten);
                qll.add(qlll);
                cbql.add(qlll.ma+" - "+qlll.ten);
            }    
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "lỗi: "+ex.getMessage());
        }
    }
    public List<String> getconnectma(String sql,String ma,String ten){
        DBconnect db = new DBconnect();
        db.getconnect();
        db.getResult(sql);
        db.connectQL(ma, ten);
        return db.cbql;
    }
    public void setcombobox(JComboBox cb,List<String> cbql){
        cb.removeAllItems();
        cbql.forEach(cb::addItem);
    }
    public void view_table_QL(JTable tblql,List<QL> nv){
        DefaultTableModel model = (DefaultTableModel) tblql.getModel();
        model.setRowCount(0);
        List<QL> danhSach = nv;
        for (QL obj : danhSach) {
         model.addRow(new Object[] { obj.ma, obj.ten});
        }
    }
    public void view_table_tknv(JTable tblql,List<ThongKeNV> nv){
        DefaultTableModel model = (DefaultTableModel) tblql.getModel();
        model.setRowCount(0);
        List<ThongKeNV> danhSach = nv;
        for (ThongKeNV obj : danhSach) {
         model.addRow(new Object[] { obj.getTENNV(), obj.getCMND(),obj.getSOLUONG(),obj.getTONGSOTIEN()});
        }
    }
    public void view_table_tkkh(JTable tblql,List<ThongKeKH> nv){
        DefaultTableModel model = (DefaultTableModel) tblql.getModel();
        model.setRowCount(0);
        List<ThongKeKH> danhSach = nv;
        for (ThongKeKH obj : danhSach) {
            model.addRow(new Object[] { obj.getSDTKH(), obj.getTENKH(),obj.getSOLUONG(),obj.getTONGSOTIEN()});
        }
    }
    public void view_table_timkiem(JTable tb,List<TimKiem> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<TimKiem> danhSach = nv;
        for (TimKiem obj : danhSach) {
         model.addRow(new Object[] { obj.MAS, obj.TENSACH,obj.SOLUONG});
        }
    }
    public void view_table_dangnhap(JTable tb,List<DangNhap> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<DangNhap> danhSach = nv;
        for (DangNhap obj : danhSach) {
         model.addRow(new Object[] { obj.getTaikhoan(), obj.getMatkhau(),obj.getMaq(),obj.getTennv(),obj.getCmnd(),obj.getGioitinh()});
        }
    }
    public void view_table_kho(JTable tb,List<Kho> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<Kho> danhSach = nv;
        for (Kho obj : danhSach) {
         model.addRow(new Object[] { obj.getMAS(), obj.getTENSACH(),obj.getSOLUONG()});
        }
    }
    public void view_table_nhapkho(JTable tb,List<NhapKho> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<NhapKho> danhSach = nv;
        for (NhapKho obj : danhSach) {
         model.addRow(new Object[] { obj.getNGAYPHAPKHO(),obj.getMAS(), obj.getTENSACH(),obj.getSOLUONG()});
        }
    }
    public void view_table_qlsach(JTable tb,List<qlhienthis> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<qlhienthis> danhSach = nv;
        for (qlhienthis obj : danhSach) {
         model.addRow(new Object[] { obj.getMAS(),obj.getTENSACH(),obj.getTHELOAI(),obj.getDONGIA(),obj.getNAMXUATBAN(),obj.getSOTRANG(),obj.getTENNXATBAN(),obj.getTENNN(),obj.getTENTG(),obj.getNGAYCAPNHAP()});
        }
    }
    public void view_table_khachhang(JTable tb,List<KhachHang> nv){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<KhachHang> danhSach = nv;
        for (KhachHang obj : danhSach) {
         model.addRow(new Object[] { obj.getSDTKH(), obj.getTENKH(),obj.getGIOITINH()});
        }
    }
    public void view_table_hoadon(JTable tb,List<Sach> s){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        List<Sach> danhSach = s;
        for (Sach obj : danhSach) {
         model.addRow(new Object[] {  obj.getTENS(),obj.getSOLUONG()});
        }
    }
    public String getsimpeldate(Date a){       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDate = sdf.format(a);
        return formattedDate;
    }
    public String getstgioitinh(JRadioButton rbnam){
        String gt;
        if(rbnam.isSelected()==true){
                gt = "Nam";
            }
            else{gt = "Nữ";}
        return gt;
    }
    
}
