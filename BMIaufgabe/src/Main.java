
public class Main
{

	public static void main(String[] args)
	{
		
		// BMI= körpergewicht(in kg)/körpergrösse(in meter) zum quadrat
		int kilo=70;
		double groesse=1.85;
		int bmi;
		
		bmi=(int)kilo/((int)groesse*(int)groesse);
		
		System.out.println("BMI = " + bmi);
		
	}

}