/**
 * Merge Files
 * Maxwell Phillips
 * Sep 19, 2018
 */


import java.io.*;

public class MergeFiles
{

	public static void main(String[] args)
	{
		//Folder reference		
		final String RSRC = "src/Resources/"; 
		
		//Declare merged file
		File mergedFile = new File(RSRC+"Result.dat");	
		
		try
		{
			//Create the merged file to be written to
			mergedFile.createNewFile(); 
			
			//Create buffers
			BufferedReader buffer1 = new BufferedReader(new FileReader(RSRC+"mergefiles1.dat")); 
	        BufferedReader buffer2 = new BufferedReader(new FileReader(RSRC+"mergefiles2.dat")); 
	        
	        //Create file writer for merged file
			FileWriter writer = new FileWriter(mergedFile);

			//Create strings for lines of each file and initalize it with the first lines
			String line1 = buffer1.readLine(); 
		    String line2 = buffer2.readLine();
			
		    //Loop until both files don't have empty lines
		    while (line1 != null || line2 != null)
		    {
		    	
		    	if(line1 != null) 
	            { 
	                writer.write(line1 + "\n");
	                line1 = buffer1.readLine(); 
	            } 
	              
	            if(line2 != null) 
	            { 
	                writer.write(line2 + "\n");
	                line2 = buffer2.readLine(); 
	            } 
		    }
		    
		    //Finish the writer stream
		    writer.flush();
		    
		    //Close streams
		    buffer1.close(); 
	        buffer2.close(); 
	        writer.close();
	        		    
	        //Completed
			System.out.println("Complete!");	
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
