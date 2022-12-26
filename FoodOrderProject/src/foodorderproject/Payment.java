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
public class Payment {
    private int payment_id;
    private int total_price;
    private Date payment_time;
    private int orders_order_id;
    private int quantity;
    private int users_id;
    private int restaurant_restaurant_id;
    private Date order_time;

    public Payment(int payment_id, int total_price, Date payment_time, int orders_order_id, int quantity, int users_id, int restaurant_restaurant_id, Date order_time) {
        this.payment_id = payment_id;
        this.total_price = total_price;
        this.payment_time = payment_time;
        this.orders_order_id = orders_order_id;
        this.quantity = quantity;
        this.users_id = users_id;
        this.restaurant_restaurant_id = restaurant_restaurant_id;
        this.order_time = order_time;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Date getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    public int getOrders_order_id() {
        return orders_order_id;
    }

    public void setOrders_order_id(int orders_order_id) {
        this.orders_order_id = orders_order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
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

    
}
