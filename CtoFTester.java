// The functions should each have one parameter that is either a double or an int.
// I decided to make it a double so that we can convert temperatures that are decimals.
// Thus, the functions should each return a double that represents the temperature in the desired unit.
import java.util.Scanner;
public class CtoFTester{
	public static double celsiusToFahrenheit (double c) {
		double far = c * 1.8 +32;
		return far;
	}
	
	public static double fahrenheitToCelsius (double f) {
		double celsius = (5.0/9.0)*(f-32);
		return celsius;
	}
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		System.out.print("Degrees Celsius?");
		int givenCelcius = in.nextInt();
		double givenCelciusDouble = givenCelcius * 1.0;
		System.out.println(givenCelcius+" degrees Celsius is "+celsiusToFahrenheit(givenCelciusDouble)+" in degrees Fahrenheit.");
		Scanner in2 = new Scanner(System.in);
		System.out.print("Degrees Fahrenheit?");
		int givenFar = in2.nextInt();
		double givenFarDouble = givenFar * 1.0;
		System.out.println(givenFar+" degrees Fahrenheit is "+fahrenheitToCelsius(givenFarDouble)+" in degrees Celsius.");
    }
}