/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author juile
 */
public class OrderDirectory {
    private ArrayList<Order> orderDir;

    public ArrayList<Order> getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(ArrayList<Order> orderDir) {
        this.orderDir = orderDir;
    }

    public OrderDirectory() {
        orderDir = new ArrayList<Order>();
    }

    public Order getOrderById(int index) {
        return orderDir.get(index);
    }

    public Order add() {
        Order order = new Order();
        orderDir.add(order);
        return order;
    }

    public Order fetchOrders(String OrderNo) {
        for (Order order : orderDir) {
            if (order.getOrderNo().equalsIgnoreCase(OrderNo)) {
                return order;
            }
        }
        return null;
    }
}
