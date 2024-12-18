/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Manish Sharma
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Receipt
     */
    public Receipt() {
        initComponents();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Travelmanagement","root","Manish6022@");
              String query="select * from booking order by id desc limit 1";
            Statement ps=con.createStatement();
            ResultSet rs=ps.executeQuery(query);
             StringBuilder count=new StringBuilder();
           StringBuilder sname=new StringBuilder();
           StringBuilder sdestination=new StringBuilder();
           StringBuilder sto=new StringBuilder();
           StringBuilder spackage=new StringBuilder();
           StringBuilder speople=new StringBuilder();
           StringBuilder sprice=new StringBuilder();
           StringBuilder sdate=new StringBuilder();
            if(rs.next())
            {         count.append("\n");
                      count.append("").append(rs.getString("id"));
                      sname.append("\n");
                       sname.append("").append(rs.getString("customername")); 
                 tname.setText(sname.toString());
                  sdestination.append("\n");
                      sdestination.append(" ").append(rs.getString("destination")); 
                  tdestination.setText(sdestination.toString());
                   sto.append("\n");
                    sto.append("").append(rs.getString("T_o"));
                 tto.setText(sto.toString());
                  sdate.append("\n");
                     sdate.append("").append(rs.getString("traveldate"));
                   ttravel.setText(sdate.toString());
                   spackage.append("\n");
                     spackage.append("").append(rs.getString("packagename"));
                     tpackage.setText(spackage.toString());
                      sprice.append("\n");
                      sprice.append("").append(rs.getString("totalprice"));
                    tprice.setText(sprice.toString());
                     speople.append("\n");
                     speople.append("").append(rs.getString("people"));
                     tpeople.setText(speople.toString());
                    
                }
            
           
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,"error");
    }
     
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
        jButton2 = new javax.swing.JButton();
        tname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tpackage = new javax.swing.JTextField();
        tpeople = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        ttravel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        tdestination = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Print");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 80, -1));
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 207, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("People;-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel1.add(tpackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 71, -1));
        jPanel1.add(tpeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 71, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Package:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 77, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Price:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 60, -1));

        tprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpriceActionPerformed(evt);
            }
        });
        jPanel1.add(tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 71, -1));
        jPanel1.add(ttravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 71, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Name:-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("Travel Date:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Destination:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 422, 560));
        jPanel1.add(tdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("to");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("Receipt");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 70, -1));
        jPanel1.add(tto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 110, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirm");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 540, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 850, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            area.print();
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        area.setText("*************************************************\n");
        area.setText(area.getText()+"\t   Travel Receipt                   .\n");
        area.setText(area.getText()+"*************************************************\n");
        Date obj=new Date();
        String date = obj.toString();
        area.setText(area.getText()+"\n"+date);
        area.setText(area.getText()+"\n\n\nName :  "+tname.getText()+"\n");
        area.setText(area.getText()+"Destination:  "+tdestination.getText()+" To "+tto.getText()+"\n");
        area.setText(area.getText()+"Package :  "+tpackage.getText()+"\n");
        area.setText(area.getText()+"People :  "+tpeople.getText()+"\n");
        area.setText(area.getText()+"Date :  "+ttravel.getText()+"\n");
        area.setText(area.getText()+"\n\n\nPrice :  "+tprice.getText()+"\n");
        area.setText(area.getText()+"\t\t\tSignature :  ");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ThankYou ty = new ThankYou();
ty.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tdestination;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tpackage;
    private javax.swing.JTextField tpeople;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tto;
    private javax.swing.JTextField ttravel;
    // End of variables declaration//GEN-END:variables
}
