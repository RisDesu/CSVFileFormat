/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CSVList;
import view.Menu;
/**
 *
 * @author HP
 */
public class Manager extends Menu<String>{
    private CSVList list= new CSVList();
    public Manager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
           
            case 1:
                list.importFile();
                list.print();
                break;
            case 2: 
                list.formatAddress();
                list.print();
                break;
            case 3:
                list.formatName();
                list.print();
                break;
            case 4: 
                list.exportFile();
                break;
            case 5:
                System.exit(0);        
        }
    }
}
