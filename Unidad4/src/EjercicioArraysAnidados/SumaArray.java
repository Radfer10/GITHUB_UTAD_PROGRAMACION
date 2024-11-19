package EjercicioArraysAnidados;

public class SumaArray 
{

	public static void main(String[] args) 
	{
		int numero[][] = {{1,3,5,7}, {5,4,1,16},{7,9,61,13}};
		int suma = 0;
		for (int fila = 0; fila < numero.length; fila++)
		{
			for (int columna = 0; columna < numero[fila].length; columna++)
			{
				suma += numero[fila][columna];
				
			}
		}
		System.out.println("La suma es: " + suma);
		suma = 0;
		for (int columna = 0; columna < numero[0].length; columna++)
		{
			for (int fila = 0; fila < numero.length; fila++)
			{
				suma += numero[fila][columna];
				
			}
		}
		System.out.println("La suma es: " + suma);
	}
}
