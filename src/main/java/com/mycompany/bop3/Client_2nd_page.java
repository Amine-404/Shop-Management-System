/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bop3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mzagh
 */
public class Client_2nd_page extends javax.swing.JFrame {

    /**
     * Creates new form Client_2nd_page
     */
    public Client_2nd_page() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnViewBooks = new javax.swing.JButton();
        jBtnSearchByID = new javax.swing.JButton();
        jBtnSearchByName = new javax.swing.JButton();
        jTxtID = new javax.swing.JTextField();
        jTxtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Welcome Dear Client!");

        jBtnViewBooks.setText("View Books");
        jBtnViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewBooksActionPerformed(evt);
            }
        });

        jBtnSearchByID.setText("Search By ID");
        jBtnSearchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchByIDActionPerformed(evt);
            }
        });

        jBtnSearchByName.setText("Search By Name");
        jBtnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchByNameActionPerformed(evt);
            }
        });

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameActionPerformed(evt);
            }
        });

        jLabel3.setText("ID :");

        jLabel4.setText("Name : ");

        jBtnHome.setText("Home Page");
        jBtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(189, 189, 189)
                .addComponent(jBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnSearchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSearchByName))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jTxtName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(jBtnHome))
                .addGap(33, 33, 33)
                .addComponent(jBtnViewBooks)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtID)
                        .addComponent(jLabel3))
                    .addComponent(jBtnSearchByID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSearchByName)
                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewBooksActionPerformed
        // TODO add your handling code here:
        ViewBooks next = new ViewBooks();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnViewBooksActionPerformed

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

    private void jTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameActionPerformed

    private void jBtnSearchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchByIDActionPerformed
        // TODO add your handling code here:
        String id = jTxtID.getText();
        if(id.equals("")){
        JOptionPane.showMessageDialog(rootPane,"Please Enter the ID: ");
        }
        ArrayList<Book> ArrayBooks = new ArrayList<>();
        File f = new File("Book.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayBooks = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
        }
         boolean Exist = false;
         for(int i =0;i<ArrayBooks.size();i++){
             if (ArrayBooks.get(i).bookID==Integer.parseInt(id)){
                 JOptionPane.showMessageDialog(rootPane, "Book ID: "+ArrayBooks.get(i).bookID +"\nName:  "+ArrayBooks.get(i).bookName+"\nPrice:  "+ArrayBooks.get(i).price+"\nCopies Number:  "+ArrayBooks.get(i).copiesNumber+"\nAuthor Name:  "+ArrayBooks.get(i).authorName+"\nPublished:  "+ArrayBooks.get(i).dateOfPublishing);
                 Exist = true;
                 break;
             }
         }
         if (Exist == false){
             JOptionPane.showMessageDialog(rootPane,"Book does not Exist");
         }
    }//GEN-LAST:event_jBtnSearchByIDActionPerformed

    private void jBtnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchByNameActionPerformed
        // TODO add your handling code here:
        String name = jTxtName.getText();
        if (name.equals("")){
             JOptionPane.showMessageDialog(rootPane,"Please Enter the name: ");
         }
        ArrayList<Book> ArrayBooks = new ArrayList<>();
        File f = new File("Book.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayBooks = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
        }
         boolean Exist = false;
         for(int i =0;i<ArrayBooks.size();i++){
             if (ArrayBooks.get(i).bookName.equals(name)){
                 JOptionPane.showMessageDialog(rootPane, "Book ID: "+ArrayBooks.get(i).bookID +"\nName:  "+ArrayBooks.get(i).bookName+"\nPrice:  "+ArrayBooks.get(i).price+"\nCopies Number:  "+ArrayBooks.get(i).copiesNumber+"\nAuthor Name:  "+ArrayBooks.get(i).authorName+"\nPublished:  "+ArrayBooks.get(i).dateOfPublishing);
                 Exist = true;
                 break;
             }
         }
         if (Exist == false){
             JOptionPane.showMessageDialog(rootPane,"Book does not Exist");
         }
        
    }//GEN-LAST:event_jBtnSearchByNameActionPerformed

    private void jBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeActionPerformed
        // TODO add your handling code here:
        welcome first = new welcome();
        first.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Client_2nd_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_2nd_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_2nd_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_2nd_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_2nd_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnHome;
    private javax.swing.JButton jBtnSearchByID;
    private javax.swing.JButton jBtnSearchByName;
    private javax.swing.JButton jBtnViewBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtName;
    // End of variables declaration//GEN-END:variables
}
