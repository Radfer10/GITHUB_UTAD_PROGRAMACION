package Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJProximoRey 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce a los reyes: ");
		Map<String, Integer> dinastia = new HashMap<>();
		
		String[] reyes = sc.nextLine().split(" ");
		
		for (String rey : reyes)
		{
			int cont = dinastia.getOrDefault(rey, 0 + 1);
			dinastia.put(rey, cont + 1);
		}
		
		String nombreRey = sc.nextLine();
		
		int numeroRey = dinastia.getOrDefault(nombreRey, 0 + 1);
		System.out.println(numeroRey);
		sc.close();
		

	}

}
