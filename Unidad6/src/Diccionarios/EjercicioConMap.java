package Diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class EjercicioConMap 
{
	public static void main (String[] args)
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("Juan", 1);
		map.put("Pepe", 5);
		map.put("Maria", 9);
		
		Integer Valor = map.get("Juan");
		
	
		
		for (Map.Entry<String, Integer> pareja : map.entrySet())
			System.out.println(pareja.getKey() + " : " + pareja.getValue());
		System.out.println();
		
		Map<String, Integer> treemap = new TreeMap<>();
		treemap.put("Juan", 1);
		treemap.put("Pepe", 5);
		treemap.put("Maria", 9);
		
		for (Map.Entry<String, Integer> pareja : treemap.entrySet())
		{
			System.out.println(pareja.getKey() + " : " + pareja.getValue());
			System.out.println("Juan = "+ Valor);
		}
		System.out.println();
		
		Map<String, Integer> Linkedmap = new LinkedHashMap<>();
		Linkedmap.put("Juan", 1);
		Linkedmap.put("Pepe", 5);
		Linkedmap.put("Maria", 9);
		
		for (Map.Entry<String, Integer> pareja : Linkedmap.entrySet())
			System.out.println(pareja.getKey() + " : " + pareja.getValue());
	}

}
