/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package foodorderproject;


import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Biromedic
 */
public class RestaurantForAdmin extends javax.swing.JDialog {
    DefaultTableModel model;
    DataBaseConnection dbc = new DataBaseConnection();

    /**
     * Creates new form RestaurantForAdmin
     * @param parent
     * @param modal
     */
    public RestaurantForAdmin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)content_table.getModel();
        showFood();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        content_table = new javax.swing.JTable();
        food_name_area = new javax.swing.JLabel();
        food_catagory_area = new javax.swing.JLabel();
        food_description_area = new javax.swing.JLabel();
        food_price_area = new javax.swing.JLabel();
        name_area = new javax.swing.JTextField();
        catagory_area = new javax.swing.JTextField();
        description_area = new javax.swing.JTextField();
        price_area = new javax.swing.JTextField();
        SearchBar = new javax.swing.JTextField();
        update_food_btn = new javax.swing.JButton();
        add_food_btn = new javax.swing.JButton();
        delete_food_btn = new javax.swing.JButton();
        messeage_area = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        content_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food Name", "Food Catagory", "Food Description", "Food Price ", "Resaturant ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        content_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                content_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(content_table);
        if (content_table.getColumnModel().getColumnCount() > 0) {
            content_table.getColumnModel().getColumn(0).setResizable(false);
            content_table.getColumnModel().getColumn(1).setResizable(false);
            content_table.getColumnModel().getColumn(2).setResizable(false);
            content_table.getColumnModel().getColumn(3).setResizable(false);
            content_table.getColumnModel().getColumn(4).setResizable(false);
            content_table.getColumnModel().getColumn(5).setResizable(false);
        }

        food_name_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        food_name_area.setText("Food Name");

        food_catagory_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        food_catagory_area.setText("Food Catagory");

        food_description_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        food_description_area.setText("Food Description");

        food_price_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        food_price_area.setText("Food Price");

        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });
        SearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBarKeyReleased(evt);
            }
        });

        update_food_btn.setBackground(new java.awt.Color(255, 204, 204));
        update_food_btn.setForeground(new java.awt.Color(51, 51, 255));
        update_food_btn.setText("Update Food");
        update_food_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_food_btnActionPerformed(evt);
            }
        });

        add_food_btn.setBackground(new java.awt.Color(255, 204, 204));
        add_food_btn.setForeground(new java.awt.Color(51, 51, 255));
        add_food_btn.setText("Add Food");
        add_food_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_food_btnActionPerformed(evt);
            }
        });

        delete_food_btn.setBackground(new java.awt.Color(255, 204, 204));
        delete_food_btn.setForeground(new java.awt.Color(204, 51, 0));
        delete_food_btn.setText("Delete Food");
        delete_food_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_food_btnActionPerformed(evt);
            }
        });

        messeage_area.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        messeage_area.setForeground(new java.awt.Color(255, 51, 0));

        back_btn.setBackground(new java.awt.Color(255, 204, 204));
        back_btn.setForeground(new java.awt.Color(51, 51, 255));
        back_btn.setText("Back");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchBar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(food_name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(food_description_area)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(description_area, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(food_catagory_area, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(catagory_area, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(164, 164, 164)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_food_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_food_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_food_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(food_price_area, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(messeage_area, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(price_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(301, 301, 301))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(food_name_area, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(add_food_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(description_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(food_description_area, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(food_price_area, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(catagory_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(food_catagory_area, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_food_btn)
                                .addGap(27, 27, 27)))
                        .addComponent(delete_food_btn)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(messeage_area)
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showFood() {
        model.setRowCount(0);
        ArrayList<Food> food = new ArrayList<Food>();
        food = dbc.getTheFood();
        if(food != null){
            for(Food foods: food ){
            Object[] add = {foods.getItem_id(),foods.getItem_name(),foods.getItem_catagory(),foods.getItem_description(),foods.getItem_price(),foods.getRestaurant_id()};
            model.addRow(add);
            }
        }
    }      
    
    public void findDynamically(String search){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        content_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    } 
    
    private void SearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBarKeyReleased
        String search = SearchBar.getText();
        findDynamically(search);
    }//GEN-LAST:event_SearchBarKeyReleased

    private void add_food_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_food_btnActionPerformed
       messeage_area.setText("");
       String name = name_area.getText();
       String catagory = catagory_area.getText();
       String description = description_area.getText();
       String price = price_area.getText();
       
       dbc.addFood(name,catagory,description,price,1);
       showFood();
       
       messeage_area.setText("Food has added.");
    }//GEN-LAST:event_add_food_btnActionPerformed

    private void update_food_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_food_btnActionPerformed
       String name = name_area.getText();
       String catagory = catagory_area.getText();
       String description = description_area.getText();
       String price = price_area.getText();
       
       int selectedRow = content_table.getSelectedRow();
       if(selectedRow == -1){
           if(model.getRowCount() == 0){
               messeage_area.setText("No data");
           }else{
           messeage_area.setText("Please click one of the food to change.");
           }
       }else{
           int id = (int) model.getValueAt(selectedRow,0);
           dbc.updateFood(id,name, catagory, description, price, 1);
           showFood();
           messeage_area.setText("Food has successfully updated");
       }
    }//GEN-LAST:event_update_food_btnActionPerformed

    private void delete_food_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_food_btnActionPerformed
       messeage_area.setText("");
       int selectedRow = content_table.getSelectedRow();
       if(selectedRow == -1){
           if(model.getRowCount() == 0){
               messeage_area.setText("No data");
           }else{
           messeage_area.setText("Please click one of the food to delete.");
           }
       }else{
           int id = (int) model.getValueAt(selectedRow,0);
           dbc.deleteFood(id);
           showFood();
           messeage_area.setText("Food has successfully deleted.");
       }
    }//GEN-LAST:event_delete_food_btnActionPerformed

    private void content_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_content_tableMouseClicked
        int selectedRow = content_table.getSelectedRow();
        name_area.setText((String) model.getValueAt(selectedRow, 1));
        catagory_area.setText((String) model.getValueAt(selectedRow, 2));
        description_area.setText((String) model.getValueAt(selectedRow, 3));
        price_area.setText((String) model.getValueAt(selectedRow, 4));  
    }//GEN-LAST:event_content_tableMouseClicked

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        UsersScreen us = new UsersScreen(null,true);
        setVisible(false);
        us.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RestaurantForAdmin dialog = new RestaurantForAdmin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton add_food_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField catagory_area;
    private javax.swing.JTable content_table;
    private javax.swing.JButton delete_food_btn;
    private javax.swing.JTextField description_area;
    private javax.swing.JLabel food_catagory_area;
    private javax.swing.JLabel food_description_area;
    private javax.swing.JLabel food_name_area;
    private javax.swing.JLabel food_price_area;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel messeage_area;
    private javax.swing.JTextField name_area;
    private javax.swing.JTextField price_area;
    private javax.swing.JButton update_food_btn;
    // End of variables declaration//GEN-END:variables
}
