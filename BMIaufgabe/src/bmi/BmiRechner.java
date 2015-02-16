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
		programmAusfuehrung();
	}
	
	public void programmAusfuehrung()
	{
		//start des BMI-Rechners mit überprüfung auf richtige eingaben + evtl. beendigung des programms
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
			else
			{
				System.out.println("Falsche Eingabe. Bitte erneut versuchen: \n");
			}
		} while(!rechnen.equalsIgnoreCase("ja")||!rechnen.equalsIgnoreCase("nein"));
	}
	
	public double getKilo()
	{
		//eingabe des gewicht's in kilogramm
		do
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Wieviel wiegst du in kg?");
			kilo=scan.nextDouble();
		} while(kilo<0||kilo>400);
		return kilo;
	}
	
	public double getGroesse()
	{
		//eingabe der grösse in meter
		do
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Wie gross bist du in meter?");
			groesse=scan.nextDouble();
		} while(groesse<1.20||groesse>2.50);
		return groesse;
	}
	
	private void berechneBmi()
	{
		//aufrufen der methoden getKilo + getGroesse
		getKilo();
		getGroesse();
		
		//berechnung des BMI
		bmi=kilo/(groesse*groesse);
		
		//ausgabe des ergebnisses
		bmiAusgeben();
	}
	
	public String getGewicht()
	{
		//einstufung des ergebnisses in die richtige kategorie
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
		//ausgabe des ergebnisses in der richtigen kategorie
		System.out.println("Dein BMI liegt bei " + (int)bmi + ".\nDu hast somit " + getGewicht() + "\n");
	}
}
