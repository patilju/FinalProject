/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author juile
 */
public class DeliveryMan {
  private String DeliveryManName;
    private String DeliveryManContactNo;
    private String DeliveryManaAddress;
    private int DeliveryManId;
    private static int count = 1;

    public DeliveryMan() {
        DeliveryManId = count;
        count++;
    }

    public int getDeliveryManId() {
        return DeliveryManId;
    }

    public void setDeliveryManName(String DeliveryManName) {
        this.DeliveryManName = DeliveryManName;
    }

    
    public String getDeliveryManName() {
        return DeliveryManName;
    }

    @Override
    public String toString() {
        return DeliveryManName;
    }

    public String getDeliveryManContactNo() {
        return DeliveryManContactNo;
    }

    public void setDeliveryManContactNo(String DeliveryManContactNo) {
        this.DeliveryManContactNo = DeliveryManContactNo;
    }

    public String getDeliveryManaAddress() {
        return DeliveryManaAddress;
    }

    public void setDeliveryManaAddress(String DeliveryManaAddress) {
        this.DeliveryManaAddress = DeliveryManaAddress;
    }    

  
}
