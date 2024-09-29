package ActividadUD1_VideoDepuracion;

public class Depurar 
{
	public static int porDos(int num) 
	{
		int resultado;
		resultado = 2 * num;
		return resultado;
	}
	
	public static int porSeis (int num) 
	{
		int resultado;
		resultado = 3 * porDos (num);
		return resultado;
	}
	
	public static void main(String[] args) 
	{
		int num1 = 3;
		int num2;
		num2 = porSeis (num1);
		System.out.printf("Num1: %d, Num2: %d", num1, num2);
	}
}
