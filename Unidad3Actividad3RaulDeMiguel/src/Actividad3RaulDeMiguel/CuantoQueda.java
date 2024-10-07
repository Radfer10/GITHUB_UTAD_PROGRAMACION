package Actividad3RaulDeMiguel;
import java.util.Scanner;
import java.util.Arrays;
public class CuantoQueda 
{
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int num;
		int Etapas[] = {80, 60, 55, 33, 45};
	
		
		for (int i = 0; i < Etapas.length; i++)
		{
			System.out.print("Etapa" + (i + 1) + ": ");
			num = sc.nextInt();
			Etapas[i] = Etapas[i] - num;
			
		}
		System.out.println(Arrays.toString(Etapas));
		sc.close();
	}

}
