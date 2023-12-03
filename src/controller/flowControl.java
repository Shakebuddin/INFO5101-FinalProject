/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
import view.*;

/**
 *
 * @author lenovo
 */
public class flowControl {
    public static String access = "DENIED";
    
    public String getAccess(){
        System.out.println("getting Access " + access);
        if(access.equals("DENIED")){
            return "DENIED";
        }
        else{
            return "GRANTED";
        }
    }
    
    public void grantAccess(){
        System.out.println("Granting access ");
        this.access = "GRANTED";
        System.out.println("Granting access " + access);
//        getAccess();
    }
    
    public void revokeAccess(){
        System.out.println("Revoking access " + access);
        this.access = "DENIED";
        System.out.println("Revoking access " + access);
    }
    
}
