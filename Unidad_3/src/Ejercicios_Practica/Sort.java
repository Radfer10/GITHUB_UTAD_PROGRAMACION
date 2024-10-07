package Ejercicios_Practica;
import java.util.*;
public class Sort 
{
	public static void main (String a[]) throws Exception
	{
		Integer [] miVector = {11, 80, 66, 8, 9};
		Arrays.sort(miVector, Collections.reverseOrder());
		System.out.println(Arrays.toString(miVector));
		
	}

}
