/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author dhrit
 */
public class CustomerDirectory {
    private ArrayList<Customer> custDir;
    
    public CustomerDirectory(){
        custDir = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustDir() {
        return custDir;
    }

    public void setCustDir(ArrayList<Customer> custDir) {
        this.custDir = custDir;
    }
    
    public void addCustomer(Customer customer){
        custDir.add(customer);
    }
    
    public Customer getCustomerId(int index){
        return custDir.get(index);
    }
    
    public String genCustID(){
        return "Customer "+(custDir.size()+1);
    }
    
     public Customer getCustomer(String id){
        for(Customer customer: custDir){
            if(customer.getCustID().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }
    
        public boolean isContactNoUnique(String contactNo){
        for(Customer customer : custDir){
            if(customer.getCustContact().equalsIgnoreCase(contactNo)){
                return false;
            }
        }
        return true;
    }
    
    
    
    public void deleteCustomer(int index,EcoSystem system){
        String id = custDir.get(index).getCustID();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i)
                    .getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            } else System.out.println("Customer does not Exist!");
        }
        custDir.remove(index);
    }
    
    public void updateCustomer(String custNo, String custName, String custContact, String custAddr){
        for(Customer customer: custDir){
            if(customer.getCustID().equalsIgnoreCase(custNo)){
                
                customer.setCustName(custName);
                customer.setCustContact(custContact);
                customer.setCustAddr(custAddr);
                break;
            }
        }
    }
    
}
