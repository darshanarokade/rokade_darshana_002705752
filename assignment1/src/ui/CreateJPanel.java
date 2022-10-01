/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileFilter;
import assignment1.EmpDetails;
import assignment1.Employee;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import java.io.File;
import java.util.Date;


/**
 *
 * @author HP
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     *
     */
    
    
    EmpDetails emp;
    String selectedImagePath = "";

    public CreateJPanel(EmpDetails emp) {
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

        gendergroup = new javax.swing.ButtonGroup();
        lblcreate = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        javax.swing.JLabel lblname = new javax.swing.JLabel();
        javax.swing.JLabel lblempid = new javax.swing.JLabel();
        javax.swing.JLabel lbldob = new javax.swing.JLabel();
        javax.swing.JLabel lblgender = new javax.swing.JLabel();
        javax.swing.JLabel lbldate = new javax.swing.JLabel();
        javax.swing.JLabel lbllevel = new javax.swing.JLabel();
        javax.swing.JLabel lblteaminfo = new javax.swing.JLabel();
        javax.swing.JLabel lblpositiontitle = new javax.swing.JLabel();
        javax.swing.JLabel lblphoneno = new javax.swing.JLabel();
        javax.swing.JLabel lblemail = new javax.swing.JLabel();
        javax.swing.JLabel lblphoto = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        txtteaminfo = new javax.swing.JTextField();
        txtpositiontitle = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnphoto = new javax.swing.JButton();
        btnfemale = new javax.swing.JRadioButton();
        btnmale = new javax.swing.JRadioButton();
        btnother = new javax.swing.JRadioButton();
        choosestartdate = new com.toedter.calendar.JDateChooser();
        choosedob = new com.toedter.calendar.JDateChooser();
        txtname = new javax.swing.JTextField();
        lblphotoselected = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 102));
        setMinimumSize(new java.awt.Dimension(1095, 608));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcreate.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText(" Create  New  Employee");
        lblcreate.setToolTipText("");
        add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, 60));

        btnsave.setBackground(new java.awt.Color(0, 0, 0));
        btnsave.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("SAVE");
        btnsave.setAlignmentY(0.0F);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        btnsave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsaveKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnsaveKeyReleased(evt);
            }
        });
        add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 89, -1));

        lblname.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblname.setText("Name:");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 92, 100, -1));

        lblempid.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblempid.setText("Employee ID:");
        add(lblempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 132, 130, -1));

        lbldob.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lbldob.setText("Date Of Birth");
        add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 174, 130, -1));

        lblgender.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblgender.setText("Gender:");
        add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 215, 100, -1));

        lbldate.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lbldate.setText("Start Date:");
        add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 253, -1, -1));

        lbllevel.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lbllevel.setText("Level:");
        add(lbllevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 293, 100, -1));

        lblteaminfo.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblteaminfo.setText("Team Info:");
        add(lblteaminfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 333, 100, -1));

        lblpositiontitle.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblpositiontitle.setText("Position Title:");
        add(lblpositiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 373, 120, -1));

        lblphoneno.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblphoneno.setText("Phone No:");
        add(lblphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 40));

        lblemail.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblemail.setText("Email:");
        add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 100, -1));

        lblphoto.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        lblphoto.setText("Photo:");
        add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 100, -1));

        txtempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempidActionPerformed(evt);
            }
        });
        add(txtempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 132, 300, -1));
        add(txtteaminfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 335, 300, -1));
        add(txtpositiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 375, 300, -1));

        txtphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenoActionPerformed(evt);
            }
        });
        add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 415, 300, -1));
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 300, -1));

        btnphoto.setBackground(new java.awt.Color(0, 0, 0));
        btnphoto.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        btnphoto.setForeground(new java.awt.Color(255, 255, 255));
        btnphoto.setText("Browse");
        btnphoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnphotoMouseClicked(evt);
            }
        });
        btnphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphotoActionPerformed(evt);
            }
        });
        add(btnphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 100, -1));

        gendergroup.add(btnfemale);
        btnfemale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnfemale.setText("Female");
        btnfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfemaleActionPerformed(evt);
            }
        });
        add(btnfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 216, -1, -1));

        gendergroup.add(btnmale);
        btnmale.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnmale.setText("Male");
        add(btnmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 216, -1, -1));

        gendergroup.add(btnother);
        btnother.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnother.setText("Other");
        add(btnother, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 216, -1, -1));
        add(choosestartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 255, 300, -1));
        add(choosedob, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 174, 300, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 92, 300, -1));

        lblphotoselected.setBackground(new java.awt.Color(255, 153, 102));
        lblphotoselected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblphotoselected.setToolTipText("");
        lblphotoselected.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblphotoselected.setOpaque(true);
        add(lblphotoselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 190, 20));
        add(txtlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 295, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/add-user (1).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 190, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtname.getText();
        String empid = txtempid.getText();
        Date dob = choosedob.getDate();
        String gender = "";
        
        if (btnfemale.isSelected()) {
            gender = "Female";
        } else if (btnmale.isSelected()) {
            gender = "Male";
        } else if (btnother.isSelected()) {
            gender = "Other";
        }
        
        ButtonGroup group = new ButtonGroup();
        group.add(btnfemale);
        group.add(btnmale);
        group.add(btnother);
        
        Date startdate = choosestartdate.getDate();
        String level= txtlevel.getText();
        String positiontitle = txtpositiontitle.getText();
        String phoneno = txtphoneno.getText();
        
        /*int length = phoneno.length();
        char c;
        c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' || evt.getKeyChar()<='9')
        {
            if (length<10){
                txtphoneno.setEditable(true);
            }
            else{
                txtphoneno.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                txtphoneno.setEditable(true);
            }else{
                txtphoneno.setEditable(false);
            }
                
        }*/

        
        String email = txtemail.getText();
        // Refer txtnameKeyReleased method for validation
        
        
        String photo = lblphotoselected.getText();

        if (name.equals("")
                || dob == (null)
                || empid.equals("")
                || startdate == (null)
                || level.equals("")
                || positiontitle.equals("")
                || phoneno.equals("")
                || ((btnfemale.isSelected() || btnmale.isSelected() || btnother.isSelected()) == false)
                || email.equals("") 
                || photo == null)
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry");
        } else {
            
            Employee em = emp.addNewEmp();
            em.setName(name);
            em.setEmpid(empid);
            em.setDob(dob);
            em.setGender(gender);
            em.setStartdate(startdate);
            em.setLevel(level);
            em.setPositiontitle(positiontitle);
            em.setPhoneno(phoneno);
            em.setEmail(email);
            //em.setPhoto(photo);

            JOptionPane.showMessageDialog(this, "New Employee Added");

            txtname.setText("");
            txtempid.setText("");
            choosedob.setDate(null);
            gendergroup.clearSelection();
            choosestartdate.setDate(null);
            txtlevel.setText("");
            txtpositiontitle.setText("");
            txtphoneno.setText("");
            txtemail.setText("");
            txtteaminfo.setText("");
            lblphotoselected.setText("");
            
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempidActionPerformed
        // TODO add your handling code here;
    }//GEN-LAST:event_txtempidActionPerformed


    private void txtphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtphonenoActionPerformed

    private void btnfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfemaleActionPerformed

    private void btnphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphotoActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == APPROVE_OPTION)
        {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            lblphotoselected.setText(selectedImagePath);
        }
        
        
    }//GEN-LAST:event_btnphotoActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
    private void btnsaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveKeyPressed

    private void btnsaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsaveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveKeyReleased
/*
    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        String PATTERN= "[a-zA-Z]";
        var patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtname.getText());
        if(match.matches()){
            txtname.setText("Invalid Name");
        }else
            txtname.setText(null);
    }//GEN-LAST:event_txtnameKeyReleased
*/

    private void btnphotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnphotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnphotoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnfemale;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.JRadioButton btnother;
    private javax.swing.JButton btnphoto;
    private javax.swing.JButton btnsave;
    private com.toedter.calendar.JDateChooser choosedob;
    private com.toedter.calendar.JDateChooser choosestartdate;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lblphotoselected;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables

}
