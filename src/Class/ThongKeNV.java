/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author lehie
 */
public class ThongKeNV {
    private String TENNV;
    private String CMND;
    private int SOLUONG;
    private double TONGSOTIEN;

    public ThongKeNV() {
    }

    public ThongKeNV(String TENNV, String CMND, int SOLUONG, double TONGSOTIEN) {
        this.TENNV = TENNV;
        this.CMND = CMND;
        this.SOLUONG = SOLUONG;
        this.TONGSOTIEN = TONGSOTIEN;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public double getTONGSOTIEN() {
        return TONGSOTIEN;
    }

    public void setTONGSOTIEN(double TONGSOTIEN) {
        this.TONGSOTIEN = TONGSOTIEN;
    }
    
}
