/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author lehie
 */
public class KhachHang {
    private String SDTKH;
    private String TENKH;
    private String GIOITINH;

    public KhachHang() {
    }

    public KhachHang(String SDTKH, String TENKH, String GIOITINH) {
        this.SDTKH = SDTKH;
        this.TENKH = TENKH;
        this.GIOITINH = GIOITINH;
    }

    public String getSDTKH() {
        return SDTKH;
    }

    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }
    
}
