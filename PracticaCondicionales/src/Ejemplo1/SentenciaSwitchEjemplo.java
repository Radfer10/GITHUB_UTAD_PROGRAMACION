package Ejemplo1;
import java.util.Scanner;
public class SentenciaSwitchEjemplo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca 1, 2 o 3: ");
		
		int numero = sc.nextInt();
		String texto = "";
		
		switch (numero)
		{
		case 1:
			texto = "Uno";
			break;
		case 2:
			texto = "Dos";
			break;
		case 3:
			texto = "Tres";
			break;
		default:
			texto = "era 1, 2 o 3";
		}
		System.out.println(texto);
		sc.close();
		
		

	}

}
