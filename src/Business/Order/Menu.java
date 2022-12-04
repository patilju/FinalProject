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
public class Menu {
    private ArrayList<OrderItem> menuList;

       public Menu(){
        menuList = new ArrayList<OrderItem>();
    }
     
    public ArrayList<OrderItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<OrderItem> menuList) {
        this.menuList = menuList;
    }
    
    
    
    public void addOrderItem(String restaurantId, String name, double price) {     
        OrderItem item = new OrderItem();
        item.setItemNo("Order Item "+(menuList.size()+1));
        item.setItemName(name);
        item.setPrice(price);
        item.setRestaurantNo(restaurantId);
        System.out.println("Order Item "+name+" added to Menu");
        menuList.add(item);
    }
    
    
    public OrderItem getOrderItemByKey(int key){
        return menuList.get(key);
    }
    
    public OrderItem fetchOrderItem(String itemId){
        for(OrderItem item: menuList){
            if(item.getItemNo().equalsIgnoreCase(itemId)){
                return item;
            }
        }
        return null;
    }

    public void updateOrderItem(String itemNo, String itemName, Double price) {
        for(OrderItem item: menuList){
            if(item.getItemNo().equalsIgnoreCase(itemNo)){
                item.setItemName(itemName);
                item.setPrice(price);
            }
        }
    }
    
    public void deleteOrderItem(String id){
        for(int i =0; i< menuList.size();i++){
            if(menuList.get(i).getItemNo().equalsIgnoreCase(id)){
                menuList.remove(i);
            }
        }
    }
}
