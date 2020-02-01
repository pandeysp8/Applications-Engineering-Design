/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientLog;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import PatientLog.Patient;
import java.time.Month;
/**
 *
 * @author Swati
 */
public class VitalSigns {
    //double age;
    int age_y;
    int age_m;
    int age_d;
    double resp_rate;
    double heart_rate;
    double s_BP;
    double weight_k;
    double weight_p;
    
        
    
    public VitalSigns(){

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Year of Birth");
    age_y= Integer.parseInt(sc.nextLine());
    
        System.out.println("Enter Month of Birth");
        age_m= Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter Date of Birth");
        age_d= Integer.parseInt(sc.nextLine());
    LocalDate today= LocalDate.now();
    LocalDate pdate= LocalDate.of(age_y, age_m, age_d);
    
    Period p= Period.between(pdate, today);
   
    System.out.println("Years " +age_y + " Months " + age_m + " Days " + age_d);
    
    System.out.println("Enter respiration rate");
    Scanner input2=new Scanner(System.in);
    resp_rate=input2.nextDouble();
    
    System.out.println("Enter heart rate");
    Scanner input3=new Scanner(System.in);
    heart_rate=input3.nextDouble();
    
    System.out.println("Enter Blood Pressure");
    Scanner input4=new Scanner(System.in);
    s_BP=input4.nextDouble();
    
    System.out.println("Enter Weight in KGs");
    Scanner input5=new Scanner(System.in);
    weight_k=input5.nextDouble();
    
    System.out.println("Enter weight in Pounds");
    Scanner input6=new Scanner(System.in);
    weight_p=input6.nextDouble();
    
}
    
    
    
    public static void main(String[] args) {
           
           
           Patient p= new Patient();
           System.out.println("qw");
           p.IsPatientNormal();
           
        }
}


