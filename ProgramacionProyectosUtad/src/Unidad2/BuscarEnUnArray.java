package Unidad2;

public class BuscarEnUnArray 
{

	public static void main(String[] args) 
	{
		int [] arrayEjemplo = {2,5,1,3,4};
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		int resta = 15;
		int media = 0;
		int i = 0;
		while (i < arrayEjemplo.length)
		{
			if (mayor < arrayEjemplo[i])
				mayor = arrayEjemplo[i];
			if (menor > arrayEjemplo[i])
				
				menor = arrayEjemplo[i];
			suma = suma + arrayEjemplo[i];
			resta = resta - arrayEjemplo[i];
			media = suma / arrayEjemplo.length;
			i++;
		}
		System.out.println("El mayor de los numeros es: " + mayor);
		System.out.println("El menor de los numeros es: " + menor);
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("La resta de los numeros es: " + resta);
		System.out.println("La media de los numeros es: " + media);

	}

}
