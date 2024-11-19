package RetoHumanoyEdad;
import java.util.ArrayList;
import java.util.Scanner;
import RetoClaseHumano.Humano;

public class EdadAutomatica 
{

    public static void main(String[] args) 
    {
        String nombre;
        ArrayList<Humano> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Bucle para introducir nombres
        while (true) 
        {
            System.out.print("Introducir un nombre (fin para terminar): ");
            nombre = sc.nextLine().trim();  // Guardamos el nombre introducido y usamos trim() para eliminar espacios

            if (nombre.equalsIgnoreCase("fin")) {  // Si se introduce "fin", terminamos
                break;
            }

            // Buscamos si ya existe una persona con ese nombre
            boolean encontrado = false;
            for (Humano persona : personas) 
            {
                if (persona.getNombre().equalsIgnoreCase(nombre)) {  // Compara ignorando mayúsculas/minúsculas
                    persona.crecer();  // Si ya existe, incrementamos la edad
                    encontrado = true;
                    break;
                }
            }

            // Si no se encuentra la persona, la agregamos a la lista
            if (!encontrado) 
            {
                // Añadimos una nueva persona con edad 0, peso y estatura 0
                personas.add(new Humano(nombre, 0, 0, 0));
            }
        }

        // Al final, imprimimos la población y las edades
        System.out.println();
        for (Humano persona : personas) 
        {
            // Mostramos la población y el nombre con su edad
            System.out.println("Población=" + personas.size() + "[nombre=" + persona.getNombre() + ", edad=" + persona.getedad() + "]");
        }

        sc.close();  // Cerramos el scanner
    }
}


	







