package Ejemplo1;

import java.util.Scanner;

public class Condicionales1 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		
		if (numero < 10)
		{
			System.out.println("1 cifra");
		}
		else if (numero >= 10 && (numero < 100))
		{
			System.out.println("2 cifras");
		}
		else
			System.out.println("mas de 2 cifras");
		sc.close();
	}

}
