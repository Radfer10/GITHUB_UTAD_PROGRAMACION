package EjercicioArraysAnidados;

import java.util.Arrays;

public class ClonarArrays 
{

	public static void main(String[] args) 
	{
		int primos [] = {1,2,3,5,7,11,13,17,19,23};
		int copiaClonado [];
		int copiaReferencia [];
		
		copiaClonado = primos.clone();
		copiaClonado[0] = 0;
		copiaReferencia = primos;
		copiaReferencia[1] = 8;
		
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copiaClonado));
		System.out.println(Arrays.toString(copiaReferencia));
		

	}

}
