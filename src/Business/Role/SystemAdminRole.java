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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupoo
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system,  CustomerStore customerDirectory, RestaurantStore restaurantDirectory,DeliveryManStore deliveryManDirectory,Menu menu, OrderStore orderDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, customerDirectory, restaurantDirectory, deliveryManDirectory,menu,orderDirectory);
    }
    
}
