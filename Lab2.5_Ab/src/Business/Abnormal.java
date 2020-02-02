/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Swati
 */
public class Abnormal {
    private double min_BP;
    private double max_BP;

    public Abnormal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getMin_BP() {
        return min_BP;
    }

    public void setMin_BP(double min_BP) {
        this.min_BP = min_BP;
    }

    public double getMax_BP() {
        return max_BP;
    }

    public void setMax_BP(double max_BP) {
        this.max_BP = max_BP;
    }
    
    public Abnormal(double min_BP, double max_BP){
        this.min_BP=min_BP;
        this.max_BP=max_BP;
    }
    
    
}
