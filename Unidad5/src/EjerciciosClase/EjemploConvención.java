package EjerciciosClase;
import java.util.Scanner;

public class EjemploConvención 
{
	public static void validation (String texto)
	{
		
	}
	public static String convertirMayusculas(String texto) 
	{
		texto = texto.toLowerCase();
		StringBuilder palabra = new StringBuilder();
		Boolean convertirMayusculas = true;
		for (int i = 0; i < texto.length(); i++)
		{
			char c = texto.charAt(i);
			if (c == ' ')
			{
				convertirMayusculas = true;
			}
			else if (convertirMayusculas)
			{
				palabra.append(Character.toUpperCase(c));
				convertirMayusculas = false;
			}
			else
				palabra.append(c);
		}
		return palabra.toString();
	}
	public static String convertirMinusculas(String texto)
	{
		texto = texto.toLowerCase();
		StringBuilder palabra = new StringBuilder();
		Boolean convertirMayusculas = false;
		for (int i = 0; i < texto.length(); i++)
		{
			char c = texto.charAt(i);
			if (c == ' ')
			{
				convertirMayusculas = true;
			}
			else if (convertirMayusculas)
			{
				palabra.append(Character.toUpperCase(c));
				convertirMayusculas = false;
			}
			else
				palabra.append(c);
		}
		return palabra.toString();
	}
	
	public static void main (String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Elige el tipo de dato: ");
		System.out.println("1. Variable");
		System.out.println("2. Metodo");
		System.out.println("3. Clase");
		int numero = 0;
		while (sc.hasNextInt())
		{
			numero = sc.nextInt();
			if (numero >= 0 && numero <= 9)
				break;
			else
			{
				System.out.println("Error, carácter no valido");
				sc.next();
			}
		}
		sc.nextLine();
		System.out.print("Escribe una palabra: ");
		String texto = sc.nextLine();
		
		switch (numero)
		{
		case 1:
			texto = convertirMinusculas(texto);
			break;
		case 2:
			texto = convertirMayusculas(texto);
			break;
		case 3:
			texto = convertirMayusculas(texto);
			break;
		default:
			texto = "Error, accion incorrecta";
		}
		System.out.println(texto);
		sc.close();
	}

}
