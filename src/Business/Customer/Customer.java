/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author juile
 */
public class Customer {
    private String CustomerName;
    private int CustomerId;
    private String CustomerAddress;
    private String CustomerContactNo;
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
   

    private static int count = 1;
    private ArrayList<Orders> PastOrderList;

    public Customer() {
        CustomerId = count;
        count++;
        this.PastOrderList = new ArrayList<Orders>();
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    
    public String getCustomerName() {
        return CustomerName;
    }

    @Override
    public String toString() {
        return CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public ArrayList<Orders> getPastOrderList() {
        return PastOrderList;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public String getCustomerContactNo() {
        return CustomerContactNo;
    }

    public void setCustomerContactNo(String CustomerContactNo) {
        this.CustomerContactNo = CustomerContactNo;
    }

    

    
    
    
    public void AddOrder()
    {
        
    }    
}


