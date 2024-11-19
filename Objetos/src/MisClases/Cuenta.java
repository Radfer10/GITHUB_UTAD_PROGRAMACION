package MisClases;

public class Cuenta 
{
	int saldo;
	String nombre;
	
	Cuenta (int saldo, String nombre)
	{
		this.saldo = saldo;
		this.nombre = nombre;
	}

	void verCuenta()
	{
		System.out.println("Saldo: " + saldo);
		System.out.println("Nombre: " + nombre);
	}
	public static void main(String[] args) 
	{
		Cuenta a = new Cuenta (120, "Raul");
		Cuenta b = new Cuenta (20000, "Andrea");
		Cuenta c = new Cuenta (200000000, "Ramon");
		
		a.verCuenta();
		System.out.println();
		
		b.verCuenta();
		System.out.println();
		
		c.verCuenta();
		System.out.println();
		
		

	}

}
