/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import assignment1.employee;

/**
 *
 * @author HP
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     
     */
    employee emp;
    
    public CreateJPanel(employee emp) {
        initComponents();
        this.emp = emp;
        
    }

    /*CreateJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcreate = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblempid = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbllevel = new javax.swing.JLabel();
        lblteaminfo = new javax.swing.JLabel();
        lblpositiontitle = new javax.swing.JLabel();
        lblphoneno = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtempid = new javax.swing.JTextField();
        intage = new javax.swing.JTextField();
        txtstartdate = new javax.swing.JTextField();
        txtlevel = new javax.swing.JTextField();
        txtteaminfo = new javax.swing.JTextField();
        txtpositiontitle = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnphoto = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnfemale = new javax.swing.JRadioButton();
        btnmale = new javax.swing.JRadioButton();
        btnother = new javax.swing.JRadioButton();

        lblcreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText("Create New Employee");

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setText("Name:");

        lblempid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblempid.setText("Employee ID:");

        lblage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblage.setText("Age:");

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setText("Gender:");

        lbldate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldate.setText("Start Date:");

        lbllevel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbllevel.setText("Level:");

        lblteaminfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblteaminfo.setText("Team Info:");

        lblpositiontitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpositiontitle.setText("Position Title:");

        lblphoneno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblphoneno.setText("Cell Phone No:");

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setText("Email:");

        lblphoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblphoto.setText("Photo:");

        txtempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempidActionPerformed(evt);
            }
        });

        intage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intageActionPerformed(evt);
            }
        });

        btnphoto.setText("Upload");

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.setAlignmentY(0.0F);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnfemale.setText("Female");

        btnmale.setText("Male");

        btnother.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblcreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbllevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbldate)
                                    .addComponent(lblempid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblgender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblphoneno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblpositiontitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblteaminfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblphoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtname)
                                        .addComponent(txtempid)
                                        .addComponent(intage)
                                        .addComponent(txtstartdate)
                                        .addComponent(txtlevel)
                                        .addComponent(txtteaminfo)
                                        .addComponent(txtpositiontitle)
                                        .addComponent(txtphoneno)
                                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                    .addComponent(btnphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmale)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnother))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 266, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblcreate)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblempid)
                            .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblage))
                    .addComponent(intage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblgender)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnfemale)
                        .addComponent(btnmale)
                        .addComponent(btnother)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate)
                    .addComponent(txtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblteaminfo)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpositiontitle)
                    .addComponent(txtpositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphoneno)
                    .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphoto)
                    .addComponent(btnphoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void intageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intageActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        emp.setName(txtname.getText());
        emp.setEmpid(txtempid.getText());
        //emp.setAge(intage.getInteger);
        emp.setGender(txtgender.getText());
        //emp.setStartdate(txtstartdate.getDate());
        emp.setLevel(txtlevel.getText());
        emp.setTeaminfo(txtteaminfo.getText());
        emp.setPositiontitle(txtpositiontitle.getText());
        emp.setPhoneno(txtphoneno.getText());
        emp.setEmail(txtemail.getText());
        
        
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnfemale;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.JRadioButton btnother;
    private javax.swing.JButton btnphoto;
    private javax.swing.JButton btnsave;
    private javax.swing.JTextField intage;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblempid;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lbllevel;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblpositiontitle;
    private javax.swing.JLabel lblteaminfo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtstartdate;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables
}
