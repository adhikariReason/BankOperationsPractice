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
public class Account {
    private String accName;
    private ArrayList<Transaction> arrTrans;

    public Account(String accName, ArrayList<Transaction> arrTrans) {
        this.accName = accName;
        this.arrTrans = arrTrans;
    }
    
    public void addTransaction (Transaction t){
        
    }
    
    public Transaction getTransaction(){
        return arrTrans.get(0);
    }
    
    public void addAccount(Account a){
        
    }
    
    public int indexOfTransaction(String transIDToFind){
        return 0;
    }
    public float getAccountBalance(){
        return 0;
    }

    @Override
    public String toString() {
        return "accName=" + accName + ", transactions=" + arrTrans ;
    }
    
    
        
        
}
