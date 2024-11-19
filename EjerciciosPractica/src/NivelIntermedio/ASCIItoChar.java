package NivelIntermedio;
import java.util.Scanner;

public class ASCIItoChar 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un codigo ASCII: ");
		
		int codigo = sc.nextInt();
		char caracter = (char) codigo;
		
		System.out.println(caracter);
		sc.close();
	}

}
