/*En este ejercicio nos piden que simulemos un ascensor. Para ello, tendremos que pedir al usuario que ingrese una serie de números para que el ascensor recorra cada piso hasta dicho número. 
  Lo más importante es que el recorrido empieza desde el piso 0 y termina en el 0, por lo tanto, tenemos que calcular automáticamente los pisos recorridos.

He decidido optar por un bucle de tipo do-while, en el cual se irán introduciendo números hasta que se marque el piso 0. 
Además, he definido una serie de variables que irán calculando el recorrido que se hace por cada piso marcado. Para ello, he creado tres condiciones 
en el bucle do-while, que buscan la diferencia entre el piso marcado actual y el piso anterior, evitando contabilizar números negativos. Aparte, 
he añadido otra condición que sale del bucle si se marca un número que no esté dentro del rango de 1 a 10.

Por último, guardo los pisos recorridos en una variable y se los sumo al final al último piso anterior calculado para obtener el total de pisos 
recorridos entre el piso 0 hasta el 0 de nuevo*/
package Actividad2_UD2;
import java.util.Scanner;
public class Ascensor_EJ5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int pisoanterior = 0;
		int number;
		int pisosrecorridos = 0;
		System.out.println("Introduzca los pisos (uno por línea): ");
		
		do 
		{
			number = sc.nextInt();
			if (number > 10)
			{
				System.out.println("Fuera de rango");
				break;
			}
			if (number > pisoanterior)
					pisosrecorridos += number - pisoanterior;
			else
				pisosrecorridos += pisoanterior - number;
			pisoanterior = number;
			
		} while (number != 0);
		pisosrecorridos += pisoanterior;
		System.out.println("Recorridos " + pisosrecorridos + " pisos");
		sc.close();
	}
}
