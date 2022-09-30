/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmpDetails {
    
    private ArrayList<Employee> emp;
    
    public EmpDetails(){
        this.emp = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<Employee> emp) {
        this.emp = emp;
    }
    
    public Employee addNewEmp()
    {
        Employee newemp = new Employee();
        emp.add(newemp);
        return newemp;
    }

    public void deleteEmp(Employee e) {
        emp.remove(e);
        }
}