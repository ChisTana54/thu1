/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author lehie
 */
public class ThongKeKH {
    private String SDTKH;
    private String TENKH;
    private int SOLUONG;
    private double TONGSOTIEN;

    public ThongKeKH() {
    }

    public ThongKeKH(String SDTKH, String TENKH, int SOLUONG, double TONGSOTIEN) {
        this.SDTKH = SDTKH;
        this.TENKH = TENKH;
        this.SOLUONG = SOLUONG;
        this.TONGSOTIEN = TONGSOTIEN;
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
