/*
Name: Jenna Garcia


/*This is a program that asks a user to enter a number of seconds
and converts the seconds into minutes, hours, or days */


import java.util.Scanner;


public class TimeCalculator
{
	public static void main(String[] args)
	{
        //Declare variables
		int sec;
		String output;
		
        //Declare input to keyboard
		Scanner keyboard = new Scanner(System.in);
		
        //ask user input and store in sec
		System.out.println("Enter a number in seconds: ");
		sec = keyboard.nextInt();

        //Process of converting seconds to minutes, hours, or days
		if (sec >= 86400)
		{	
			int day;
			day = sec/86400;
			output = day + " day";
			
			if(day != 1)
			{
				output = output + "s";
			}
			
			System.out.println(output);
		}
		else if (sec >= 3600)
		{
			int hour;
			hour = sec/3600;
			output = hour + " hour";
			
			if(hour != 1)
			{
				output = output + "s";
			}
			
			System.out.println(output);
		
		}
		else
		{
			int min;
			min = sec/60;
			output = min + " minute";
			
			if(min != 1)
			{
				output = output + "s";
			}
            System.out.println(output);
		}
		
	}
}