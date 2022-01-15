package randomCellPhoneNumberGenerator;
/* Importing the JOption class */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) { 
         /*Employee object */         
        Employee EmployeeOne = new Employee();
        Employee EmployeeTwo = new Employee();
        Employee EmployeeThree = new Employee();
        /*Input dialog box that sets the user input and a information message to change the name of the input dialog from input to network provide assignment. */
        EmployeeOne.setEmployee(JOptionPane.showInputDialog(null, "Enter the name of employee one:", "Network Provider Assignment", JOptionPane.INFORMATION_MESSAGE));
        EmployeeOne.setCellNumber();
        
        EmployeeTwo.setEmployee(JOptionPane.showInputDialog(null, "Enter the name of employee two:", "Network Provider Assignment", JOptionPane.INFORMATION_MESSAGE));
        EmployeeTwo.setCellNumber();
        
        EmployeeThree.setEmployee(JOptionPane.showInputDialog(null, "Enter the name of employee three:", "Network Provider Assignment", JOptionPane.INFORMATION_MESSAGE));        
        EmployeeThree.setCellNumber();
        /*Show message dialog box  */
        JOptionPane.showMessageDialog(null, "CELL PHONE NUMBER GENERATOR " 
        + "\n" 
        + "***************************************************"
        + "\n" 
        /*Get method to get the employee name. */
        + EmployeeOne.getEmployee() 
        + " will be on the "
        /*Get method to get the network provider. */
        + EmployeeOne.getProvider()
        + " network with the phone number "
        /*Get method to get the cell number. */
        + EmployeeOne.getCellNumber()
        + "\n" 
        + EmployeeTwo.getEmployee() 
        + " will be on the "
        + EmployeeTwo.getProvider()
        + " network with phone number "
        + EmployeeTwo.getCellNumber()
        + "\n" 
        + EmployeeThree.getEmployee() 
        + " will be on the "
        + EmployeeThree.getProvider()
        + " network with phone number "
        + EmployeeThree.getCellNumber()
        );

    }
    
}
