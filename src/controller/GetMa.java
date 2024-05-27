/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author lehie
 */
public class GetMa {
    public String Gma(String chuoi){
        String phanduoclay = "";
        int viTriDauCach = chuoi.indexOf(" ");
        if (viTriDauCach != -1) {
            // Lấy phần từ đầu chuỗi đến vị trí của dấu cách đầu tiên
            phanduoclay = chuoi.substring(0, viTriDauCach).trim();
        } else {
            // Không có dấu cách trong chuỗi, nên lấy toàn bộ chuỗi
            System.out.println("Lỗi lấy mã");
        }
        return phanduoclay;
    }
}
