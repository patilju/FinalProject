/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author juile
 */
public class Employee {
   private String EmployeeName;
    private String EmployeeAddress;
    private String EmployeeContactNo;    
    private int EmployeeId;
    private static int count = 1;

    public Employee() {
        EmployeeId = count;
        count++;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    
    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String EmployeeAddress) {
        this.EmployeeAddress = EmployeeAddress;
    }
    
    public String getEmployeeContactNo() {
        return EmployeeContactNo;
    }

    public void setEmployeeContactNo(String EmployeeContactNo) {
        this.EmployeeContactNo = EmployeeContactNo;
    } 

    @Override
    public String toString() {
        return EmployeeName;
    }
 
}
