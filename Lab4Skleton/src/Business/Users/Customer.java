/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    private Date createdOn;
    private ProductDirectory directory;
    
    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

   
   
   public Customer(String password, String username){
       super(password,username,"customer");
       directory = new ProductDirectory();
       this.createdOn = new Date();
   }

   @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    @Override
    public int compareTo(Customer t) {
        return t.getUserName().compareTo(this.getUserName());
    }

    public Object getCreatedOn() {
        return createdOn;
    }
    
}
