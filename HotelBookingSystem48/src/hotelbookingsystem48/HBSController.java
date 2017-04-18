/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbookingsystem48;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 * This is the controller class for the HBS system.
 * 
 * @author Jeffrey Middendorf
 * @version 1.0
 * @since 2/4/2017
 */
public class HBSController {
    
    private HBSModel sysModel;
    
    public HBSController(HBSModel newMod){
        sysModel = newMod;
    }
    
    public HBSModel getSysModel(){
        return sysModel;
    }
    
    public void inititialize(){
        MainView frmMainMenu = new MainView();
        setView(frmMainMenu);
    }
    
    
    public Statement getModelAStatement(){
        return sysModel.getStmtA();
    }
    
    public Statement getModelBStatement(){
        return sysModel.getStmtB();
    }
    
    public void setModel(HBSModel newMod){
        sysModel = newMod;
    }
    
    public void setView(View view){
        view.setController(this);
        view.setVisible(true);
    }
    
    public void setView(View view, View oldView){
        view.setController(this);
        view.setVisible(true);
        oldView.setVisible(false);
    }
    
    public void showPopup(String message){
        JOptionPane.showMessageDialog(new JFrame(), message);
    }
    
}
