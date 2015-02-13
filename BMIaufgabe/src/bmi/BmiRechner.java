package bmi;

import java.util.Scanner;

@SuppressWarnings("resource")
public class BmiRechner
{
	// BMI= körpergewicht(in kg)/körpergrösse(in meter) zum quadrat
	private double kilo=70;
	private double groesse=1.85;
	private double bmi;
	private String rechnen;
	private String gewicht;
	
	public BmiRechner()
	{
		do
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Willst du deinen bmi berechnen lassen? (ja=rechnen; nein=ende des programms)");
			rechnen=scan.next();
			
			if(rechnen.equalsIgnoreCase("ja"))
			{
				berechneBmi();
			}
			else if(rechnen.equalsIgnoreCase("nein"))
			{
				System.exit(0);
			}
		} while(!rechnen.equalsIgnoreCase("ja")||!rechnen.equalsIgnoreCase("nein"));
		
	}
	
	public double getKilo()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Wieviel wiegst du in kg?");
		kilo=scan.nextDouble();
		return kilo;
	}
	
	public double getGroesse()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Wie gross bist du in meter?");
		groesse=scan.nextDouble();
		return groesse;
	}
	
	private void berechneBmi()
	{
		getKilo();
		getGroesse();
		bmi=kilo/(groesse*groesse);
		bmiAusgeben();
	}
	
	public String getGewicht()
	{
		if((int)bmi<=16&&(int)bmi>=0)
		{
			gewicht="starkes Untergewicht.";
			return gewicht;
		}
		else if((int)bmi>16&&(int)bmi<=18)
		{
			gewicht="Untergewicht.";
			return gewicht;
		}
		else if((int)bmi>18&&(int)bmi<25)
		{
			gewicht="Normalgewicht.";
			return gewicht;
		}
		else if((int)bmi>=25&&(int)bmi<30)
		{
			gewicht="Uebergewicht.";
			return gewicht;
		}
		else
		{
			gewicht="Adipositas.";
			return gewicht;
		}
	}
	
	public void bmiAusgeben()
	{
		System.out.println("Dein BMI liegt bei " + (int)bmi + ".\nDu hast somit " + getGewicht() + "\n");
	}
}
