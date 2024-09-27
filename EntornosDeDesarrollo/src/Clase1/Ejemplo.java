package Clase1;

import java.util.Scanner;

public class Ejemplo 
{

	public static void main(String[] args) 
	{
		System.out.println("Hola");
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String respuesta = sc.nextLine();
		System.out.println("Hola " + respuesta);
		sc.close();

	}

}
