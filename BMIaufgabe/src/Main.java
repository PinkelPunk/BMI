
public class Main
{

	public static void main(String[] args)
	{
		
		// BMI= körpergewicht(in kg)/körpergrösse(in meter) zum quadrat
		int kilo=70;
		double groesse=1.85;
		double bmi;
		
		bmi=kilo/(groesse*groesse);
		
		System.out.println("BMI = " + (int)bmi);
		
	}

}