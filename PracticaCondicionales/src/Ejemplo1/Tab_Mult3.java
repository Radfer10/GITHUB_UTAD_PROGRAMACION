package Ejemplo1;
import java.util.Scanner;
public class Tab_Mult3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int i;
		int numero;
		do
		{
			System.out.print("Introduce un numero [1-10]: ");
			numero = sc.nextInt();
			
			if (numero < 1 || numero > 10);
			System.out.println("Introduce otro numero");
		}
		while (numero < 1 || numero > 10);
		i = 1;
		while (i <= 10)
		{
			System.out.printf("%2d * %2d = %d\n", i, numero, (i * numero));
			i++;
		}
		sc.close();
		
		
	}

}