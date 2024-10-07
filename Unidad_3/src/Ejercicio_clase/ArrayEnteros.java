package Ejercicio_clase; 
import java.util.Scanner;

public class ArrayEnteros 
{
	public static double suma (double [] a)
	{
		double suma = 0;
		for (int i = 0; i < a.length; i++)
		{
			suma = suma + a[i];
		}
		return suma;
	}
	public static double media (double [] a)
	{
		double suma = suma(a);
		double media = suma / a.length;
		return media;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num;
		int countP = 0;
		int countN = 0;
		double numeros1[] = new double[10];
		double numeros2[] = new double[10];
	
		System.out.println("Introduzca 10 numeros:");
		for (int i = 0; i < 10; i++)
		{
			num = sc.nextInt();
			if (num >= 0)
			{
				numeros1[countP] = (double)num;
				countP++;
				
			}
			if (num < 0)
			{
				numeros2[countN] = (double)num;
				countN++;
			}
			
		}
		if (countP > 0)
		{
			System.out.println("Suma Positivos: " + suma(numeros1));
			System.out.println("Media Positivos:" + media(numeros1));
		}
		
		if (countN > 0)
		{
			System.out.println("Suma Negativos: " + suma(numeros2));
			System.out.println("Media Negativos" + media(numeros2));
		}
		sc.close();
	}

}
