package RetoMatrix;

public class Personaje 
{
	String nombre;
	boolean esBueno; 
	
	Personaje(String nombre, boolean esBueno)
	{
		this.nombre = nombre;
		this.esBueno = esBueno;	
	}
	public static boolean getsetter (boolean esBueno)
	{
		return esBueno;
	}
	public static boolean setter (boolean esBueno)
	{
		esBueno = true;
		return esBueno;
	}
	public void recibeDisparo ()
	{
		esBueno = !esBueno;
	}
	/*public String toString()
	{
		String s = "Nombre: " + nombre + "\n";
		s += "Bueno: " + (esBueno ? "Si" : "No");
		return (s);
	}*/
	public String toString()
	{
		String s = "Nombre: " + nombre + "\n";
		if (esBueno)
			s += ("Bueno: Si");
		else
			s += ("Bueno: No");
		return s;
		
	}
}
