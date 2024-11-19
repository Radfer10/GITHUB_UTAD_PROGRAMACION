package RetoClaseHumano;

import java.util.ArrayList;

public class Mundo {

	public static void main(String[] args) 
	{
		Humano Javier = new Humano("Javier", 22, 78.9, 1.80);
		Humano Paula = new Humano ("Paula", 23, 56.8, 1.71);
		System.out.println(Javier);
		System.out.println(Paula);
		String pareja = Javier.toString()+Paula.toString().toUpperCase();
		System.out.println(pareja);
		Paula.cumplirAños();
		System.out.println(Paula);
		Javier.cambiarPeso();
		System.out.println(Javier.peso);
		
		ArrayList<Humano> poblacion = new ArrayList<>();
		poblacion.add(Paula);
		poblacion.add(Javier);
		
		for (Humano h: poblacion)
		{
			h.cumplirAños();
			System.out.print(h.nombre);
			System.out.print(" ");
			System.out.print(h.edad);
			System.out.println();
		}
		

	}
	

}
