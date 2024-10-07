package Actividad3RaulDeMiguel;
import java.util.Scanner;

public class HayRepetidos 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int count = 0;
		int num;
		int numeros[] = new int[6];
		Boolean flag = false;
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Numero" + (i + 1) + ": ");
			num = sc.nextInt();
			numeros[count] = num;
			count++;
		}
		
		for (int i = 0; i < numeros.length; i++)
		{
			for (int j = i + 1; j < numeros.length; j++)
			{
				if (numeros[i] == numeros[j])
				{
					flag = true;
					break;
				}
			}
		}
		if (flag)
			System.out.println("SI");
		else
			System.out.println("NO");
		sc.close();
		}
}
