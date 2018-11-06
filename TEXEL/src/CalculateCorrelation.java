/**
 * Texel -- Calculate Correlation
 * Maxwell Phillips
 * Sep 27, 2018
 */
import java.io.*;
import java.util.*;
public class CalculateCorrelation
{
	
	/**
	 * getCorrelation
	 * determines the level of correlation
	 * @param r : the correlation coefficent
	 * @return
	 * Correlation Enum with HIGH MEDIUM LOW value
	 */
	public static Correlation getCorrelation(double r)
	{
			//Determine if high, med, or low correlation
			if (r > .7  || r < -.7) //High
			{
				System.out.println("High correlation");
				return Correlation.HIGH;
			}
			if ((r >= .3 && r <= .7) || (r <= -.3 && r >= -.7)) //Medium
			{
				System.out.println("Medium correlation");
				return Correlation.MEDIUM;
			}
			if ((r >= 0 && r <= .3) || (r <= 0 && r <= .3)) //Low
			{
				System.out.println("Low correlation");
				return Correlation.LOW;
			}
			return null;
	}
	/**
	 * getDirection
	 * @param r : correlation coefficent
	 * @return 
	 * Direction enum positive negative or null
	 *
	 */
	public static Direction getDirection(double r)
	{
		//Determine for direction
		
		if (r > 0)
		{
			return Direction.POSITIVE;
		}
		if (r < 0) 
		{
			return Direction.NEGATIVE;
		} else
		{
		return Direction.NULL;
		}
	}
	
	/*
	 * fillArrayList()
	 * pre: A list to write to and a file to draw data from.
	 * post: Writes doubles to an arraylist based on a file.
	 */
	public static void fillArrayList(ArrayList<Double> list, File f)
	{
		
			try
			{
				//Create a new buffered reader for the file
				BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()));
				String line = "";
				
				//Loop over the lines in the file
				while ((line = br.readLine()) != null)
				{
					//Parse the line into a new double in the array
					list.add(Double.parseDouble(line));
				}
				
				br.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
				System.out.println("Error: File Not Found!");
			}
			catch (IOException e)
			{
				e.printStackTrace();
				System.out.println("Error: This isn't supposed to happen.");
			}
			
	}
	
	/*
	 * pre: two arraylists with data OF THE SAME LENGTH
	 * post: returns a value from -1 to 1 representing the correlation coefficent
	 */
	public static double corrCo(ArrayList<Double> x, ArrayList<Double> y)
	{
		double sum_x = 0, sum_y = 0, sum_xy = 0; 
        double squareSum_x = 0, squareSum_y = 0; 
       
        for (int i = 0; i < x.size(); i++) 
        { 
            // sum of elements of arrayList x. 
            sum_x = sum_x + x.get(i); 
       
            // sum of elements of arrayList y. 
            sum_y = sum_y + y.get(i); 
       
            // sum of x[i] * y[i]. 
            sum_xy = sum_xy + x.get(i) * y.get(i); 
       
            // sum of square of arrayList elements. 
            squareSum_x = squareSum_x + x.get(i) * x.get(i); 
            squareSum_y = squareSum_y + y.get(i) * y.get(i); 
        } 
       
        // calculate the corrlation coefficent
        double corr = (double)(x.size() * sum_xy - sum_x * sum_y)/ 
                     (double)(Math.sqrt((x.size() * squareSum_x - 
                     sum_x * sum_x) * (x.size() * squareSum_y -  
                     sum_y * sum_y))); 
       
        return corr;
        }
}
