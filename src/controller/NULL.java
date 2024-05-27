/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTextField;

/**
 *
 * @author lehie
 */
public class NULL {
    public String ktnull(JTextField a){
        if(a.getText().equals("")){
            return "Z404";
        }
        else{
            return a.getText();
        }
    }
}
