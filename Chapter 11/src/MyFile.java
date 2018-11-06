/**
 * MyFile
 * Maxwell Phillips
 * Sep 4, 2018
 */

import java.io.*;
import java.util.Scanner;

public class MyFile
{
	
	File file;
	String fileName;
	
	
	public MyFile() 
	{
		file = new File("/");
	}
	
	/*
	public static boolean doesExist(String dP)
	{
		File dirPath = new File(dP);
		if (dirPath.exists() && dirPath.isDirectory())
		{
			File[] filesInDir = dirPath.listFiles();
			if (filesInDir != null)
			{
				for (File child : filesInDir) {
					//if (child.getName() == fileName)
				}
			}
		} else 
		{
			return false;
		}
	}
	*/
	
	public static void main(String[] args)
	{
	//	doesExist();
	}

}
