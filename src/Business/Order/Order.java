/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
/**
 *
 * @author juile
 */
public class Order extends WorkRequest{
    private String orderNo;
    private OrderItem orderItem;
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryMan deliveryMan;
    private String confirmOrder;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getConfirmOrder() {
        return confirmOrder;
    }

    public void setConfirmOrder(String confirmOrder) {
        this.confirmOrder = confirmOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private int quantity;
}
