/*Para este segundo ejercicio se nos pide que diseñemos o más bien intentamos replicar dentro 
 * de java comandos parecidos a un código BASIC. Para ello tenemos que conseguir que el programa 
 * identifique una serie de comandos y en función a eso vaya ejecutando cada línea que el usuario 
 * va a ir añadiendo. 

Los comandos a programar son PRINT que printea un String, GOTO que en función al número del 
índice del diccionario va ha ir saltando según el índice que el usuario le pida, REM que es 
un comentario que no hace nada y END que para el funcionamiento de todos los comandos dentro 
del programa sea en la línea que sea. 

Para ello yo he utilizado en este caso implementar un TreeMap ya que en función del número de 
cada línea lo irá ordenando de menor a mayor y es lo que se nos pide según ejercicio precisamente, 
que lea cada comando de menor a mayor según el índice de cada línea. 

También he ido creando dos diferentes métodos para programar los comandos PRINT y GOTO

Dentro del main empezamos inicializando el Scanner y dentro de un bucle inicializaremos una 
variable de tipo String llamado línea que contendrá el valor de las líneas que el usuario vaya 
introduciendo. 

Después verificó que cuando linea sea igual a fin el programa se finalice tal y como nos lo 
piden en el enunciado, posteriormente y mediante el método split dividiremos el string en 
diferentes partes donde la primera parte contendrá el número de la línea en este caso sería 
el índice de cada línea y el resto de la línea seria la instruccion que lo acompaña. 

Y después mediante un bucle haré que el programa recorra y lea linea por linea y que cuando 
termine de leer cada línea y mediante un switch identificará según el comando que instrucción 
tendrá que hacer el programa y en función a la instrucción que identifique en cada línea se 
llamarán a los diferentes métodos de los comandos programados. 

Y así de esta forma el programa recorre cada línea según de menor a mayor y si encuentra un 
GOTO que sería un salto entre líneas hará el salto de la línea actual a la línea nueva y 
si le toca un comando PRINT printeará el mensaje de la línea y así sucesivamente. 
Hasta detenerse en el momento en el que el usuario le pase por pantalla la palabra fin. 
*/
package Actividad6_UD6_RaulDeMiguel;
import java.util.TreeMap;
import java.util.Scanner;


public class ProgramaBASIC 
{
	private static TreeMap<Integer, String> programaBASIC = new TreeMap<>();
	
	public static void PRINT (String texto)
	{
		System.out.println(texto);
	}
	public static Integer GOTO (int lineaDestino)
	{
		if (programaBASIC.containsKey(lineaDestino))
			return lineaDestino;
		else
			return null;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		while (true)
		{
			String linea = sc.nextLine();
			
			if (linea.equals("fin"))
				break;
			String[] dividirlinea = linea.split(" ", 2);
			
			if (dividirlinea.length == 2)
			{
				int numeroLinea = Integer.parseInt(dividirlinea[0].trim());
				String instruccion = dividirlinea[1].trim();
				programaBASIC.put(numeroLinea, instruccion);
			}
			
		}
		int lineaActual = programaBASIC.firstKey();
		while (lineaActual < programaBASIC.lastKey() + 1)
		{
			String lineas = programaBASIC.get(lineaActual);
			if (lineas == null)
			{
				lineaActual++;
				continue;
			}
			String[] parteslinea = lineas.split(" ", 2);
			String comando = parteslinea[0];
			switch (comando)
			{
			case "PRINT":
				PRINT(parteslinea[1].replace("\"", ""));
				lineaActual++;
				break;
			case "GOTO":
				int dest = Integer.parseInt(parteslinea[1]);
				Integer nuevalinea = GOTO(dest);
				if (nuevalinea != null)
					lineaActual = nuevalinea;
				else
					lineaActual++;
				break;
			case "REM":
				lineaActual++;
				break;
			case "END":
				return;
			default:
				System.out.println("Comando invalido");
				lineaActual++;
				break;
			}
			sc.close();
		}
	}
}
