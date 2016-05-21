/**
 * Created by Jenna on 1/31/16.
 */
import javax.swing.JOptionPane;

public class Payroll

{
    public static void main(String[] args)
    {
        //Declare Variables
        String inputString;     // for reading input
        String name;            // The user's name
        int hours;              // The number of hours worked
        double payRate;         // The user's hourly pay rate
        double grossPay;        // The user's gross pay

        //Input
        
        //Get the user's name
        name = JOptionPane.showInputDialog("What is your name? ");
        
        //Get the hours
        inputString =
                JOptionPane.showInputDialog("How many hours " +
                                           "did you work this week? ");
        //Convert The input to int
        hours = Integer.parseInt(inputString);

        inputString =
                JOptionPane.showInputDialog("What is your " +
                                            "hourly pay rate? ");
        //Conver the input to double
        payRate = Double.parseDouble(inputString);

        // Processing
        // Calculate gross pay
        grossPay = hours * payRate;

        // Output
        //Display the results
        JOptionPane.showMessageDialog(null, "Hello " +
        name + ". Your gross pay is $" + grossPay);
        
        //end program
        System.exit(0);
    }


}
