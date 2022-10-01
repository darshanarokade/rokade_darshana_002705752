/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.*;
import assignment1.Employee;
import assignment1.EmpDetails;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author HP
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    ;
    
    EmpDetails emp;
    
    public ViewJPanel(EmpDetails emp) {
        initComponents();
        this.emp= emp;
       
        populateTable();
    }

    /*ViewJPanel() {
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

        javax.swing.JLabel lblcreate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemp = new javax.swing.JTable();
        javax.swing.JButton btnupdate = new javax.swing.JButton();
        javax.swing.JButton btndelete = new javax.swing.JButton();
        btnviewemp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblphoto1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblgender1 = new javax.swing.JLabel();
        lblteaminfo1 = new javax.swing.JLabel();
        lbldob1 = new javax.swing.JLabel();
        lbllevel1 = new javax.swing.JLabel();
        lblstartdate1 = new javax.swing.JLabel();
        lblempid1 = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        lblpositiontitle1 = new javax.swing.JLabel();
        lblphoneno1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblemail1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setBorder(new javax.swing.border.MatteBorder(null));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcreate.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        lblcreate.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\list.png")); // NOI18N
        lblcreate.setText("List of Employees");
        add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1020, 80));

        tblemp.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.icon.focusedBackground"));
        tblemp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblemp.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Date Of Birth", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone no", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblemp.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblemp);
        if (tblemp.getColumnModel().getColumnCount() > 0) {
            tblemp.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1180, 178));

        btnupdate.setBackground(new java.awt.Color(255, 255, 153));
        btnupdate.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnupdate.setText("Update Employee");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 160, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 153));
        btndelete.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btndelete.setText("Delete Employee");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 160, -1));

        btnviewemp.setBackground(new java.awt.Color(255, 255, 153));
        btnviewemp.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnviewemp.setText("View Employee");
        btnviewemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewempActionPerformed(evt);
            }
        });
        add(btnviewemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 160, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        lblphoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/employee.png"))); // NOI18N
        lblphoto1.setText("jLabel1");
        lblphoto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Details");

        lblgender1.setForeground(new java.awt.Color(153, 153, 153));
        lblgender1.setText("Gender");

        lblteaminfo1.setForeground(new java.awt.Color(153, 153, 153));
        lblteaminfo1.setText("Team Info");

        lbldob1.setForeground(new java.awt.Color(153, 153, 153));
        lbldob1.setText("DOB");

        lbllevel1.setForeground(new java.awt.Color(153, 153, 153));
        lbllevel1.setText("level");

        lblstartdate1.setForeground(new java.awt.Color(153, 153, 153));
        lblstartdate1.setText("Start Date");

        lblempid1.setForeground(new java.awt.Color(153, 153, 153));
        lblempid1.setText("EmpID");

        lblname1.setText("Name");

        lblpositiontitle1.setForeground(new java.awt.Color(153, 153, 153));
        lblpositiontitle1.setText("Position Title");

        lblphoneno1.setForeground(new java.awt.Color(153, 153, 153));
        lblphoneno1.setText("Contact No");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date of Birth:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Employee ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Name: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Start Date:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Level:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Team Info:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Position Title:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Contact No.");

        lblemail1.setForeground(new java.awt.Color(153, 153, 153));
        lblemail1.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblname1)
                                    .addComponent(lblempid1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstartdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblteaminfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbllevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpositiontitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblemail1)
                                    .addComponent(lblphoneno1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldob1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 88, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblempid1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbldob1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblstartdate1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblgender1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbllevel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblteaminfo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblpositiontitle1))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblemail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblphoneno1))
                        .addGap(23, 23, 23)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 780, 376));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        txtsearch.setBackground(new java.awt.Color(255, 255, 153));
        txtsearch.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txtsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch.setText("Search...");
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 150, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/recruitment.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 80, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        System.out.println("Delete button pressed");
        int selectedRowIndex = tblemp.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please selct a row to Delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex,0);
        
        emp.deleteEmp(selectedEmp);
        
        JOptionPane.showMessageDialog(this, "Employee deleted");
        
        lblgender1.setText("");
        lblname1.setText("");
        lblempid1.setText("");
        lbldob1.setText("");
        lblgender1.setText("");
        lblstartdate1.setText("");
        lbllevel1.setText("");
        lblpositiontitle1.setText("");
        lblphoneno1.setText("");
        lblemail1.setText("");
        lblteaminfo1.setText("");
        
        populateTable();
        
    }//GEN-LAST:event_btndeleteActionPerformed

    /*
    public void filter(String query){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tblemp);
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(emp)
    }
*/
    private void btnviewempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewempActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblemp.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please selct a row to View Details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selectedRowIndex,0);
        //lblphoto1 = new JLabel(new ImageIcon(selectedEmp.getPhoto()));
        jPanel1.add(lblphoto1);
        
        // to Display the data in Panel1
        lblgender1.setText("");
        
        //lblphoto1.setText(selectedEmp.getphoto());
        
        lblname1.setText(selectedEmp.getName());
        lblempid1.setText(selectedEmp.getEmpid());
        lbldob1.setText(String.valueOf(selectedEmp.getDate()));
        lblgender1.setText(String.valueOf(selectedEmp.getGender()));
        lblstartdate1.setText(String.valueOf(selectedEmp.getStartdate()));
        lbllevel1.setText(selectedEmp.getLevel());
        lblteaminfo1.setText(selectedEmp.getTeaminfo());
        lblpositiontitle1.setText(selectedEmp.getPositiontitle());
        lblphoneno1.setText(selectedEmp.getPhoneno());
        lblemail1.setText(selectedEmp.getEmail());
        
    }//GEN-LAST:event_btnviewempActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (model);
        tblemp.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText().trim()));
        
        //filter(query);
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (model);
        tblemp.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText().trim()));
    }//GEN-LAST:event_txtsearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnviewemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldob1;
    private javax.swing.JLabel lblemail1;
    private javax.swing.JLabel lblempid1;
    private javax.swing.JLabel lblgender1;
    private javax.swing.JLabel lbllevel1;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblphoneno1;
    private javax.swing.JLabel lblphoto1;
    private javax.swing.JLabel lblpositiontitle1;
    private javax.swing.JLabel lblstartdate1;
    private javax.swing.JLabel lblteaminfo1;
    private javax.swing.JTable tblemp;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
        model.setRowCount(0);
        
        for (Employee e : emp.getEmp()){
            Object[] row = new Object[15];
            row[0]=e;
            row[1]=e.getEmpid();
            row[2]=e.getDob();
            row[3]=e.getGender();
            row[4]=e.getStartdate();
            row[5]=e.getLevel();
            row[6]=e.getTeaminfo();
            row[7]=e.getPositiontitle();
            row[8]=e.getPhoneno();
            row[9]=e.getEmail();
            
            
            model.addRow(row);
            
        }
    }
}
    

