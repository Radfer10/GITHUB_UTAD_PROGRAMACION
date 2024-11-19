/*En este segundo ejercicio se nos pide que dentro de un String se contabilice el número de 
 * letras "amor" que aparecen en el texto. Puede que esta palabra esté de forma consecutiva 
 * o que esté dividida en diferentes letras dentro del texto. Para ello, creo un método 
 * llamado AmorCont que, en base a un String, inicializa una variable llamada cont a 0. 
 * Luego, realizo un bucle en el que i se incrementará cuando encuentre una 'a'. Si es así, 
 * dentro de este bucle inicializo otro contador diferente que se incrementará hasta encontrar 
 * la siguiente letra que forma "amor", y así sucesivamente hasta encontrar la palabra "amor" 
 * completa en el String. Después de esto, cont se incrementará, señalando que se ha encontrado 
 * la palabra "amor" una vez. A continuación, igualo i = h para evitar que la última letra encontrada 
 * se contabilice dos veces en el String.

Después de esto, en el método main creo una variable llamada contador que llamará al método 
AmorCont y mostrará en pantalla el número de "amor" encontrados en el texto.*/
package Actividad5RaulDeMiguel;
import java.util.Scanner;

public class EJ2TextoAmor 
{
	public static int AmorCont(String texto)
	{
		int cont = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) == 'a')
			{
				int j = i + 1;
				while (j < texto.length() && texto.charAt(j) != 'm')
					j++;
				if (j < texto.length())
				{
					int k = j + 1;
					while (k < texto.length() && texto.charAt(k) != 'o')
						k++;
					if (k < texto.length())
					{
						int h = k + 1;
						while (h < texto.length() && texto.charAt(h) != 'r')
							h++;
						if (h < texto.length())
						{
							cont++;
							i = h;
						}
					}
				}
			}
		}
		return cont;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		int contador = AmorCont(texto);
		System.out.println(+ contador);
		sc.close();
	}
}
