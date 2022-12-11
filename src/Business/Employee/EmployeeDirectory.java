/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author juile
 */
public class EmployeeDirectory {
     private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String address, String phone){
        if(this.checkIfEmployeeIsUnique(name))
        {
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employee.setEmployeeAddress(address);
        employee.setEmployeeContactNo(phone);
        employeeList.add(employee);
        return employee;
    }
        return null;
    }

    public boolean checkIfEmployeeIsUnique(String username){
        for (Employee ua : employeeList){
            if (ua.getEmployeeName().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteEmployee(Employee e)
    {
        employeeList.remove(e);
    }

}
