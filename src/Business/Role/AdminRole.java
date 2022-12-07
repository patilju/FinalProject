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
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupoo
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerStore customerDirectory,RestaurantStore restaurantDirectory, DeliveryManStore deliveryManDirectory, Menu menu, OrderStore orderDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer,account,business,restaurantDirectory,deliveryManDirectory,menu,orderDirectory);
    }

    
    
}
