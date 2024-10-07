/*En este ejercicio se nos pide que, dentro de un array de números, podamos 
 * determinar si la suma de la primera secuencia de números es igual a la suma 
 * de los números que quedan por leer del array.

Para ello, creo un array que guarde los números que voy introduciendo y, 
con un bucle for, los iré guardando. A continuación, crearé otro bucle for 
para calcular la suma total de todos los números del array. Por último, creo 
un último bucle for que sumará una parte de los números del array y calculará 
esa suma total. Luego, creo una variable que calculará la diferencia entre la 
suma acumulada y la suma total, y si la suma acumulada es igual a la diferencia 
entre la suma acumulada y la suma total, con la ayuda de una bandera determinaré 
que se cumple la condición, mostrando "SI" cuando esto ocurra y "NO" si no se cumple.*/

package Actividad3RaulDeMiguel;

import java.util.Scanner;

public class SumasIguales 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num;
		int cantidad[] = new int[5];
		Boolean flag = false;
		
		for (int i = 0; i < cantidad.length; i++)
		{
			System.out.print("Cantidad " + (i + 1) + ": ");
			num = sc.nextInt();
			cantidad[i] = num;
		}
		int sumaTotal = 0;
		
		for (int i = 0; i < cantidad.length; i++)
		{
			sumaTotal += cantidad[i];
		}
		
		int sumaAcumulada = 0;
		
		for (int i = 0; i < cantidad.length - 1; i++)
		{
			sumaAcumulada += cantidad[i];
			int sumaResto = sumaTotal - sumaAcumulada;
			if (sumaAcumulada == sumaResto)
			{
				flag = true;
				break;
				
			}
		}
		if (flag)
			System.out.println("SI");
		else
			System.out.println("NO");
		sc.close();
	}
}

