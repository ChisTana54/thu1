/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author lehie
 */
public class NhapKho {
    private Date NGAYPHAPKHO;
    private String MAS;
    private String TENSACH;
    private int SOLUONG;

    public NhapKho() {
    }

    public NhapKho(Date NGAYPHAPKHO, String MAS, String TENSACH, int SOLUONG) {
        this.NGAYPHAPKHO = NGAYPHAPKHO;
        this.MAS = MAS;
        this.TENSACH = TENSACH;
        this.SOLUONG = SOLUONG;
    }

    public Date getNGAYPHAPKHO() {
        return NGAYPHAPKHO;
    }

    public void setNGAYPHAPKHO(Date NGAYPHAPKHO) {
        this.NGAYPHAPKHO = NGAYPHAPKHO;
    }

    public String getMAS() {
        return MAS;
    }

    public void setMAS(String MAS) {
        this.MAS = MAS;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }
    
}
