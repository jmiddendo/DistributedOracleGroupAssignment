package hotelbookingsystem48;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;

/**
 *
 * @author jeff-pc
 */
public abstract class View extends JFrame {
    
    private HBSController controller;
    
    public void setController(HBSController c){
        this.controller = c;
    }

    public HBSController getController(){
	return controller;
    }
    
}
