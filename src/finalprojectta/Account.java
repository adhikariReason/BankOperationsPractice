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
        float sum=0;
        for(Transaction a: arrTrans){
            sum+=a.getAmount();
        }
            
        return sum;
    }

    @Override
    public String toString() {
        String lines="";
        for(Transaction a: arrTrans){
            lines+=a.toString();
        }
        return  "Account: " + accName+", Balance: "+getAccountBalance()+", Transactions: " + lines;
   
    }
    
    
        
        
}
