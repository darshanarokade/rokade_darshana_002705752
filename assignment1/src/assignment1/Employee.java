/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.util.Date;

/**
 *
 * @author HP
 */

public class Employee {
    
    private String name;
    private String empid;
    private Date dob;
    private String gender;
    private Date startdate;
    private String level;
    private String teaminfo;
    private String positiontitle;
    private String phoneno;
    private String email;
    private String photo;
    

    public String getName() {
        return name;
    }

    public String getEmpid() {
        return empid;
    }

    public Date getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public Date getStartdate() {
        return startdate;
    
    }

    public String getLevel() {
        return level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public String getPositiontitle() {
        return positiontitle;
    }

    public String getPhoneno() {
        return phoneno;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPHoto(){
        return photo;
    }

    public void setPhoto(String photo){
        this.photo=photo;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }
    
    public void setPhoneno(String phoneno) {
        this.phoneno=phoneno;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Object getDate() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return null;
    }

    public String getPhoto() {
        // new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return null;
    }
     
}
