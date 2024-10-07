/*/*En este ejercicio se nos pide que consigamos sacar la secuencia de 3 
 * números dentro de un array que dé la suma total del resto de secuencias de dicho array. 
 * Para ello, he declarado dos arrays: el primero, llamado "Numero", 
 * es donde voy a ir introduciendo el valor "num", que es la variable 
 * que guarda los datos que introduzco en el array. El segundo array que 
 * he creado contendrá los 3 números del primer array que sumen la secuencia 
 * más alta de 3 números.
 *
 *Para lograr esto, creo dos bucles for. El primero servirá para que se 
 guarden los números que introduzco en el array, y el segundo se encargará de 
 calcular la suma de las secuencias de 3 números que vaya encontrando en el 
 array. Para obtener la secuencia más alta, creo un if dentro del bucle que 
 actualizará la secuencia máxima, y posteriormente guardo cada número de la 
 secuencia máxima en cada posición del segundo array. Después, imprimo cada 
 número de la secuencia de 3 más alta del primer array.*/

package Actividad3RaulDeMiguel;

import java.util.Scanner;

public class MayorSecuencia3 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int num;
		int Numero[] = new int[9];
		int MaxNumero[] = new int[3];
		
		for (int i = 0; i < Numero.length; i++)
		{
			System.out.print("Numero " + (i + 1) + ": ");
			num = sc.nextInt();
			Numero[i] = num;
		}
		int sumaConsecutiva = 0;
		int sumaMax = 0;
		
		for (int i = 0; i < Numero.length - 2; i++)
		{
			sumaConsecutiva = Numero[i] + Numero[i + 1] + Numero[i + 2];
			if (sumaConsecutiva > sumaMax)
			{
				sumaMax = sumaConsecutiva;
				MaxNumero[0] = Numero[i];
				MaxNumero[1] = Numero[i + 1];
				MaxNumero[2] = Numero[i + 2];
			}
		}
		System.out.println(+ MaxNumero[0] + " " + MaxNumero[1] + " " + MaxNumero[2]);
		sc.close();
	}
}
