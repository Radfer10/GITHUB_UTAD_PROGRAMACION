/*En este ejercicio, que consiste en recrear el juego del buscaminas según 
 * el ejemplo del ejecutable que nos muestran, tenemos que pedirle al usuario 
 * que ingrese tanto el ancho como el alto del tablero del juego. Además, 
 * después de esto, debemos solicitarle también que ingrese unas coordenadas 
 * de X e Y en función del tablero que ha introducido anteriormente. 
 * Posteriormente, debemos verificar si el usuario ha caído en una bomba o 
 * no, y si tiene alguna cerca, en caso de que no haya caído en una.

Para ello, he decidido crear tres métodos diferentes. El primero, "MakeTablero," 
es el método que se encarga de crear el tablero de juego según dos variables 
que indicarán el ancho y el alto del tablero, según lo que el usuario 
introduzca. Utilizando dos iteradores en un bucle for anidado, recorreré 
dichas variables y, al final, las igualo a un signo "-". Cuando se ejecute 
la acción de imprimir el tablero, este se mostrará con las dimensiones dadas 
por el usuario.

El segundo método, llamado "HayBomba," es el encargado de generar bombas en el 
tablero creado anteriormente con el signo "". Para ello, creo un bucle for 
anidado y establezco dos condiciones. Utilizando el método "Math.random," 
si este devuelve un valor por debajo de 0.1, el tablero en la posición donde 
se cumpla esa condición se imprimirá con un "". Si no se cumple esa condición, 
el tablero se imprimirá con el símbolo "-". Es decir, este método sobreescribe 
el tablero original con los signos "*" y "-" en función de si hay una bomba o 
no.

El tercer método que he creado se llama "ContarBombas," y básicamente verifica 
desde el tablero original si hay bombas alrededor de las coordenadas que el 
usuario introduzca. Para ello, dentro del método, declaro una variable 
contador que irá incrementando su valor en función de si se cumple alguna de 
las condiciones. Estas condiciones son que, si a la derecha, a la izquierda o 
debajo de la coordenada hay una bomba "*", deberá incrementar su valor.

Por último, en el método main llamaría a todos estos métodos. Primero, 
llamaría al método "MakeTablero," que creará el tablero de juego; luego, 
llamaría a la función "HayBomba" para que se formen bombas dentro del tablero 
ya creado. Después, declaro dos variables, X e Y, para que el usuario tenga la 
oportunidad de ingresar las coordenadas en el tablero y, en función de si cae 
o no en una bomba, le informe al usuario de lo que ha pasado. Finalmente, con 
un bucle for anidado, dibujo el tablero según las dimensiones introducidas por 
el usuario y con las bombas también dibujadas.*/
package ActividadUD4RaulDeMiguel;
import java.util.Scanner;

public class Buscaminas 
{
	public static boolean estasEnLimites(String tablero[][], int x, int y)
	{
		int filas = tablero.length;
		int columnas = tablero[0].length;
		
		return x >= 0 && x < columnas && y >= 0 && y < filas;
	}
	public static String[][]MakeTablero()
	{
		Scanner sc = new Scanner (System.in);

		int width;
		int high;
		do
		{
			System.out.print("Ancho del tablero: ");
			width = sc.nextInt();
			System.out.print("Alto del tablero: ");
			high = sc.nextInt();
			if (width < 5 || width > 15 || high < 5 || high > 15)
			{
				System.out.print("Error");
				System.out.println();
			}
		} while (width < 5 || width > 15 || high < 5 || high > 15);
		String Tablero[][] = new String[high][width];
		
		for (int i = 0; i < Tablero.length; i++)
		{
			for (int j = 0; j < Tablero[i].length; j++)
				Tablero[i][j] = "-";
		}
		return Tablero;
	}
	
	public static void HayBomba(String Tablero[][])
	{
	
		for (int i = 0; i < Tablero.length; i++)
		{
			for (int j = 0; j < Tablero.length; j++)
			{
				if (Math.random() < 0.1)
					Tablero[i][j] = "*";
				else
					Tablero[i][j] = "-";
			}
				
		}
	}
	
	 public static int contarBombas(String[][] tablero, int x, int y) 
	 {
		 int contador = 0;
		 
		 if (estasEnLimites(tablero, x - 1, y) && tablero[y][x - 1].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x - 1, y) && tablero[y][x + 1].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x, y) && tablero[y][x].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x - 1, y + 1) && tablero[y + 1][x - 1].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x - 1, y + 1) && tablero[y + 1][x - 1].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x - 1, y - 1) && tablero[y - 1][x - 1].equals("*"))
		        contador++;
		 if (estasEnLimites(tablero, x - 1, y - 1) && tablero[y - 1][x - 1].equals("*"))
		        contador++;
			 
		 return contador;
	 }
	        

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String tablero[][] = MakeTablero();
		HayBomba(tablero);
		int X;
		int Y;
		System.out.print("Coordenada X: ");
		X = sc.nextInt();
		System.out.print("Coordenada y: ");
		Y = sc.nextInt();
		
		while ((Y >= 0 && Y <= tablero.length) || (X >= 0 && X <= tablero[Y].length))
		{
			if (tablero[Y][X].equals("*"))
			{
				System.out.print("Hay bomba en la posicion: (" + Y + "," + X + ")");
				break;
			}
				
			else if (tablero[Y][X] != ("*"))
			{
				System.out.print("No hay bomba en la posición: (" + Y + "," + X + ")");
				System.out.println();
				int contador = contarBombas(tablero, X, Y);
                System.out.println("Hay " + contador + " alrededor");
				break;
			}
			else
				System.out.print("Coordenadas fuera de rango");
			}
		
		System.out.println();
		for (int i = 0; i < tablero.length; i++)
		{
			for (int j = 0; j < tablero[i].length; j++)
			{
				System.out.print(tablero[i][j]);
				
			}
			System.out.println();
			sc.close();
			}
		}
	}