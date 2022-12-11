/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.MedicineItems.MedicineCatalog;
import Business.Orders.OrderDirectory;
import Business.Orders.Orders;
import Business.SupplierOrders.SupplierOrders;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class Pharmacy {
    private String PharmacyName;
    private String PharmacyAddress;
    private String PharmacyEmail;
    private String PharmacyContactNo;
    private int PharmacyId;
    private static int count = 1;
    private DeliveryManDirectory deliveryManDirectory;
    private EmployeeDirectory employeeDirectory;
    private OrderDirectory orderDirectory;
    private MedicineCatalog medicineCatalog;
    private ArrayList<SupplierOrders> PastSupplierOrderList;
    
    public Pharmacy() {
        PharmacyId = count;
        count++;
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.orderDirectory = new OrderDirectory();
        this.medicineCatalog = new MedicineCatalog();
        this.PastSupplierOrderList = new ArrayList<SupplierOrders>();
    }
    
    public String getPharmacyAddress() {
        return PharmacyAddress;
    }

    public int getPharmacyId() {
        return PharmacyId;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setPharmacyName(String PharmacyName) {
        this.PharmacyName = PharmacyName;
    }

    public void setPharmacyAddress(String PharmacyAddress) {
        this.PharmacyAddress = PharmacyAddress;
    }

    public String getPharmacyName() {
        return PharmacyName;
    }

    public String getPharmacyEmail() {
        return PharmacyEmail;
    }

    public void setPharmacyEmail(String PharmacyEmail) {
        this.PharmacyEmail = PharmacyEmail;
    }

    public String getPharmacyContactNo() {
        return PharmacyContactNo;
    }

    public void setPharmacyContactNo(String PharmacyContactNo) {
        this.PharmacyContactNo = PharmacyContactNo;
    }
    

    @Override
    public String toString() {
        return PharmacyName;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }
    
    public ArrayList<SupplierOrders> getPastSupplierOrderList() {
        return PastSupplierOrderList;
    }

    public MedicineCatalog getMedicineCatalog() {
        return medicineCatalog;
    }
    
    public void deleteOrder(Orders o)
    {
        this.getOrderDirectory().getOrderList().remove(o);
    }
    
    public DeliveryMan findDeliveryMan(String name)
    {
        for(DeliveryMan dm : this.deliveryManDirectory.getDeliveryManList())
        {
            if(dm.getDeliveryManName().equals(name))
            {
                return dm;
            }
        }
        return null;
    }    



public void AddSupplierOrder()
    {
        
    }    
}
 

