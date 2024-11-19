package Diccionarios;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjIntolerancia 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introducce los ingredientes del dia 1 (mal): ");
		String[] dia1 = sc.nextLine().split(" ");
		System.out.println("Introducce los ingredientes del dia 2 (bien): ");
		String[] dia2 = sc.nextLine().split(" ");
		System.out.println("Introducce los ingredientes del dia 3 (bien): ");
		String[] dia3 = sc.nextLine().split(" ");
		
		Set<String> ingredientesSeguros = new HashSet<>();
		Set<String> ingredientesPeligrosos = new HashSet<>();
		
		for (String ingrediente : dia2)
			ingredientesSeguros.add(ingrediente);
		for (String ingrediente : dia3)
			ingredientesSeguros.add(ingrediente);
		for (String ingrediente : dia1)
		{
			if (!ingredientesSeguros.contains(ingrediente))
				ingredientesPeligrosos.add(ingrediente);
		}
		
		System.out.println("Comidas riesgo: "+ ingredientesPeligrosos);
		sc.close();
	}

}
