/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author lehie
 */
public class Sach {
    private String MAS;
    private String TENS;
    private double DONGIA;
    private int SOLUONG;
    private double THANHTIEN;

    public Sach() {
    }

    public Sach(String MAS, String TENS, double DONGIA, int SOLUONG, double THANHTIEN) {
        this.MAS = MAS;
        this.TENS = TENS;
        this.DONGIA = DONGIA;
        this.SOLUONG = SOLUONG;
        this.THANHTIEN = THANHTIEN;
    }

    public String getMAS() {
        return MAS;
    }

    public void setMAS(String MAS) {
        this.MAS = MAS;
    }

    public String getTENS() {
        return TENS;
    }

    public void setTENS(String TENS) {
        this.TENS = TENS;
    }

    public double getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(double DONGIA) {
        this.DONGIA = DONGIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public double getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(double THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }   
}
