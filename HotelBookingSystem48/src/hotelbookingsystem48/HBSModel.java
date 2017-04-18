/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbookingsystem48;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
/**
 * This is the model connector for the HBS system this manages the connections into the database.
 * 
 * @author Jeffrey Middendorf
 * @version 1.0
 * @since 2/4/2017
 */
public class HBSModel {
    
    private Connection connA;
    private Connection connB;
    private ResultSet rsetA;
    private ResultSet rsetB;
    private Statement stmtA;
    private Statement stmtB;
    
    /**
     * The default constructor for the model.
     */
    public HBSModel(){
        try{
            DriverManager.registerDriver (new OracleDriver());
            connA = DriverManager.getConnection("jdbc:oracle:thin:@hippo.its.monash.edu.au:1521:FIT5148A", "S27338096", "student");
            stmtA = connA.createStatement();
            rsetA = null;
            connB = DriverManager.getConnection("jdbc:oracle:thin:@hippo.its.monash.edu.au:1521:FIT5148B", "S27338096", "student");
            stmtB = connB.createStatement();
            rsetB = null;
        }
        catch(SQLException f){
            System.out.println("error in connection");
        }
    }
    
    /**
     * 
     * @return 
     */
    public boolean closeConnection(){
        try{
            if (connA != null){
                connA.close();
            }
            if (connB != null){
                connA.close();
            }
            if (rsetA != null){
                connA.close();
            }
            if (rsetB != null){
                connA.close();
            }
            if (stmtA != null){
                connA.close();
            }
            if (stmtB != null){
                connA.close();
            }
            
            return true;
        }
        catch(SQLException ex){
            System.out.println("error in closing connection");
            return false;
        }
    }
        
    public Connection getConnA(){
        return connA;
    }
        
    public Connection getConnB(){
        return connB;
    }
        
    public ResultSet getRsetA(){
        return rsetA;
    }
        
    public ResultSet getRsetB(){
        return rsetB;
    }
        
    public Statement getStmtA(){
        return stmtA;
    }
        
    public Statement getStmtB(){
        return stmtB;
    }
    
    public void setConnA(Connection newConn){
        connA = newConn;
    }
    
    public void setConnB(Connection newConn){
        connB = newConn;
    }
    
    public void setRsetA(ResultSet newRst){
        rsetA = newRst;
    }
    
    public void setRsetB(ResultSet newRst){
        rsetB = newRst;
    }
    
    public void setStmtA(Statement newState){
        stmtA = newState;
    }
    
    public void setStmtB(Statement newState){
        stmtB = newState;
    }
                
}
