package RetoClaseHumano;

public class Humano 
{
	String nombre;
	int edad;
	double peso;
	double estatura;
	
	public Humano(String nombre, int edad, double peso, double estatura)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
	}
	public void crecer ()
	{
		this.edad++;
	}
	public int getedad()
	{
		return edad;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void cumplirAños()
	{
		edad += 1;	
	}
	
	public double cambiarPeso()
	{
		peso += 30;
		return peso;
	}
	
	public static void cambiarEstatura()
	{
		
	}
	
	
	public static String getNombre(String nombre)
	{
		return nombre;
	}
	
	public String toString()
	{
		return (nombre + " " + edad + " " + peso + " " + estatura + " ");
	}
}
