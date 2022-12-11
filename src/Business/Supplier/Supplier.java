/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;


import Business.Employee.EmployeeDirectory;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;
import Business.SupplierEmp.SupplierEmpDirectory;
import Business.SupplierMedicineItem.SupplierMedicineCatalog;
import Business.SupplierOrders.SupplierOrders;
import Business.SupplierOrders.SupplierOrdersDirectory;

/**
 *
 * @author dhrit
 */
public class Supplier {
    private String SupplierName;
    private String SupplierAddress;
    private String SupplierEmail;
    private String SupplierContactNo;
    private int SupplierId;
    private static int count = 1;
    private SupplierDeliveryManDirectory supplierDeliveryManDirectory;
    private EmployeeDirectory employeeDirectory;
    private SupplierOrdersDirectory supplierOrdersDirectory;
    private SupplierMedicineCatalog supplierMedicineCatalog;

    public Supplier() {
        SupplierId = count;
        count++;
        this.supplierDeliveryManDirectory = new SupplierDeliveryManDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.supplierOrdersDirectory = new SupplierOrdersDirectory();
        this.supplierMedicineCatalog = new SupplierMedicineCatalog();
    }
    
    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public int getSupplierId() {
        return SupplierId;
    }

    public SupplierDeliveryManDirectory getSupplierDeliveryManDirectory() {
        return supplierDeliveryManDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddress = SupplierAddress;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public String getSupplierEmail() {
        return SupplierEmail;
    }

    public void setSupplierEmail(String SupplierEmail) {
        this.SupplierEmail = SupplierEmail;
    }

    public String getSupplierContactNo() {
        return SupplierContactNo;
    }

    public void setSupplierContactNo(String SupplierContactNo) {
        this.SupplierContactNo = SupplierContactNo;
    }
    

    @Override
    public String toString() {
        return SupplierName;
    }

    public SupplierOrdersDirectory getSupplierOrderDirectory() {
        return supplierOrdersDirectory;
    }

    public SupplierMedicineCatalog getSupplierMedicineCatalog() {
        return supplierMedicineCatalog;
    }
    
    public void deleteOrder(SupplierOrders so)
    {
        this.getSupplierOrderDirectory().getSupplierOrderList().remove(so);
    }
    
    public SupplierDeliveryMan findSupplierDeliveryMan(String name)
    {
        for(SupplierDeliveryMan sdm : this.supplierDeliveryManDirectory.getSupplierDeliveryManList())
        {
            if(sdm.getSupplierDmName().equals(name))
            {
                return sdm;
            }
        }
        return null;
    }    

}
