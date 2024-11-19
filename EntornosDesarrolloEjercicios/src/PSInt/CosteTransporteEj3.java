package PSInt;
import java.util.Scanner;

public class CosteTransporteEj3 
{
	public static void  main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Que peso tiene el paquete (en gramos)?: ");
		int numeroPeso = sc.nextInt();
		if (numeroPeso <= 0 || numeroPeso > 5000)
			System.out.print("Peso incorrecto (no podemos transportar paquetes de más de 5kg");
		else
		{
			System.out.println("1- America del Norte");
			System.out.println("2- America Central");
			System.out.println("3- America del Sur");
			System.out.println("4- Europa");
			System.out.println("5- Asia");
			System.out.println("¿A que zona se reparte (1-5): ");
			int numeroZona = sc.nextInt();
			int coste = 0;
			if (numeroZona == 1)
				coste = (numeroPeso / 100) * 2000;
			else if (numeroZona == 2)
				coste = (numeroPeso / 100) * 1500;
			else if (numeroZona == 3)
				coste = (numeroPeso / 100) * 2100;
			else if (numeroZona == 4)
				coste = (numeroPeso / 100) * 1000;
			else if (numeroZona == 5)
				coste = (numeroZona / 100) * 3500;
			else
			{
				System.out.println("Error zona invalida");
				sc.close();
				return;
			}
			System.out.println("Coste Total: " + coste);
			sc.close();
		}
	}

}
