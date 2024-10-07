package Ejercicio_clase;
import java.util.Arrays;

public class EjercicioArrays 
{
	public static int suma(int [] Array)
	{
		int suma = 0;
		for (int i = 0; i < Array.length; i++)
		{
			suma = suma + Array[i];
		}
		return suma;
		
		
		
	}
	
	public static void printArray(int [] str)
	{
		int len = 0;
		for (int i = 0; i <= str[len]; i++)
			System.out.print(" " + str[i]);
		System.out.print('\n');
	}
	

	public static void main(String[] args) 
	{
		int [] Array = {3, 5, 2, 25};
		int len = 0;
		
		System.out.println(Arrays.toString(Array));
		for (int i = 0; i <= Array[len]; i++)
			System.out.print( " " + Array[i]);
		System.out.print('\n');
		
		printArray(Array);
		
		
		System.out.println(suma(Array));
		Array[1] = 17;
		System.out.println(Arrays.toString(Array));
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
		System.out.println(Arrays.binarySearch(Array, 81));
		
		
					
		
		
		

	}

}
