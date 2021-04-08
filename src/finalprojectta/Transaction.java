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
public class Transaction {
    private String date;
    private String toFrom;
    private int tranId;
    private String status;
    private ArrayList<TransactionLine> arrLine;

    public Transaction(String date, String toFrom, int tranId, ArrayList<TransactionLine> arrLine) {
        this.date = date;
        this.toFrom = toFrom;
        this.tranId = tranId;
        this.status = status;
        this.arrLine = arrLine;
    }
    
    public void addTranLine(TransactionLine tl){
        
    }
        
    public float getAmount(){
        float amt=0;
        for(TransactionLine a: arrLine){
            amt+=a.getAmt();
        }
        return amt;     
    }

    @Override
    public String toString() {
        return "date=" + date + ", toFrom=" + toFrom + ", tranId=" + tranId + ", status=" + status + ", arrLine=" + arrLine ;
    }
    
}
