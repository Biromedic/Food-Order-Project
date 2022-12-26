/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderproject;

/**
 *
 * @author Biromedic
 */
public class Review {
    private int review_id;
    private int service_rev;
    private int delivery_rev;
    private int taste_rev;
    private int users_id;
    private int restaurant_restaurant_id;

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getService_rev() {
        return service_rev;
    }

    public void setService_rev(int service_rev) {
        this.service_rev = service_rev;
    }

    public int getDelivery_rev() {
        return delivery_rev;
    }

    public void setDelivery_rev(int delivery_rev) {
        this.delivery_rev = delivery_rev;
    }

    public int getTaste_rev() {
        return taste_rev;
    }

    public void setTaste_rev(int taste_rev) {
        this.taste_rev = taste_rev;
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

    public Review(int review_id, int service_rev, int delivery_rev, int taste_rev, int users_id, int restaurant_restaurant_id) {
        this.review_id = review_id;
        this.service_rev = service_rev;
        this.delivery_rev = delivery_rev;
        this.taste_rev = taste_rev;
        this.users_id = users_id;
        this.restaurant_restaurant_id = restaurant_restaurant_id;
    }

}