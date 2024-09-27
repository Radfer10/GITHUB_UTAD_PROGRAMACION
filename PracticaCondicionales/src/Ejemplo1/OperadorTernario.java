package Ejemplo1;
import java.util.Scanner;
public class OperadorTernario
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int num2 = sc.nextInt();
		
		int mayor = num1 > num2 ? num1 : num2;
		
		System.out.println("El mayor de los números es: " + mayor);
		sc.close();
	}

}
