package Ejercicios_Practica;

import java.util.Arrays;
import java.util.Collections;

public class SortReverse 
{
	public static void main (String a[]) throws Exception
	{
		Integer [] miVector = {11, 80, 66, 8, 9};
		Arrays.sort(miVector, Collections.reverseOrder());
		System.out.println(Arrays.toString(miVector));
		
	}


}
