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
import javax.swing.JPanel;

/**
 *
 * @author nupoo
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,
            CustomerStore customerDirectory,
            RestaurantStore restaurantDirectory,
            DeliveryManStore deliveryManDirectory,
            Menu menu,
            OrderStore orderDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
