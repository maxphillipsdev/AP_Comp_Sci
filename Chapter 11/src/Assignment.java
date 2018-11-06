/**
 * PROJECTNAME
 * Maxwell Phillips
 * Sep 6, 2018
 */

import java.io.*;

public class Assignment
{
	public static void main(String[] args)
	{
		String srcDir = "/Users/2020_maxwell_phillips/Documents/GitHub/AP_Comp_Sci/Chapter 11/src";
		File textFile = new File(srcDir+"/assignment.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineOfText = readFile.readLine()) != null)
			{
				System.out.println(lineOfText);
			}
			readFile.close();
			in.close();
			
		} catch (FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: "+e.getMessage());
		} catch (IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: "+e.getMessage());
		}
	}

}
