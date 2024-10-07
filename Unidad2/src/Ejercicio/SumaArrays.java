package Ejercicio;

public class SumaArrays 
{
	public static void main(String[] args) 
	{
		int [] arrayEjemplo = {2,5,1,3,4};
	
		int i = 0;
		int suma = 0;
	
		while (i < arrayEjemplo.length)
		{
			suma = suma + arrayEjemplo[i]; 
			i++;
		}
		System.out.println("La  suma es: " + suma);


	}
}
