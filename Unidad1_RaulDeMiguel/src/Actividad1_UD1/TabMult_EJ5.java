/* En este caso, el ejercicio nos pide que lancemos por la salida estándar
 * una tabla de multiplicar alineada.
 *  
 * Para ello, utilizamos printf, que nos permite imprimir cualquier cosa
 * con el formato alineador. Además de eso, he declarado un bucle para
 * imprimir cada número multiplicado hasta el 10 y no tener que utilizar
 * printf en cada línea de operación declarada. Por último, utilizo printf
 * y le agrego un salto de línea al final de cada operación, y posteriormente
 * itero la variable i, declarada con anterioridad, para recorrer todos los 
 * números del 1 al 10 y salir del bucle con la tabla de multiplicar 
 * impresa al completo.
 */
package Actividad1_UD1;
import java.util.Scanner;

public class TabMult_EJ5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Introduzca un número[1-10]: ");
		int numero = sc.nextInt();
		int i = 1;
		while (i <= 10)
		{
			System.out.printf ("%2d x %2d = %d\n", numero, i, (numero * i));
			i++;
		}
		sc.close();

	}
}
