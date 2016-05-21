/*
 Jenna Garcia
 
 This program stores personal information
 
 */



import javax.swing.JOptionPane;


public class Information
{
	static public void main(String[] args)
    
	{
        //Create three objects
        Info family  = new Info();
        Info friend  = new Info();
        Info personal  = new Info();
        
        
        //Declare variables
        String nam = " ";
        String age = " ";
        String phoneNumber = " ";
        String address = " ";
        String person = " ";
        char ans;
        
        
        do
        {
            //Process
            person = whoseInfo(person);
            nam = nombre(nam);
            age = anos(age);
            phoneNumber = number(phoneNumber);
            address = location(address);
            
            //Output
            if (person.equals("family"))
            {
                family.setName(nam);
                family.setAge(age);
                family.setAddress(address);
                family.setPhone(phoneNumber);
            
                JOptionPane.showMessageDialog(null,"Family member's name is: " + family.getName() + "\n" +
                                          "Family member's age: " + family.getAge() + "\n" +
                                          "Family member's phone number is: " + family.getPhone() + "\n" +
                                          "Family member's address is: " + family.getAddress());
            }
            else if (person.equals("friend"))
            {
                friend.setName(nam);
                friend.setAge(age);
                friend.setAddress(address);
                friend.setPhone(phoneNumber);
            
                JOptionPane.showMessageDialog(null,"Friend's name is: " + friend.getName() + "\n" +
                                          "Friend's age: " + friend.getAge() + "\n" +
                                          "Friend's phone number is: " + friend.getPhone() + "\n" +
                                          "Friend's address is: " + friend.getAddress());

            }
            else
            {
                personal.setName(nam);
                personal.setAge(age);
                personal.setAddress(address);
                personal.setPhone(phoneNumber);
            
                JOptionPane.showMessageDialog(null,"Your name is: " + personal.getName() + "\n" +
                                          "Your age: " + personal.getAge() + "\n" +
                                          "Your phone number is: " + personal.getPhone() + "\n" +
                                          "Your address is: " + personal.getAddress());

            }
            ans = JOptionPane.showInputDialog(null, "Would you like to another profile? Yes or no?").charAt(0);
            
        }while(ans == 'y' || ans == 'Y');
	}
    
    /****************
     Method whoseInfo
     ****************/
    
    public static String whoseInfo(String who)
    {
        who = JOptionPane.showInputDialog("Whose information is being put in: " +
                                             "family, friend, or personal? ");
        who = who.toLowerCase();
        
        while(!who.equals("family") && !who.equals("friend") && !who.equals("personal"))
            {
                who = JOptionPane.showInputDialog("Please enter: " +
                                                  "family, friend, or personal. ");
                who = who.toLowerCase();
            }
        return who;
    }
    
    
    
    /*************
     Method nombre
     *************/
    public static String nombre(String n)
    {
        n = JOptionPane.showInputDialog("Enter name: ");
        
        return n;
        
    }
    
    /*************
     Method anos
     *************/
    public static String anos(String a)
    {
        a = JOptionPane.showInputDialog("Enter age in years: ");
        return a;
    }
    
    
    /*************
     Method number
     *************/
    public static String number(String num)
    {
        num = JOptionPane.showInputDialog("Enter phone number: ");
        return num;
    }
    
    /***************
     Method location
     ***************/
    public static String location(String loc)
    {
        loc = JOptionPane.showInputDialog("Enter address (Street, city, state, zipcode): ");
        return loc;
    }
}