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
public class ThongKe {
    private Date SOSACH;
    private Date SOTIEN;

    public ThongKe() {
    }

    public ThongKe(Date SOSACH, Date SOTIEN) {
        this.SOSACH = SOSACH;
        this.SOTIEN = SOTIEN;
    }

    public Date getSOSACH() {
        return SOSACH;
    }

    public void setSOSACH(Date SOSACH) {
        this.SOSACH = SOSACH;
    }

    public Date getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(Date SOTIEN) {
        this.SOTIEN = SOTIEN;
    }
    
}
