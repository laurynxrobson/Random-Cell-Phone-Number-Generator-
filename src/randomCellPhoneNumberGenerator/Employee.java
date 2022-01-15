package randomCellPhoneNumberGenerator;
/*Employee class with getter and setter methods */
public class Employee {
   String employee;        
   String cellNumber;
   String provider = "";

    public String getProvider() {
        return provider;
    }
    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCellNumber() {
        return cellNumber;
    }
    
    
    public void setCellNumber() {
        String Vodacom;
        String MTN;
        String CellC;

        int max = 3;
        int min = 1;
        int range = max - min + 1;

        int max2 = 999;
        int min2 = 101;
        int range2 = max2 - min2 + 1;

        int max3 = 9999;
        int min3 = 1001;
        int range3 = max3 - min3 +1; 
        /*Math.random is equal to the selection variable to randomly assign the employee to the network provider. */
        int selection = (int)(Math.random()*range) + min;
        /**Switch statement that passes a selection argument to assign the employee to the network provider and then generates a random number by creating two Math.random methods. 
         * The first methods creates a random number for the first three digits after the network provider and the last four to get the last 4 digits of the cell phone number.*/
        switch(selection){
            case 1:
            /**The empty string provider is then set to the network provider and the network provider is string is set to the network provider number.  */
                provider = "Vodacom";
                Vodacom = "072";
           
            /**The network provider number is the called to the beginning of the cell phone number followed by the first set of random number and the last set of random numbers which is separated by a dash and is places in round brackets. */
            cellNumber =  "" + Vodacom + " "+((int)(Math.random()*range2) + min2) +" - ("+ ((int)(Math.random()*range3) + min3) + ")";
            break;
            
            case 2:
                provider = "MTN";
                MTN = "083";
            cellNumber = "" + MTN + " "+((int)(Math.random()*range2) + min2) +" - ("+  ((int)(Math.random()*range3) + min3) + ")";
            break;
            
            case 3:
                provider = "CellC";
                CellC = "084";       
                
            cellNumber = "" + CellC +" " +  ((int)(Math.random()*range2) + min2) +" - ("+  ((int)(Math.random()*range3) + min3) + ")";
            break;
            
            default:
                    System.out.println("Error");
                    break;
        }
    }
    /**Employee Constructor */
    public Employee() {
    }
}