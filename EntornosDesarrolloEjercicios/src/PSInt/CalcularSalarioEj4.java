package PSInt;
import java.util.Scanner;

public class CalcularSalarioEj4 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int Trabajadores;
		int SueldoPorHora, sueldoTotal, PagoTotal = 0;
		int Horas;
		
		System.out.print("Cuántos trabajadores tiene la empresa?: ");
		Trabajadores = sc.nextInt();
		System.out.print("Suedlo por hora: ");
		SueldoPorHora = sc.nextInt();
		
		for (int i = 1; i <= Trabajadores; i++)
		{
			System.out.print("¿Cuántas horas ha trabajado el trabajador " + i + "?: ");
			Horas = sc.nextInt();
			sueldoTotal = Horas * SueldoPorHora;
			System.out.println("El trabajador " + i + " tiene de sueldo: " + sueldoTotal);
			PagoTotal += sueldoTotal;
		}
		System.out.print("El pago a los " + Trabajadores + " trabajadores es: " + PagoTotal);
		sc.close();
		
		
		
		
	}

}
