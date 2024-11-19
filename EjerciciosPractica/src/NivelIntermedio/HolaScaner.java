package NivelIntermedio;
import java.util.Scanner;

public class HolaScaner 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cual es tu nombre?");
		String name = sc.nextLine();
		System.out.println("Bienvenido "+ name);
		sc.close();
	}
}
