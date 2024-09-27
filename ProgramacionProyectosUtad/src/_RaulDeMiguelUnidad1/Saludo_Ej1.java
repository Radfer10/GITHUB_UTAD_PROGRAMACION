package _RaulDeMiguelUnidad1;
import java.util.Scanner;

public class Saludo_Ej1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine ();
		System.out.println("Hola " + nombre);
		sc.close();
	}

}

/* En este código, al tener que imprimir un nombre que el usuario escribe,
utilizamos la clase de Java "Scanner", que nos sirve para que el programa, al ejecutarse,
"escanee" en la línea de entrada el nombre que el usuario ha introducido. 

Luego hacemos que el programa nos imprima un "Hola" seguido de la variable declarada como "Scanner", 
que tiene la información del nombre que el usuario ha tecleado anteriormente. */