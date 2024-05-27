/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author lehie
 */
public class DangNhap {
    private String taikhoan;
    private String matkhau;
    private String maq;
    private String tennv;
    private String cmnd;
    private String gioitinh;

    public DangNhap() {
    }

    public DangNhap(String taikhoan, String matkhau, String maq, String tennv, String cmnd, String gioitinh) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.maq = maq;
        this.tennv = tennv;
        this.cmnd = cmnd;
        this.gioitinh = gioitinh;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMaq() {
        return maq;
    }

    public void setMaq(String maq) {
        this.maq = maq;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    
    
}
