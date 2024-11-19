package EjercicioArraysAnidados;

import java.util.Arrays;

public class CopiarArrays 
{

	public static void main(String[] args) 
	{
		int primos [] = {1,2,3,5,7,11,13,17,19,23};
		int copia[] = new int[primos.length];
		int len = 0;
		
		System.arraycopy(primos, 1, copia, len, 6);
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copia));

	}

}
