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
        for(TransactionLine a: getArrLine()){
            amt+=a.getAmt();
        }
        return amt;     
    }

    @Override
    public String toString() {
        String lines="";
        for(TransactionLine a: getArrLine()){
            lines+=a.toString();
        }
        return  "\n\tID: " + getTranId() + ", Date: " + getDate() + ", To/From: " + getToFrom() + 
                "Transaction Amount: "+this.getAmount()+ ", Lines: " + lines ;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the toFrom
     */
    public String getToFrom() {
        return toFrom;
    }

    /**
     * @param toFrom the toFrom to set
     */
    public void setToFrom(String toFrom) {
        this.toFrom = toFrom;
    }

    /**
     * @return the tranId
     */
    public int getTranId() {
        return tranId;
    }

    /**
     * @param tranId the tranId to set
     */
    public void setTranId(int tranId) {
        this.tranId = tranId;
    }

    /**
     * @return the arrLine
     */
    public ArrayList<TransactionLine> getArrLine() {
        return arrLine;
    }

    /**
     * @param arrLine the arrLine to set
     */
    public void setArrLine(ArrayList<TransactionLine> arrLine) {
        this.arrLine = arrLine;
    }
    
}
