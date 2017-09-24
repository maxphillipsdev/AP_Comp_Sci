import java.util.Scanner;
public class tempConverter {

	public static void main(String[] args) {
		//Open variables
		double fTemp;
		double cTemp;
		
		//Open Scanner
		Scanner input = new Scanner(System.in);
		//Ask for input
		System.out.println("Please enter the temperature in Farenheit: ");
		fTemp = input.nextDouble();
		//Close Scanner
		input.close();
		
		//Convert temperature
		cTemp = 5.0/9.0*(fTemp-32);
		
		//Print new temperature
		System.out.println("The new Celcius conversion is: "+(int)cTemp);
	}

}
