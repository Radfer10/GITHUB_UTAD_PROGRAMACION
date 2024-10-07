package Ejercicios_Practica;

public class HolaMundoObjeto 
{
	private String saludo;
	
	public String getSaludo()
	{
		return saludo;
	}
	
	public void getSaludo(String saludo)
	{
		this.saludo = saludo;
	}
	
	public static void main (String[] args)
	{
		HolaMundoObjeto ejemplo = new HolaMundoObjeto();
		ejemplo.getSaludo("Hola Mundo");
		System.out.println(ejemplo.getSaludo());
		
	}

}
