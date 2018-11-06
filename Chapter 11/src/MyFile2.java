/**
 * PROJECTNAME
 * Maxwell Phillips
 * Sep 4, 2018
 */

import java.util.Scanner;
import java.io.*;

public class MyFile2
{
	static final String DIR = "/Users/2020_maxwell_phillips/Desktop/";
	
	public MyFile2()
	{
	}
	
	public static void main(String[] args)
	{
		File file = new File(DIR + "zzz.txt");
		 try
		{
			file.createNewFile();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error: Your file if a faliure. " + e.getMessage());;
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wish to keep or delete the file?\n0: Keep\n1: Delete");
		switch (input.nextLine())
		{
			case "0": break;
			case "1": if (!file.delete()) {System.out.println("That file really doesn't want to delete... ");}; break;
		}
		input.close();
	}
	
}
