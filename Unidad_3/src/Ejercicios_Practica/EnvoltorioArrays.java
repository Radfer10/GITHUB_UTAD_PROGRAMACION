package Ejercicios_Practica;

import java.util.Arrays;

public class EnvoltorioArrays 
{
	public static void main (String[] args)
	{
		int [] miVector = {11,80,66,0,9};
		
		System.out.println(Arrays.toString(miVector)); //Nos muestra el contenido literal del Array
		Arrays.sort(miVector); //Aqui estamos ordenando con sort el Array
		
		System.out.println(Arrays.binarySearch(miVector, 80)); //Con binarySearch busca la posicion de un array ordenado 
		System.out.println(Arrays.toString(miVector)); //Al a ver cambiado ocn sort el orden del array nos lo muesra ordenado 
	}

}
