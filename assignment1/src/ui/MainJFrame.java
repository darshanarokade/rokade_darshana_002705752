/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import assignment1.EmpDetails;
import assignment1.Employee;
import javax.swing.*;


/**
 *
 * @author HP
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    EmpDetails emp;
    
    public MainJFrame() {
        initComponents();
        
        emp = new EmpDetails();
 
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpane = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        javax.swing.JPanel workarea = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        controlpanel.setBackground(new java.awt.Color(255, 255, 204));
        controlpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        btncreate.setBackground(new java.awt.Color(204, 255, 204));
        btncreate.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btncreate.setText("Create New Employee");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnview.setBackground(new java.awt.Color(204, 255, 204));
        btnview.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnview.setText("View Employee");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btncreate)
                .addGap(39, 39, 39)
                .addComponent(btnview)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        splitpane.setLeftComponent(controlpanel);

        workarea.setBackground(new java.awt.Color(255, 255, 204));
        workarea.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        workarea.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        workarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Human Resources Portal");
        workarea.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 340, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Personal-Crowd-Silhouettes-Human-Group-Of-People-2045498.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setMaximumSize(new java.awt.Dimension(1500, 1500));
        workarea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 500, 520));

        splitpane.setRightComponent(workarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitpane, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addGap(853, 853, 853))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(emp);
        splitpane.setRightComponent(createPanel);
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(emp);
        splitpane.setRightComponent(viewPanel);
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnview;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane splitpane;
    // End of variables declaration//GEN-END:variables

}