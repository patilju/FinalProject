/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicineItems;

/**
 *
 * @author dhrit
 */
public class MedicineItem {
  private int MedicineId;
    private String MedicineName;
    private int MedicinePrice;
    private static int count = 1;

    public MedicineItem(String name, int price) {
        MedicineId = count;
        count++;
        this.MedicineName = name;
        this.MedicinePrice = price;
    }

    public int getMedicineId() {
        return MedicineId;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public int getMedicinePrice() {
        return MedicinePrice;
    }

     
    
    @Override
    public String toString() {
        return MedicineName;
    }
    

    public void setMedicinePrice(int MedicinePrice) {
        this.MedicinePrice = MedicinePrice;
    }
    
}
  
