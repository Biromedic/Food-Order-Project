/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package foodorderproject;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Biromedic
 */
public class ReviewsForAdmin extends javax.swing.JDialog {
    DefaultTableModel model;
    DataBaseConnection dbc = new DataBaseConnection();

    /**
     * Creates new form ReviewsForAdmin
     */
    public ReviewsForAdmin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)review_table.getModel();
        showReviews();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        Review = new javax.swing.JPanel();
        service_rev = new javax.swing.JLabel();
        delivery_rev = new javax.swing.JLabel();
        taste_review = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        review_table = new javax.swing.JTable();
        User_ID = new javax.swing.JLabel();
        messeage_area = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        User_id_area = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_review = new javax.swing.JButton();
        serviceReview = new javax.swing.JTextField();
        deliveryReview = new javax.swing.JTextField();
        tasteReview = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Review.setBackground(new java.awt.Color(204, 204, 255));
        Review.setForeground(new java.awt.Color(204, 204, 255));

        service_rev.setBackground(new java.awt.Color(204, 204, 204));
        service_rev.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        service_rev.setText("Service Review :");

        delivery_rev.setBackground(new java.awt.Color(204, 204, 255));
        delivery_rev.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delivery_rev.setText("Delivery Review : ");

        taste_review.setBackground(new java.awt.Color(204, 204, 255));
        taste_review.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taste_review.setText("Taste Review : ");

        review_table.setBackground(new java.awt.Color(255, 204, 204));
        review_table.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        review_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Review ID", "Service Review", "Delivery Review", "Taste Review", "User ID", "Restaurant ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        review_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                review_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(review_table);
        if (review_table.getColumnModel().getColumnCount() > 0) {
            review_table.getColumnModel().getColumn(0).setResizable(false);
            review_table.getColumnModel().getColumn(1).setResizable(false);
            review_table.getColumnModel().getColumn(2).setResizable(false);
            review_table.getColumnModel().getColumn(3).setResizable(false);
            review_table.getColumnModel().getColumn(4).setResizable(false);
            review_table.getColumnModel().getColumn(5).setResizable(false);
        }

        User_ID.setBackground(new java.awt.Color(204, 204, 255));
        User_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        User_ID.setText("User ID :");

        messeage_area.setBackground(new java.awt.Color(204, 204, 255));
        messeage_area.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        messeage_area.setForeground(new java.awt.Color(51, 51, 255));

        delete_btn.setBackground(new java.awt.Color(255, 204, 204));
        delete_btn.setForeground(new java.awt.Color(255, 153, 153));
        delete_btn.setText("Delete Review");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(255, 204, 204));
        update_btn.setForeground(new java.awt.Color(102, 102, 255));
        update_btn.setText("Update Review");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        add_review.setBackground(new java.awt.Color(255, 204, 204));
        add_review.setForeground(new java.awt.Color(51, 51, 255));
        add_review.setText("Add Review");
        add_review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_reviewActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(255, 204, 204));
        back_btn.setForeground(new java.awt.Color(51, 51, 255));
        back_btn.setText("Back");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ReviewLayout = new javax.swing.GroupLayout(Review);
        Review.setLayout(ReviewLayout);
        ReviewLayout.setHorizontalGroup(
            ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReviewLayout.createSequentialGroup()
                .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(ReviewLayout.createSequentialGroup()
                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReviewLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReviewLayout.createSequentialGroup()
                                        .addComponent(messeage_area, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(505, 505, 505)
                                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(update_btn)
                                            .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(add_review, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(delete_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(ReviewLayout.createSequentialGroup()
                                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(service_rev)
                                            .addComponent(delivery_rev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(taste_review, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(User_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(User_id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(serviceReview, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deliveryReview, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tasteReview, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ReviewLayout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 342, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ReviewLayout.setVerticalGroup(
            ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReviewLayout.createSequentialGroup()
                .addComponent(back_btn)
                .addGap(65, 65, 65)
                .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_rev)
                    .addComponent(serviceReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delivery_rev))
                .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReviewLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taste_review)
                            .addComponent(tasteReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(ReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(User_ID)
                            .addComponent(User_id_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReviewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_review)
                        .addGap(39, 39, 39)
                        .addComponent(delete_btn)
                        .addGap(48, 48, 48)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(messeage_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Review, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Review, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showReviews(){
        model.setRowCount(0); 
        ArrayList<Review> review = new ArrayList<Review>();
        review = dbc.getTheReview();
        if(review != null){
            for(Review rev: review ){
            Object[] add = {rev.getReview_id(),rev.getService_rev(),rev.getDelivery_rev(),rev.getTaste_rev(),rev.getUsers_id(),rev.getRestaurant_restaurant_id()};
            model.addRow(add);
            }
        }
    }   
    
    private void review_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_review_tableMouseClicked
        int selectedRow = review_table.getSelectedRow();
        serviceReview.setText(Integer.toString((int) model.getValueAt(selectedRow, 1)));
        deliveryReview.setText(Integer.toString((int) model.getValueAt(selectedRow, 2)));
        tasteReview.setText(Integer.toString((int) model.getValueAt(selectedRow, 3)));
        User_id_area.setText(Integer.toString((int) model.getValueAt(selectedRow, 4)));    
    }//GEN-LAST:event_review_tableMouseClicked

    private void add_reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_reviewActionPerformed
          
       messeage_area.setText("");
       Integer service = Integer.valueOf(serviceReview.getText());
       Integer delivery = Integer.valueOf(deliveryReview.getText());
       Integer taste = Integer.valueOf(tasteReview.getText());
       Integer user_id = Integer.valueOf(User_id_area.getText());
       
       if( service < 1 || service > 5 && delivery < 1 || delivery > 5 && taste < 1 || taste > 5 ){
       
           messeage_area.setText("Review points can be between 1 and 5.");
       }
       else{
                      
           dbc.addReview(service, delivery, taste, user_id, 1);
           showReviews();
           messeage_area.setText("Review has added.");
       }
    }//GEN-LAST:event_add_reviewActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
       messeage_area.setText("");
       int selectedRow = review_table.getSelectedRow();
       if(selectedRow == -1){
           if(model.getRowCount() == 0){
               messeage_area.setText("No data");
           }else{
           messeage_area.setText("Please click one of the review to delete.");
           }
       }else{
           int id = (int) model.getValueAt(selectedRow,0);
           dbc.deleteReview(id);
           showReviews();
           messeage_area.setText("Review has successfully deleted.");
       }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
       Integer service = Integer.valueOf(serviceReview.getText());
       Integer delivery = Integer.valueOf(deliveryReview.getText());
       Integer taste = Integer.valueOf(tasteReview.getText());
       Integer user_id = Integer.valueOf(User_id_area.getText());
       
       int selectedRow = review_table.getSelectedRow();
       if(selectedRow == -1){
           if(model.getRowCount() == 0){
               messeage_area.setText("No data");
           }else{
           messeage_area.setText("Please click one of the food to change.");
           }
       }else{
           if( service < 1 || service > 5 && delivery < 1 || delivery > 5 && taste < 1 || taste > 5 ){
       
           messeage_area.setText("Review points can be between 1 and 5.");
       }
       else{
           int id = (int) model.getValueAt(selectedRow,0);
           dbc.updateReview(id,service, delivery, taste, user_id, 1);
           showReviews();
           messeage_area.setText("Review has updated.");
       }
       
    }
    }//GEN-LAST:event_update_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ReviewsForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewsForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewsForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewsForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReviewsForAdmin dialog = new ReviewsForAdmin(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Review;
    private javax.swing.JLabel User_ID;
    private javax.swing.JTextField User_id_area;
    private javax.swing.JButton add_review;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField deliveryReview;
    private javax.swing.JLabel delivery_rev;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField messeage_area;
    private javax.swing.JTable review_table;
    private javax.swing.JTextField serviceReview;
    private javax.swing.JLabel service_rev;
    private javax.swing.JTextField tasteReview;
    private javax.swing.JLabel taste_review;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}