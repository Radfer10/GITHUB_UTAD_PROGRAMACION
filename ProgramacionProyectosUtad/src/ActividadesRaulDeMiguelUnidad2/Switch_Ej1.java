/*En este último ejercicio se nos pide que utilicemos la instrucción switch, en la que se ingrese un número del 1 al 7 
 * y se imprima en la salida el día de la semana correspondiente a dicho número. Si se ingresa un número fuera del rango 
 * de 1 a 7, se mostrará "Error, fuera de rango".

Para ello, declaro una variable llamada numero, que funcionará como un escáner para que el programa lea el número que 
el usuario introduzca en todo momento. Además, declaro otra variable de tipo String, que será donde voy a guardar el texto 
de cada día de la semana. Después, inicio la instrucción switch y creo un total de 7 casos para que se asigne un día de la 
semana a cada número, imprimiendo la variable de texto correspondiente en cada caso. Por último, el caso default servirá como 
condición para informar del error si el número está fuera del rango de 1 a 7 y finalizar el programa.


 */

package ActividadesRaulDeMiguelUnidad2;
import java.util.Scanner;

public class Switch_Ej1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Por favor, introduzca un número del 1 al 7: ");
		int numero = sc.nextInt();
		String texto = "";
		
		switch (numero)
		{
		case 1:
			texto = "Lunes";
			break;
		case 2:
			texto = "Martes";
			break;
		case 3:
			texto = "Miércoles";
			break;
		case 4:
			texto = "Jueves";
			break;
		case 5:
			texto = "Viernes";
			break;
		case 6:
			texto = "Sábado";
			break;
		case 7:
			texto = "Domingo";
			break;
		default:
			texto = "Error, fuera de rango";
		}
		System.out.println(texto);
		sc.close();

	}

}
