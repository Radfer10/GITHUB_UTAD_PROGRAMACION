/*En este último ejercicio se nos pide que podamos tanto encriptar como desencriptar un texto 
 * mediante dos signos + y -, es decir, si delante del texto hay un +, en la salida tendrá 
 * que aparecer el texto encriptado y si hay un -, el texto debería desencriptarse. Para ello, 
 * nos dicen que la clave de encriptación es QWERTYUIOPASDFGHJKLZXCVBNM. Básicamente nos dice 
 * que la A tiene que ser una Q y así sucesivamente.

Para ello, yo he declarado dos variables constantes en el código: una con el alfabeto 
encriptado como se nos pide en el ejercicio y otra variable constante con el alfabeto 
normal como lo conocemos. Después de esto, creo dos métodos: uno para desencriptar el 
texto y otro para encriptar el texto.

Sigo la siguiente lógica: en el caso de encriptar un texto mediante StringBuilder, creo 
una variable llamada result de tipo StringBuilder que será el resultado del string encriptado. 
A continuación, mediante un bucle que recorre un string, recorreré el string letra por letra, 
en donde dentro de una variable tipo int que contendrá el alfabeto normal irá recorriendo el 
string. Después, declaro una variable char en donde cada palabra que recorra esta variable 
que contendrá un indexOf se irá cambiando por una letra del alfabeto encriptado y después 
con result.append(encriptado) le meteré el string ya encriptado. 
En el caso en el que el índice haya encontrado una letra, si no ha encontrado una letra, 
este carácter no será modificado y así hasta devolver un texto ya encriptado.

Para desencriptar declaro otro método con la misma lógica pero en el sentido inverso. 
Por último, en el método main, pediré al usuario que introduzca un texto y que si delante de 
este texto el programa encuentra un signo + o - llamará al método de encriptar o desencriptar 
y después lo pasará por pantalla.*/
package Actividad5RaulDeMiguel;
import java.util.Scanner;
public class Ej3EncriptarYDesencriptar 
{
	final static String ALFABETO_ENCRIPTADO = "QWERTYUIOPASDFGHJKLZXCVBNM";
	final static String ALFABETO_NORMAL = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
	
	public static StringBuilder encriptar (String texto)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < texto.length(); i++)
		{
			char c = texto.charAt(i);
			if (Character.isLetter(c))
			{
				int indice = ALFABETO_NORMAL.indexOf(Character.toUpperCase(c));
				char encriptado = ALFABETO_ENCRIPTADO.charAt(indice);
				result.append(encriptado);
			}
			else
				result.append(c);
		}
		return result;
		
		
	}
	
	public static StringBuilder desencriptar (String texto)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < texto.length(); i++)
		{
			char c = texto.charAt(i);
			if (Character.isLetter(c))
			{
				int indice = ALFABETO_ENCRIPTADO.indexOf(Character.toUpperCase(c));
				char desencriptado = ALFABETO_NORMAL.charAt(indice);
				result.append(desencriptado);
			}
			else
				result.append(c);
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el texto: ");
		String texto = sc.nextLine();
		char signo = texto.charAt(0);
		String textofinal = texto.substring(1);
		
		if (signo == '+')
			System.out.println(""+ encriptar(textofinal));
		else if (signo == '-')
			System.out.println(""+ desencriptar(textofinal));
		else
			System.out.println("Texto no valido");
		sc.close();
	}
}
