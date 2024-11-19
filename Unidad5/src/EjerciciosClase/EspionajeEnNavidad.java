package EjerciciosClase;
import java.util.Scanner;

public class EspionajeEnNavidad 
{
	public static String rotarLetra (String letra)
	{
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < letra.length(); i++)
		{
			char c = letra.charAt(i);
			
			if ((c >= 'A' && c <= 'W') || (c >= 'a' && c <= 'w'))
				resultado.append((char)(c + 3));
			else if (c == 'X' || c == 'Y' || c == 'Z')
				resultado.append((char)(c - 23));
			else if ((c == 'a' || c == 'y' || c == 'z'))
				resultado.append((char)(c - 23));
			else
				System.out.print(c);
		}
		return resultado.toString();
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		final String CIERRE = "FIN";
		System.out.println("Escribe un texto: ");
		String texto;
		
		do
		{
			texto = sc.nextLine();
			if (!texto.equals(CIERRE))
				rotarLetra(texto);
				
			else
				break;
		} while (!texto.equals(CIERRE));
		System.out.print(texto.toString());
		sc.close();
	
		

	}

}
