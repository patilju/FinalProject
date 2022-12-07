/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerStore;
import Business.DeliveryMan.DeliveryManStore;
import Business.Order.Menu;
import Business.Order.OrderStore;
import Business.Restaurant.RestaurantStore;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dhrit
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantStore restaurantDirectory;
    private CustomerStore customerDirectory;
    private OrderStore orderDirectory;
    private Menu menu;

    public OrderStore getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderStore orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public RestaurantStore getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantStore restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerStore getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerStore customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManStore getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManStore deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    private DeliveryManStore deliveryManDirectory;

    public EcoSystem(RestaurantStore restaurantDirectory, CustomerStore customerDirectory, DeliveryManStore deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
    public Boolean validateMobileNo(String phoneNo)
    {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phoneNo);
        return (matcher.matches());
       
    }
    public Boolean validateEmail(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        return (matcher.matches());
    }
}
