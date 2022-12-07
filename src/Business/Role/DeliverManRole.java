/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author nupoo
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerStore customerDirectory, RestaurantStore restaurantDirectory, DeliveryManStore deliveryManDirectory,Menu menu, OrderStore orderDirectory) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business,deliveryManDirectory,orderDirectory);//To change body of generated methods, choose Tools | Templates.
    }
    
}