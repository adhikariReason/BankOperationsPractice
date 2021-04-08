/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectta;

import java.util.ArrayList;

/**
 *
 * @author S538259
 */
public class Portfolio {
    private String userName;
    private ArrayList<Bank> arrBank;

    public Portfolio(String userName, ArrayList<Bank> arrBank) {
        this.userName = userName;
        this.arrBank = arrBank;
    }
    
    public int getNumBanks(){
        return 0;
    }
    
    public void addBank(Bank b){
        
    } 
    public int indexOfBank(String bankNameToFind){
         return 0;
    }
    
    public String toString(){
        return "";
    }
        
    
}
