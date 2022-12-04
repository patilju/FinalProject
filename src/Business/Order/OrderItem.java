/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

/**
 *
 * @author juile
 */
public class OrderItem {
    
    private String itemNo;
    private String itemName;
    private double price;
    private String restaurantNo;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String getRestaurantNo() {
        return restaurantNo;
    }

    public void setRestaurantNo(String restaurantNo) {
        this.restaurantNo = restaurantNo;
    }

    
}
