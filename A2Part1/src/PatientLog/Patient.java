/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientLog;

import PatientLog.VitalSigns;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author Swati
 */
public class Patient {

    //private double age;
    //private double resp_rate;
    //private double heart_rate;
    //private double s_BP;
    //private double weight_k;
    //private double weight_p;
    //Patient p= new Patient();
    
    public Patient(){
        
    }
    public boolean IsPatientNormal() {
        VitalSigns vs = new VitalSigns();
         boolean b=true;
        
        if (vs.age_d > 0 && vs.resp_rate <= 30 && vs.resp_rate <= 50 && vs.heart_rate >= 120 && vs.heart_rate <= 160 && vs.s_BP >= 50 && vs.s_BP <= 70 && vs.weight_p >= 4.5 && vs.weight_p <= 7) 
        { 
            System.out.println("Normal Vital Signs");
            b=true;
        }                  
        /*else {
            System.out.println("Abnormal for a newborn");
            b=false;
             }*/
        
        else if (vs.age_m >= 1 && vs.age_m <= 12 && vs.resp_rate >= 20 && vs.resp_rate <= 30 && vs.heart_rate >= 80 && vs.heart_rate <= 140 && vs.s_BP >= 70 && vs.s_BP <= 100 && vs.weight_k >= 4 && vs.weight_k <= 10 && vs.weight_p >= 9 && vs.weight_p <= 22) 
                        {
            
                                System.out.println("Normal Vital Signs");
                                b=true;
                            
                        } 
        /*else {
                            System.out.println("Abnormal Vital Signs for an infant");
                            b=false;
                        }*/
                     
            
        
        else if (vs.age_y >= 1 && vs.age_y <= 3 && vs.resp_rate >= 30 && vs.resp_rate <= 50 && vs.heart_rate >= 80 && vs.heart_rate <= 130 && vs.s_BP >= 80 && vs.s_BP <= 110 && vs.weight_k >= 10 && vs.weight_k <= 14 && vs.weight_p >= 22 && vs.weight_p <= 31) 
             {
                                System.out.println("Normal Vital Signs");
                                b=true;
                            }
                         /*else {
                            System.out.println("Abnormal Vital Signs for a toddler");
                            b=false;
                        }*/
                   
        
        else if (vs.age_y >= 3 && vs.age_y <= 5 && vs.resp_rate >= 20 && vs.resp_rate <= 30 && vs.heart_rate >= 80 && vs.heart_rate <= 120 && vs.s_BP >= 80 && vs.s_BP <= 110 && vs.weight_k >= 14 && vs.weight_k <= 18 && vs.weight_p >= 31 && vs.weight_p <= 40) 
        {
                                System.out.println("Normal Vital Signs");
                                b=true;
                            }
                        /*else {
                            System.out.println("Abnormal Vital Signs for a Preschooler");
                            b=false;
                        }*/
                    

        else if (vs.age_y >= 6 && vs.age_y <= 12 && vs.resp_rate >= 20 && vs.resp_rate <= 30 && vs.heart_rate >= 70 && vs.heart_rate <= 110 && vs.s_BP >= 80 && vs.s_BP <= 120 && vs.weight_k >= 20 && vs.weight_k <= 42 && vs.weight_p >= 41 && vs.weight_p <= 92)
        {  
                                System.out.println("Normal Vital Signs");
                                b=true;
                            }
                         /*else {
                            System.out.println("Abnormal Vital Signs for a School Age kid");
                            b=false;
                        }*/
                   

        else if (vs.age_y >= 13 && vs.resp_rate >= 12 && vs.resp_rate <= 20 && vs.heart_rate > 55 && vs.heart_rate <= 105 && vs.s_BP >= 110 && vs.s_BP <= 120 && vs.weight_k >= 50 && vs.weight_p >= 110) 
            {
                                System.out.println("Normal Vital Signs");
                                b=true;
                            }
                        
        else {
            System.out.println("Abnormal Vital Signs");
            b=false;
            }
        
        System.out.println(b);
        return b;
    }

}




