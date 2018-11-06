import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

/**
 * Mad Lib Game
 * Maxwell Phillips
 * Sep 17, 2018
 */

public class MadLib
{

	public static void main(String[] args)
	{
		final String RSRC = "src/Resources/"; //Folder reference
		
		//Store file references
		File madLibFile = new File(RSRC+"story.txt");
		File nounFile = new File(RSRC+"nouns.txt");
		File verbFile = new File(RSRC+"verbs.txt");
		
		Random r = new Random();
		
		//Begin madLib code
		try
		{
			//Get the file buffers
			BufferedReader nounBuffer = new BufferedReader(new FileReader(nounFile.getAbsolutePath()));
			BufferedReader verbBuffer = new BufferedReader(new FileReader(verbFile.getAbsolutePath()));
			BufferedReader madLibBuffer = new BufferedReader(new FileReader(madLibFile.getAbsolutePath()));
			
			String ln; //To store the line
			
			String newLn = ""; //To store the new line
			
			//To store the line's unique noun and verb
			String noun = "";
			String verb = "";
			
			while((ln = madLibBuffer.readLine()) != null) //Loop over all the lines in the madLib file's buffer.
			{
				
				//Set the newLn to ln
				newLn = ln;
				
				/*Try to move the lines of the nouns file into a String Stream, 
				 * and then skip the stream to a random value within 90,963, 
				 * which is the size of the nouns file. Store this line in the
				 * noun variable.
				 */
				try (Stream<String> nounLines = Files.lines(Paths.get(nounFile.getAbsolutePath())))
				{
					noun = nounLines.skip(r.nextInt(90963)).findFirst().get();
					newLn = newLn.replaceAll("#", noun); //Replace all the nouns in the line

				}
				
				
				//Do the same as above, but for verbs (which there are 30,802 of).
				try (Stream<String> verbLines = Files.lines(Paths.get(verbFile.getAbsolutePath())))
				{
					verb = verbLines.skip(r.nextInt(30802)).findFirst().get();
					newLn = newLn.replaceAll("%", verb); //Replace all the verbs in the line

				}
				
				
				System.out.println(newLn); //Print the line
			}
			//--Program end--
			//Close the buffers
			madLibBuffer.close();
			nounBuffer.close();
			verbBuffer.close();
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println(madLibFile);
	}
}
