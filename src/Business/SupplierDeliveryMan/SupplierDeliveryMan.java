/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierDeliveryMan;

/**
 *
 * @author juile
 */
public class SupplierDeliveryMan {
  private String SupplierDmName;
    private String SupplierDmContact;
    private String SupplierDmAddress;
    private int SupplierDmId;
    private static int count = 1;

    public SupplierDeliveryMan() {
        SupplierDmId = count;
        count++;
    }

    public int getSupplierDmId() {
        return SupplierDmId;
    }

    public void setSupplierDmName(String SupplierDmName) {
        this.SupplierDmName = SupplierDmName;
    }

    
    public String getSupplierDmName() {
        return SupplierDmName;
    }

    @Override
    public String toString() {
        return SupplierDmName;
    }

    public String getSupplierDmContact() {
        return SupplierDmContact;
    }

    public void setSupplierDmContact(String SupplierDmContact) {
        this.SupplierDmContact = SupplierDmContact;
    }

    public String getSupplierDmAddress() {
        return SupplierDmAddress;
    }

    public void setSupplierDmAddress(String SupplierDmAddress) {
        this.SupplierDmAddress = SupplierDmAddress;
    }    

  

  
}
