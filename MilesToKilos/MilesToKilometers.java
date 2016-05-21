/**
 * Created by Jenna Garcia on 2/20/16.
 * This program converts miles to kilometers
 */

import javax.swing.JOptionPane;


public class MilesToKilometers
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "This program converts" +
                                            " miles into kilometers.");
        getMiles();
    }

    
    /*********************************
    *   Method for recieving         *
    *   input of miles from user     *
     ********************************/

    public static void getMiles()
    {
        //Declare variables
        String a;
        double miles;
        
        //User input
        a = JOptionPane.showInputDialog("How many miles?");
        
        //Checks if the user input is a number
        while(a.matches("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null, "Sorry invalid answer. " +
                                          "Please enter miles in a number.");
            
            a = JOptionPane.showInputDialog("How many miles?");
        }
        
        miles = Double.parseDouble(a);
        
        // delcare variable v
        double v;
        
        v = milesToKilo(miles);
        
        displayResults(v, miles);
    }
        
     /*******************************
     *   Method for converting      *
     *   miles to kilos             *
     *******************************/

    public static double milesToKilo(double mi)
    {
        double product;
        product = mi * 1.609;
       return product;
    }
    
    /********************************
     *   Method for displaying      *
     *   the final results          *
     *******************************/

    public static void displayResults(double k, double m)
    {
        if (m <= 1.0)
        {
            JOptionPane.showMessageDialog(null, String.format("%.0f mile is converted to %.2f kilos.", m, k));
        }
        else
        {
            JOptionPane.showMessageDialog(null, String.format("%.0f miles is converted to %.2f kilos.", m, k));
        }
    }
}




