package RaulDeMiguelUnidad2;
import java.util.Scanner;

public class Préstamo_Ej3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Importe del préstamo: ");
		double prestamo = sc.nextInt();
		
		
		
		while (prestamo > 0)
		{
			System.out.print("Aportación: ");
			double aportacion = sc.nextInt();
			
			prestamo = prestamo - aportacion;
			
			if (prestamo > 0)
			{
				System.out.println("Deuda: " + prestamo);
				aportacion++;
			}
			if (prestamo == 0)
					System.out.println("Deuda Saldada");
			if (!(prestamo > 0 || prestamo == 0))
				System.out.println ("Deuda Saldada. Sobran " + (-prestamo));
					
		}
		sc.close();
		
		
		

	}

}
