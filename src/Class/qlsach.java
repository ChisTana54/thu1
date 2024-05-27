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
public class qlsach {
    private String MAS;
    private String TENSACH;
    private String MATL;
    private double DONGIA;
    private Date NAMXUATBAN;
    private int SOTRANG;
    private String MANXB;
    private String MANN;
    private String MATG;

    public qlsach() {
    }

    public qlsach(String MAS, String TENSACH, String MATL, double DONGIA, Date NAMXUATBAN, int SOTRANG, String MANXB, String MANN, String MATG) {
        this.MAS = MAS;
        this.TENSACH = TENSACH;
        this.MATL = MATL;
        this.DONGIA = DONGIA;
        this.NAMXUATBAN = NAMXUATBAN;
        this.SOTRANG = SOTRANG;
        this.MANXB = MANXB;
        this.MANN = MANN;
        this.MATG = MATG;
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

    public String getMATL() {
        return MATL;
    }

    public void setMATL(String MATL) {
        this.MATL = MATL;
    }

    public double getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(double DONGIA) {
        this.DONGIA = DONGIA;
    }

    public Date getNAMXUATBAN() {
        return NAMXUATBAN;
    }

    public void setNAMXUATBAN(Date NAMXUATBAN) {
        this.NAMXUATBAN = NAMXUATBAN;
    }

    public int getSOTRANG() {
        return SOTRANG;
    }

    public void setSOTRANG(int SOTRANG) {
        this.SOTRANG = SOTRANG;
    }

    public String getMANXB() {
        return MANXB;
    }

    public void setMANXB(String MANXB) {
        this.MANXB = MANXB;
    }

    public String getMANN() {
        return MANN;
    }

    public void setMANN(String MANN) {
        this.MANN = MANN;
    }

    public String getMATG() {
        return MATG;
    }

    public void setMATG(String MATG) {
        this.MATG = MATG;
    }
    
}
