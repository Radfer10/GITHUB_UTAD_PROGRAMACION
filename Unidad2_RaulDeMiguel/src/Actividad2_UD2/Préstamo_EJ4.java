/*En este ejercicio se nos pide que desarrollemos un programa que solicite una cantidad de un préstamo, y a partir de ese préstamo se vayan introduciendo números para ir pagando la deuda. 
 * El programa debe ir calculando la deuda restante en cada momento, hasta que se complete el pago.

Para ello, he decidido declarar una variable para el préstamo y otra variable para la aportación. 
Declaro un bucle que, mientras el préstamo sea mayor a 0, permitirá que se vayan introduciendo aportes para ir reduciendo el préstamo hasta que 
llegue a 0 y el programa termine.

Para ir calculando lo que se paga y lo que queda por pagar, establezco que el valor del préstamo sea igual a la diferencia entre el préstamo y 
la aportación. Además, declaro tres condiciones dentro del bucle: una de ellas sirve para que, si el préstamo sigue siendo mayor que 0, se siga 
solicitando un aporte para pagar la deuda. Si se cumple la condición de que el préstamo sea igual a 0, el préstamo quedará saldado y se imprimirá 
"Deuda saldada" para informar al usuario. Por último, si no se cumple ninguna de las dos condiciones (es decir, si la aportación es mayor que el 
préstamo), se calculará la diferencia extra que se ha introducido una vez superado el total del préstamo.*/
package Actividad2_UD2;
import java.util.Scanner;

public class Préstamo_EJ4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Importe del préstamo: ");
		double prestamo = sc.nextDouble();
		
		
		
		while (prestamo > 0)
		{
			System.out.print("Aportación: ");
			double aportacion = sc.nextDouble();
			
			prestamo = prestamo - aportacion;
			
			if (prestamo > 0)
			{
				System.out.println("Deuda: " + prestamo);
				aportacion++;
			}
			if (prestamo == 0)
					System.out.println("Deuda Saldada");
			if (!(prestamo > 0 || prestamo == 0))
				System.out.println ("Deuda Saldada. Sobran " + (- prestamo));
					
		}
		sc.close();
	}

}
