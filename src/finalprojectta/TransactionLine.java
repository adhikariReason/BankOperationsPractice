/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectta;

/**
 *
 * @author S538259
 */
public class TransactionLine {
    private String category;
    private String desc;
    private float amt;
    
    public TransactionLine(String categoryIn,String descIn,float amtIn){
        category=categoryIn;
        desc= descIn;
        amt=amtIn;
    }

    @Override
    public String toString() {
        return "\n\tCategory: " + this.getCategory() + ", Description: " + 
                this.getDesc() + ", Amount: " + getAmt();
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the amt
     */
    public float getAmt() {
        return amt;
    }

    /**
     * @param amt the amt to set
     */
    public void setAmt(float amt) {
        this.amt = amt;
    }
    
            
}
