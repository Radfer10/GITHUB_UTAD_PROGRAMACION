package Actividad3RaulDeMiguel;
import java.util.Arrays;
import java.util.Scanner;

public class ElegidoDelegado 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int count = 0;
		int num;
		int Votos[] = new int[30];
		int i = 0;
		int mayor = Integer.MIN_VALUE;
		
		do
		{
			System.out.print("Alumno" + (i + 1) + ": ");
			num = sc.nextInt();
			if (num != 0)
			{
				Votos[count] = num;
				count++;
			}
			i++;
			if (mayor < Votos[num])
				mayor = Votos[num];
		} while (num != 0 && count < 30);
		Arrays.sort(Votos);
		System.out.println("El mayor de los numeros es: "  + mayor);
		sc.close();
	}

}
