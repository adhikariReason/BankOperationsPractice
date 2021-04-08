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
        ArrayList<String[]> arrList = new ArrayList<>();
        while (scan.hasNextLine()) {
            arrList.add(scan.nextLine().split(","));
        }
        
        //ArrayList<TransactionLine> arrLine = new ArrayList<>();
        ArrayList<Account> arrAcc = new ArrayList<>();
        
        String accType = "";
        for(String[] a: arrList){
            if(Integer.parseInt(a[1])<=12810){
                
            }
            ArrayList<Transaction> arrTran = new ArrayList<>();
            int id=0;
            for(int i=0; i<arrList.size(); i++){
                ArrayList<TransactionLine> tempLine = new ArrayList<>();

                TransactionLine line = new TransactionLine(arrList.get(i)[5],
                        arrList.get(i)[6], Integer.parseInt(arrList.get(i)[7]));
                //arrLine.add(line);
                tempLine.add(line);

                if( id == Integer.parseInt(arrList.get(i)[1])) continue;

                id =Integer.parseInt(arrList.get(i)[1]);
                for(int j=i+1; j<arrList.size(); j++){
                    if(id==Integer.parseInt(arrList.get(j)[1])){
                        TransactionLine repeatIdLine = new TransactionLine(arrList.get(j)[5],
                                arrList.get(j)[6], Integer.parseInt(arrList.get(j)[7]));
                        tempLine.add(repeatIdLine);
                    }
                }
                arrTran.add(new Transaction(arrList.get(i)[2],arrList.get(i)[3],
                        Integer.parseInt(arrList.get(i)[1]), tempLine));     
            }
            
        }   
        
        
        

    }

}
