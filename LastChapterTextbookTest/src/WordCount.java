/**
 * Word Count
 * Maxwell Phillips
 * Sep 24, 2018
 */

//Import packages
import java.io.*;

public class WordCount
{	
	public static void main(String[] args)
	{
		//Create the new file reference
		File src = new File("src/source.txt");
		
		//Create other variables
		int wordCount = 0;
		int avgWordLength = 0;
		double totalChars = 0;
		
		//Try and catch for exceptions
		try
		{
			//Link the file to a buffered reader using absolute path
			BufferedReader br = new BufferedReader(new FileReader(src.getAbsolutePath()));
			
			//String to hold current line
			String line = "";
			
			//Loop until EOF
			while ((line = br.readLine()) != null)
			{
				//If the line is not empty
				if (!line.equals(""))
				{
					//Split the line into an array of words depending on whenever there is a space
					String[] words = line.split("\\s+");
					
					//Add the amount of words in the line to the total wordCount
					wordCount += words.length;
					
					//Iterate over the words in that line to get the sum of their characters for the avg
					for (String w : words)
					{
						totalChars += w.length();
					}
				}
			}
			//Calculate avg
			avgWordLength = (int)(totalChars / (double)wordCount);
			
			//Print results
			System.out.println("The word count for this file is: "+wordCount+" words.");
			System.out.println("The average word length in this file is: "+avgWordLength+" characters.");
			
			//Close br
			br.close();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
