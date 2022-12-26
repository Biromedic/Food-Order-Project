package foodorderproject;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

class DataBaseConnection 
{
    public static final String DB_URL = "jdbc:mysql://localhost:3306/foodorderv2";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "123456789aa!";
    
    public Connection connect;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private Statement statement;
    
    public  DataBaseConnection()
    {
        String url = "jdbc:mysql://localhost:3306/foodorderv2";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find driver ..");
        }

        try {
            connect = DriverManager.getConnection(url, DataBaseConnection.DB_USERNAME, DataBaseConnection.DB_PASSWORD);
            System.out.println("Connection successful...");
        } catch (SQLException ex) {
            System.out.println("Connection failure...");
        }
    }
    
    public boolean enterAdmin(String username, String password){
        String query = "Select *From foodorderv2.admin where username = ? and password = ?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet =  preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int enterUser(String name, String password) {
        String query = "Select *From foodorderv2.users where name = ? and password = ?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            resultSet =  preparedStatement.executeQuery();
            if( resultSet.next()){
                int id = resultSet.getInt(1);
                return id;
            }
            else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    public ArrayList<Food> getTheFood(){
        ArrayList<Food> output = new ArrayList<Food>();
        try {
            statement = connect.createStatement();
            String query = "Select *From foodorderv2.restaurant_item";
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                int id = resultSet.getInt("item_id");
                String item_name = resultSet.getString("item_name");
                String item_catagory = resultSet.getString("item_catagory");
                String item_desc = resultSet.getString("item_desc");
                String item_price = resultSet.getString("item_price");
                //int restaurant_id = resultSet.getInt("restaurant_id");
                output.add(new Food(id,item_name,item_catagory,item_desc,item_price,1));
            }
            return output;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
     
    public ArrayList<User> getTheUsers(){
        ArrayList<User> output = new ArrayList<User>();
        try {
            statement = connect.createStatement();
            String query = "Select *From foodorderv2.users ";
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String mobile = resultSet.getString("mobile");
                String password = resultSet.getString("password");
                String address = resultSet.getString("address");

                output.add(new User(id,name,surname,address,password,mobile));
            }
            return output;
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Review> getTheReview(){
        ArrayList<Review> output = new ArrayList<Review>();
        try {
            statement = connect.createStatement();
            String query = "Select *From foodorderv2.review";
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                int review_id = resultSet.getInt("review_id");
                int service_rev = resultSet.getInt("service_rev");
                int delivery_rev = resultSet.getInt("delivery_rev");
                int taste_rev = resultSet.getInt("taste_rev");
                int users_id = resultSet.getInt("users_id");
                int restaurant_restaurant_id = resultSet.getInt("restaurant_restaurant_id");

                output.add(new Review(review_id,service_rev,delivery_rev,taste_rev,users_id,restaurant_restaurant_id));
            }
            return output;
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
    
    public ArrayList<Payment> getThePayment(){
        ArrayList<Payment> output = new ArrayList<Payment>();
       
        try {
            statement = connect.createStatement();
            String query = "Select * from foodorderv2.orders inner join foodorderv2.payment on foodorderv2.orders.order_id = foodorderv2.payment.orders_order_id ";
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                int payment_id = resultSet.getInt("payment_id");
                int total_price = resultSet.getInt("total_price");
                Date payment_time = resultSet.getDate("payment_time");        
                int orders_order_id = resultSet.getInt("orders_order_id");
                int quantity = resultSet.getInt("quantity");
                int users_id = resultSet.getInt("users_id");
                int restaurant_restaurant_id = resultSet.getInt("restaurant_restaurant_id");
                Date order_time = resultSet.getDate("order_time");
                
                output.add(new Payment(payment_id, total_price, payment_time, orders_order_id, quantity, users_id,restaurant_restaurant_id,order_time));
            }   
            return output;   
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    public int getLastOrderId(){

         try {
            statement = connect.createStatement();
            String query = "Select * from foodorderv2.orders";
            resultSet =  statement.executeQuery(query);
            if(resultSet.next()){
                   int id = resultSet.getInt(1);
                   return id ;
               }
               else{
                   return 0;
               }
         } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
         } 
    }
    
    public ArrayList<Orders> getTheOrders(){
        ArrayList<Orders> output = new ArrayList<Orders>();
       
        try {
            statement = connect.createStatement();
            String query = "Select * from foodorderv2.orders inner join foodorderv2.delivery on foodorderv2.orders.order_id = foodorderv2.delivery.orders_order_id ";
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
            int order_id = resultSet.getInt("order_id");
            int users_id = resultSet.getInt("users_id");
            int restaurant_restaurant_id = resultSet.getInt("restaurant_restaurant_id");
            Date order_time = resultSet.getDate("order_time");
            int delivery_id = resultSet.getInt("delivery_id");
            Date create_time = resultSet.getDate("create_time");
            
            output.add(new Orders(order_id,users_id,restaurant_restaurant_id,order_time,delivery_id,create_time));
            
            }   
            return output;   
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
     
    public void addUser(String name,String surname, String mobile ,String address ,String password){
        String query = "Insert Into foodorderv2.users (name,surname,mobile,address,password) VALUES(?,?,?,?,?)";       
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, mobile);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password); 
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void addOrder(int users_id, int restaurant_restaurant_id){
        String query = "Insert Into foodorderv2.orders (users_id,restaurant_restaurant_id) VALUES(?,?)";       
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setInt(1, users_id);
            preparedStatement.setInt(2, restaurant_restaurant_id);
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void addPayment(int total_price , int orders_order_id, int quantity){
        String query = "Insert Into foodorderv2.payment (total_price,orders_order_id, quantity) VALUES(?,?,?)";       
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setInt(1, total_price);
            preparedStatement.setInt(2, orders_order_id);
            preparedStatement.setInt(3, quantity);
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    
    public void addReview(int service_rev, int delivery_rev, int taste_rev, int users_id, int restaurant_restaurant_id ){
        String query = "Insert Into foodorderv2.review (service_rev,delivery_rev,taste_rev,users_id,restaurant_restaurant_id) VALUES(?,?,?,?,?)";       
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setInt(1, service_rev);
            preparedStatement.setInt(2, delivery_rev);
            preparedStatement.setInt(3, taste_rev);
            preparedStatement.setInt(4, users_id);
            preparedStatement.setInt(5, restaurant_restaurant_id); 
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void addAdmin(String username ,String password){
        String query = "Insert Into foodorderv2.admin (username,password) VALUES(?,?)";       
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }        
     }     
     
    public void addFood(String item_name, String item_catagory, String item_desc, String item_price,int restaurant_restaurant_id) {
        String query = "Insert Into foodorderv2.restaurant_item (item_name,item_catagory,item_desc,item_price, restaurant_restaurant_id) VALUES(?,?,?,?,?)";
        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setString(1, item_name);
            preparedStatement.setString(2, item_catagory);
            preparedStatement.setString(3, item_desc);
            preparedStatement.setString(4, item_price);
            preparedStatement.setInt(5, restaurant_restaurant_id);
            preparedStatement.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
        
    public void updateUser(int id, String new_name, String new_surname, String new_mobile,String new_address, String new_password){
         String query = "Update foodorderv2.users set name = ? ,surname = ?, mobile = ?, address = ? , password = ? where id = ?";
           
        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setString(1, new_name);
            preparedStatement.setString(2, new_surname);
            preparedStatement.setString(3, new_mobile);
            preparedStatement.setString(4, new_address);
            preparedStatement.setString(5, new_password);
            preparedStatement.setInt(6, id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
    public void updateFood(int id, String item_name, String item_catagory, String item_desc, String item_price,int restaurant_restaurant_id){
        String query = "Update foodorderv2.restaurant_item set item_name = ? ,item_catagory = ?, item_desc = ?, item_price = ?,restaurant_restaurant_id = ? where item_id = ?";

        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setString(1, item_name);
            preparedStatement.setString(2, item_catagory);
            preparedStatement.setString(3, item_desc);
            preparedStatement.setString(4, item_price);
            preparedStatement.setInt(5, restaurant_restaurant_id);
            preparedStatement.setInt(6, id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
    
    public void updateReview(int review_id ,int service_rev, int delivery_rev, int taste_rev, int user_id, int restaurant_restaurant_id){
        String query = "Update foodorderv2.review set service_rev = ? , delivery_rev = ?, taste_rev = ?, users_id = ?,restaurant_restaurant_id = ? where review_id = ?";

        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setInt(1, service_rev);
            preparedStatement.setInt(2, delivery_rev);
            preparedStatement.setInt(3, taste_rev);
            preparedStatement.setInt(4, user_id);
            preparedStatement.setInt(5, restaurant_restaurant_id); 
            preparedStatement.setInt(6, review_id); 
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void deleteUser(int id){
         String query = "Delete from foodorderv2.users where id = ?";
        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
    public void deleteFood(int id){
         String query = "Delete from foodorderv2.restaurant_item where item_id = ?";
        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public void deleteReview(int review_id){
         String query = "Delete from foodorderv2.review where review_id = ?";
        try {
            preparedStatement = connect.prepareStatement( query);
            preparedStatement.setInt(1, review_id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}