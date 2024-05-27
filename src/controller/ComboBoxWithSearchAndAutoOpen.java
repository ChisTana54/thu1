/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ComboBoxWithSearchAndAutoOpen { 


    public void timkiem(JTextField searchField, JComboBox comboBox ,List<String> data){       
            // Add a DocumentListener to JTextField for searching
            searchField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    searchField.setText((String) comboBox.getSelectedItem());
                    comboBox.hidePopup();                  
                }
            });
            searchField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    filterItems();
                    comboBox.hidePopup();
                    comboBox.showPopup();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    filterItems();
                    comboBox.hidePopup();
                    comboBox.showPopup();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    filterItems();
                }

                private void filterItems() {
                    String searchText = searchField.getText().toLowerCase();
                    List<String> filteredData = data.stream()
                            .filter(item -> item.toLowerCase().contains(searchText))
                            .collect(Collectors.toList());

                    comboBox.removeAllItems();
                    filteredData.forEach(comboBox::addItem);                   
                }
            });
            searchField.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    comboBox.showPopup();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            
            });
            comboBox.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            
            });
    }
    public void timkiemma(JTextField searchField, JComboBox comboBox ,List<String> data){       
            // Add a DocumentListener to JTextField for searching
            searchField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GetMa g = new GetMa();
                    searchField.setText(g.Gma((String) comboBox.getSelectedItem()));
                    comboBox.hidePopup();                  
                }
            });
            searchField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    filterItems();
                    comboBox.hidePopup();
                    comboBox.showPopup();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    filterItems();
                    comboBox.hidePopup();
                    comboBox.showPopup();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    filterItems();
                }

                private void filterItems() {
                    String searchText = searchField.getText().toLowerCase();
                    List<String> filteredData = data.stream()
                            .filter(item -> item.toLowerCase().contains(searchText))
                            .collect(Collectors.toList());

                    comboBox.removeAllItems();
                    filteredData.forEach(comboBox::addItem);                   
                }
            });
            searchField.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    comboBox.showPopup();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            
            });
            comboBox.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            
            });
    }
}
