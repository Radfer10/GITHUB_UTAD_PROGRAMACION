package Ejemplo1;

import java.util.Scanner;

public class SentenciaSwitchEjemplo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca 1, 2, 3 o 4: ");
		
		int numero = sc.nextInt();
		String texto = "";
		
		switch (numero)
		{
		case 1:
		case 2:
			texto = "Uno o Dos";
			break;
		case 3:
			texto = "Tres";
			break;
		case 4:
			texto = "Cuatro";
			break;
		default:
			texto = "era 1, 2, 3 o 4";
		}
		System.out.println(texto);
		sc.close();
		
		

	}
}
