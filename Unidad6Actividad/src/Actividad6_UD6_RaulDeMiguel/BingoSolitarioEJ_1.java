/*En este primer ejercicio se nos pide recrear un bingo. Es decir que el usuario introduzca una
 *serie de 5 números que serán los números ganadores, el usuario posteriormente vaya escribiendo 
 *números sucesivamente hasta introducir todos los números introducidos inicialmente, seguido de 
 *eso el programa debe mostrar BINGO y parar el programa. 

Para ello yo he decidido crear dos estructuras de tipo HashSet llamados boleto y marcados ya que 
uno se encargará de recoger el número del boleto y otro se encargará de recoger dentro de los números 
que el usuario vaya introduciendo los números del set boleto. 

Para ello y mediante un Scanner creó un String llamado numeroBoleto que reconocerá cada número 
dentro del string dependiendo si encuentra un espacio entre medias gracias al método split. 

después y mediante un bucle for-each declaró un string numero que recogerá el valor de numeroBoleto 
en el bucle y dentro de este bucle empezamos a validar datos de entrada. 

Validamos que el tamaño del boleto no sea mayor de 5 números, también válido que únicamente 
se acepte como carácter válido los números mediante un método que he creado llamado validation 
que básicamente este método verifica que si dentro de un string hay únicamente números o no.  
Si es así y supera esta validación se añadirá los valores de los números introducidos por el 
usuario al set boleto mediante un parseInt que recorre cada número ingresado. 

Y para finalizar comprobamos que una vez verificada la entrada de los caracteres ingresados 
en el boleto verificamos lo mismo para los números que se ingresarán después del boleto. y 
después y pasado todas las verificaciones creó una condición que va a ir añadiendo al set 
marcados todos los valores que coincidan con el set boleto y si se añaden todos los 
caracteres del boleto se printea un bingo y se termina el programa. 
*/
package Actividad6_UD6_RaulDeMiguel;

import java.util.HashSet;
import java.util.Scanner;

public class BingoSolitarioEJ_1 
{
	public static boolean validation(String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			if (!Character.isDigit(cadena.charAt(i)))
				return false;
		}
		return true;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		HashSet<Integer> boleto = new HashSet<>();
		HashSet<Integer> marcados = new HashSet<>();
		
		String[] numerosBoleto = sc.nextLine().split(" ");
		String entradaNumeros;
		
		for (String numero : numerosBoleto)
		{
			if (boleto.size() >= 5)
			{
				System.out.println("Solo se permite un maximo de 5 numeros");
				return;
			}
			if (validation(numero))
				boleto.add(Integer.parseInt(numero));
			else
			{
				System.out.println("Solo se permiten numeros");
				return;
			}
		}
		
		if (boleto.size() > 5)
		{
			System.out.println("Error: Se han ingresado más de 5 números");
		}
		else
		{
			while (true)
			{
				entradaNumeros = sc.nextLine();
				if (validation(entradaNumeros))
				{
					int num = Integer.parseInt(entradaNumeros);
					if (num == -1)
					{
						System.out.println("Error, numero invalido");
						return;
					}
					if (boleto.contains(num))
						marcados.add(num);
					
					if (marcados.containsAll(boleto))
					{
						System.out.println("BINGO");
						return;
					}
				}
				else
				{
					System.out.println("Entranda no valida solo ingresar numeros");
					return;
				}
			}
		}
	}
}

