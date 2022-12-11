/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierEmp;

/**
 *
 * @author juile
 */
public class SupplierEmp {
    private String SupplierEmpName;
    private String SupplierEmpAddress;
    private String SupplierEmpContact;    
    private int SupplierEmpId;
    private static int count = 1;

    public SupplierEmp() {
        SupplierEmpId = count;
        count++;
    }

    public int getSupplierEmpId() {
        return SupplierEmpId;
    }

    public void setSupplierEmpName(String SupplierEmpName) {
        this.SupplierEmpName = SupplierEmpName;
    }

    
    public String getSupplierEmpName() {
        return SupplierEmpName;
    }

    public String getSupplierEmpAddress() {
        return SupplierEmpAddress;
    }

    public void setSupplierEmpAddress(String SupplierEmpAddress) {
        this.SupplierEmpAddress = SupplierEmpAddress;
    }
    
    public String getSupplierEmpContact() {
        return SupplierEmpContact;
    }

    public void setSupplierEmpContact(String SupplierEmpContact) {
        this.SupplierEmpContact = SupplierEmpContact;
    } 

    @Override
    public String toString() {
        return SupplierEmpName;
    }
 

}
