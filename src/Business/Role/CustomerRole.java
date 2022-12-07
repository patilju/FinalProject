/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerStore;
import Business.DeliveryMan.DeliveryManStore;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderStore;

import Business.Restaurant.RestaurantStore;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupoo
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,  CustomerStore customerDirectory, RestaurantStore restaurantDirectory, DeliveryManStore deliveryManDirectory,Menu menu, OrderStore orderDirectory) {
        return new CustomerAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory,menu,orderDirectory);
    }
    
    
}
