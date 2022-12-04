/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderDirectory;

import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author juile
 */
public class CustomerRole {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,  CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory,Menu menu, OrderDirectory orderDirectory) {
        return new CustomerAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory,menu,orderDirectory);
    }
    
    
}
