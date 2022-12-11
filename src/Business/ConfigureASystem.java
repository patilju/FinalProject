package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;

/**
 *
 * @author juile
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        /*
        Create a network
        create an enterprise
        add organizations
        add employees 
        create user account
        */
        Employee employee = system.getEmployeeDirectory().createEmployee("to", "SomeAddress", "SomePhone");
               

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());
        
        return system;
    }
    
}
