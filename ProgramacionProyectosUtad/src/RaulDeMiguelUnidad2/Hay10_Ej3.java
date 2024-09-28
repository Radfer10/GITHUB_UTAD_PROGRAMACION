package RaulDeMiguelUnidad2;
import java.util.Scanner;

public class Hay10_Ej3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int number;
		boolean Diez = false;
		
		do
		{	
			System.out.print("Introduce un número (0-10): ");
			number = sc.nextInt();
			if (number == 10)
				Diez = true;
			if (number > 10)
				System.out.println("Introduce otro número ");
		} while (number != -1);
		
		if (Diez)
			System.out.print("SI");
		else
			System.out.print("NO");
		sc.close();
		
		
		

	}

}
