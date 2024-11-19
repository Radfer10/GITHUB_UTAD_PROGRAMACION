package Diccionarios;

public class Coche 
{
	String marca;
	String modelo;
	String matricula;
	int año;
	
	Coche()
	{
		this.marca = "Audi";
		this.modelo = "A3";
		this.matricula = "1234 ABC";
		this.año = 2002;
		
	}
	
	Coche(String marca, String modelo, String matricula, int año)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.año = año;
	}
	
	void verInfo()
	{
		System.out.println("marca: " + marca + "modelo: " + modelo + "matricula: " + matricula + "año: " + año);
	}

	public static void main(String[] args) 
	{
		Coche coche1 = new Coche();
		coche1.verInfo();
		
		Coche coche2 = new Coche("Mercedes", "PG", "5678 NFD", 2009);
		coche2.verInfo();
		

	}

}
