/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderproject;

/**
 *
 * @author Biromedic
 */
public class Food {
    private int item_id;
    private String item_name;
    private String item_catagory;
    private String item_description;
    private String item_price;
    private int restaurant_id ;

    public Food(int item_id, String item_name, String item_catagory, String item_description, String item_price, int restaurant_id) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_catagory = item_catagory;
        this.item_description = item_description;
        this.item_price = item_price;
        this.restaurant_id = restaurant_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_catagory(String item_catagory) {
        this.item_catagory = item_catagory;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getItem_catagory() {
        return item_catagory;
    }

    public String getItem_description() {
        return item_description;
    }

    public String getItem_price() {
        return item_price;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    
}
