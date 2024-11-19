package RetoMatrix;

public class Matrix 
{
	public static void main(String[] args) 
	{
		Personaje neo = new Personaje("NEO", true);
		Personaje Trinity = new Personaje("Trinity", true);
		Personaje agente = new Personaje ("Agente", false);
		Trinity.recibeDisparo();
		agente.recibeDisparo();
		System.out.println(neo);
		System.out.println(Trinity);
		System.out.println(agente);
	}
}
