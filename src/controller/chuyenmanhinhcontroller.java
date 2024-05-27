/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import view.BansachJPanel;





/**
 *
 * @author lehie
 */
public class chuyenmanhinhcontroller {
    private JPanel root;

    public chuyenmanhinhcontroller(JPanel jpnroot) {
        this.root = jpnroot;
    }
    
    public void setview(JPanel jpnitem) {
       this.root.removeAll();
       this.root.setLayout(new BorderLayout());
       this.root.add(jpnitem);
       this.root.validate();
       this.root.repaint();
    }
}
