/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S538259
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File data = new File("transactions.csv");
        Scanner scan = new Scanner(data);
        scan.nextLine();
        
        //stores whole file in multidimensional Arraylist-array
        ArrayList<String[]> arrList = new ArrayList<>();
        while (scan.hasNextLine()) {
            arrList.add(scan.nextLine().split(","));
        }
        
        ArrayList<Transaction> arrTran = new ArrayList<>();
        int id=0;
        for(int i=0; i<arrList.size(); i++){
            
            ArrayList<TransactionLine> tempLine = new ArrayList<>();
            TransactionLine line = new TransactionLine(arrList.get(i)[5],
                    arrList.get(i)[6], Int(arrList.get(i)[7]));
            tempLine.add(line); //adds a line to a line array

            //if two elements have same id, skips the line but already stores the 
            //transactionline information #41
            if( id == Int(arrList.get(i)[1])) continue;

            //IMP! sets id to non-repeated id 
            id =Int(arrList.get(i)[1]);
            for(int j=i+1; j<arrList.size(); j++){
                //check for repeated ids
                if(id==Int(arrList.get(j)[1])){
                    TransactionLine repeatIdLine = new TransactionLine(arrList.get(j)[5],
                            arrList.get(j)[6], Int(arrList.get(j)[7]));
                    tempLine.add(repeatIdLine);
                }
            }
            //sends the tempLine arr and teh arr only contains lines with single ids.
            arrTran.add(new Transaction(arrList.get(i)[2],arrList.get(i)[3],
                    Int(arrList.get(i)[1]), tempLine));
        }
        ArrayList<Account> tempArrAcc = new ArrayList<>();
        
        ArrayList<Transaction> checkingArrTran = new ArrayList<>();
        ArrayList<Transaction> savingArrTran = new ArrayList<>();
        for(Transaction a:arrTran){
            for(String[] b: arrList){
                if(Int(b[1])==a.getTranId()){
                    if(b[0].equalsIgnoreCase("checking")){
                        checkingArrTran.add(a);
                        break;
                    }
                    else{
                        savingArrTran.add(a); 
                        break;
                    }
                }
            }      
        }
        tempArrAcc.add(new Account("checking", checkingArrTran));
        tempArrAcc.add(new Account("Saving", savingArrTran));
        
        
        
        
        
        for(Account a: tempArrAcc){
            System.out.println(a.toString());
        }
    }
    public static int Int(String s){
        return Integer.parseInt(s);
    }

}
