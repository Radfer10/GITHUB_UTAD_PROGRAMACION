package Ejemplo1;

import java.util.Scanner;

public class BucleEjemplo2 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int value = 0;
		
		while (value >= 100)
		{
			System.out.print("Enter a valur < 100: ");
			value = sc.nextInt();
		}
		sc.close();
	}

}
