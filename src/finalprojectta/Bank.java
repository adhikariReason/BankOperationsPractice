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
public class Bank {
    private String bankName;
    private ArrayList<Account> accArr;

    public Bank(String bankName, ArrayList<Account> accArr) {
        this.bankName = bankName;
        this.accArr = accArr;
    }
     public void addAcc(Account a){
         
     }
     public int IndexOfAccount(String accToFind){
         return 0;
     }

    @Override
    public String toString() {
        return  "bankName=" + bankName + ", accArr=" + accArr ;
    }
     
    
}
