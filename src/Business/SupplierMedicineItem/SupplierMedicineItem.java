/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierMedicineItem;

/**
 *
 * @author juile
 */
public class SupplierMedicineItem {
   private int SupplierMedicineId;
    private String SupplierMedicineName;
    private int SupplierMedicinePrice;
    private static int count = 1;

    public SupplierMedicineItem(String name, int price) {
        SupplierMedicineId = count;
        count++;
        this.SupplierMedicineName = name;
        this.SupplierMedicinePrice = price;
    }

    public int getSupplierMedicineId() {
        return SupplierMedicineId;
    }

    public String getSupplierMedicineName() {
        return SupplierMedicineName;
    }

    public int getSupplierMedicinePrice() {
        return SupplierMedicinePrice;
    }

     
    
    @Override
    public String toString() {
        return SupplierMedicineName;
    }
    

    public void setSupplierMedicinePrice(int SupplierMedicinePrice) {
        this.SupplierMedicinePrice = SupplierMedicinePrice;
    }
    
 
}
