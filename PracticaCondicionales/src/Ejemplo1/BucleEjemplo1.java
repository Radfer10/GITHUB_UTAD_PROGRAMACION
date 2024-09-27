package Ejemplo1;
import java.util.Scanner;

public class BucleEjemplo1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		while (numero >= 0)
		{
			System.out.print(numero + " ");
			numero--;
		}
		sc.close();


	}

}
