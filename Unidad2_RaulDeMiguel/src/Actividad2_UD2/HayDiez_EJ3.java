/* En este ejercicio se nos pide utilizar do-while para que el programa lea una secuencia de notas que van del 0 al 10
 * y termine dicha secuencia con el valor -1. Además, debemos imprimir "NO" o "SI" si ha habido un 10 a lo largo de la
 * secuencia.
 * 
 * Para ello, declaro dos variables: una para introducir el dato del número y otra variable de tipo booleano que se 
 * inicializa como false al principio del programa y se activa como true si aparece un 10 en la secuencia de números. 
 * 
 * Esto se consigue ya que, dentro del bucle do-while, se asignan dos condiciones: una que comprueba si el número es 
 * igual a 10, en cuyo caso la variable de tipo booleano se activa a true, y otra condición que verifica si se ha 
 * introducido un número fuera del rango de 0 a 10.
 * 
 * Por último, el bucle do-while se detendrá cuando el número sea igual a -1. Declaro al final del programa dos 
 * condiciones que verifican si se ha registrado un 10 en la secuencia de números, e imprimen un "SI" o un "NO".
 */
package Actividad2_UD2;
import java.util.Scanner;

public class HayDiez_EJ3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int number;
		boolean Diez = false;
		
		do
		{	
			System.out.print("Introduce un número (0-10): ");
			number = sc.nextInt();
			if (number == 10)
				Diez = true;
			if (number > 10)
				System.out.println("Introduce otro número ");
		} while (number != -1);
		
		if (Diez)
			System.out.print("SI");
		else
			System.out.print("NO");
		sc.close();
	}
}
