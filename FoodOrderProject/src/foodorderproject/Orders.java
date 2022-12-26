/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderproject;

import java.util.Date;

/**
 *
 * @author Biromedic
 */
public class Orders {
    private int order_id;
    private int user_id;
    private int restaurant_restaurant_id;
    private Date order_time;
    private int delivery_id;
    private Date create_time;

    public Orders(int order_id, int user_id, int restaurant_restaurant_id, Date order_time, int delivery_id, Date create_time) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.restaurant_restaurant_id = restaurant_restaurant_id;
        this.order_time = order_time;
        this.delivery_id = delivery_id;
        this.create_time = create_time;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRestaurant_restaurant_id() {
        return restaurant_restaurant_id;
    }

    public void setRestaurant_restaurant_id(int restaurant_restaurant_id) {
        this.restaurant_restaurant_id = restaurant_restaurant_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    

    


    
    
}
