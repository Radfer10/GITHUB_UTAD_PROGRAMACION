package RaulDeMiguelUnidad2;
import java.util.Scanner;

public class Ascensor_Ej5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int pisoanterior = 0;
		int number;
		int pisosrecorridos = 0;
		
		do 
		{
			System.out.println("Introduzca los pisos (uno por línea): ");
			number = sc.nextInt();
			if (number > pisoanterior)
					pisosrecorridos += number - pisoanterior;
			else
				pisosrecorridos += pisoanterior - number;
			pisoanterior = number;
			
		} while (number != 0);
		pisosrecorridos += pisoanterior;
		System.out.println("Recorridos " + pisosrecorridos + " pisos");
		sc.close();
		

	}

}
