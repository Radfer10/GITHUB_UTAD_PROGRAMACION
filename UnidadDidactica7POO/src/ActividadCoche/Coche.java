package ActividadCoche;

public class Coche 
{
	/*Inicializamos la variable estatica que cuenta la cantidad de objetos
	 * de la clase que se crearán a 0*/
	public static int cantidadCochesFabricados = 0;
	
	public String modelo;
	public int velocidad;
	public double deposito;
	public double consumo;
	public double kilometrosTotales;
	public double combustible;
	public boolean arrancado;
	/*Inicializamos el consructor con los parámetros de modelo, depósito y
	 *el consumo del coche. Además introducimos dentro del constructor la variable
	 *estática que cuenta la cantidad de objetos creados de la clase coche.*/
	Coche (String modelo, double deposito, double consumo)
	{
		this.modelo = modelo;
		this.velocidad = 0;
		this.kilometrosTotales = 0;
		this.deposito = deposito;
		this.consumo = consumo / 100;
		this.combustible = deposito;
		this.arrancado = false;
		cantidadCochesFabricados++;
	}
	/*Este método se encarga de arrancar el objeto coche si no esta arrancado
	 * para ello y gracias a la variable tipo booleano "arrancado"
	 * si la condicion dice que es false indica que el coche esta arrancado
	 * y si no es asi arranca el coche.*/
	public void arrancar ()
	{
		if (arrancado)
			System.out.println("El coche esta arrancado");
		else
		{
			arrancado = true;
			System.out.println("Se arranca el coche");	
		}
			
	}
	/*Este metodo se encarga de detener el coche, para ello lo he construido
	 * con tres condiciones diferetnes indicando que si el coche no esta arrancado
	 * muestra un mensaje de error, si la velocidad es inferior a 0 tambien muestra 
	 * un error y sino se cumplen estas condiciones indica que el coche esta en 
	 * movimiento y detiene el coche.*/
	public void parar ()
	{
		if (!arrancado)
			System.out.println("Error: El coche ya está parado");
		else if (velocidad > 0)
			System.out.println("Error: Debe reducir a 0 antes de parar");
		else
		{
			arrancado = false;
			System.out.println("Se para el coche");
		}		
	}
	/*Este metodo toma como parametro la cantidad en numero dependiendo de cuanto se
	 * desea acelerar el coche. Si el coche no esta arrancado muestra un error y 
	 * y si se incerementa a mas de 120 muestra otro Error. Por el contrario
	 * si no se cumplen esas condiciones se acelera el coche y se le suma el incremento 
	 * a la velocidad del coche*/
	public void acelerar (int incrementar)
	{
		if (!arrancado)
			System.out.println("Error: Debe arrancar antes de acelerar");
		else if (velocidad + incrementar > 120)
			System.out.println("Error: No es posible ir a " + incrementar);
		else
		{
			velocidad += incrementar;
			System.out.println("Se acelera de 0 a " + velocidad);
		}
	}
	/*Este método hace reducir la velocidad del coche que sigue tres condiciones ya que
	 * si el coche no esta arrancado muestra un error si el decremento para frenar el coche
	 * es negativo muestra otro error y si pasa esas condiciones muestro que se pasa de la velocidad actual
	 * al nuevo parametro introducido y luego igualo la nueva velocidad introducida a velocidad*/
	public void frenar (int decrementar)
	{
		int velocidadActual = velocidad; 
		if (!arrancado)
			System.out.println("Error: Debe arrancar antes de frenar");
		else if (decrementar < 0)
			System.out.println("Error: No es posbile frenar por debajo de 0");
		else
		{
			System.out.println("Se frena de " + velocidadActual + " hasta " + decrementar);
			velocidad = decrementar;
		}
	}
	/*Este método sirve para conducir el coche segun un parametro introducido que son los kilometros
	 * que recorrera el coche y que por ende dependerá de cuento consumira por kilometro.
	 * Si el coche esta arrancado muestra un error y si la velocidad es igual a 0,
	 * mostrará un mensaje indicando que hay que acelerar antes el coche para poder conducirlo.
	 * Si se pasan esas comprobaciones inicializo una nueva variable que calculará si con el consumo actual del coche le 
	 * llega para recorrer los kilometros necesarios y si no es asi mostrará un error indicando que no puede recorrer esa cantidad.
	 * Por lo contrario si cumple esa condicion se restará los kilometors por el consumo al conbustible del coche indicando cuanto ha consumido el 
	 * coche durante esos kilometors introducidos.*/
	public void conducir (int kilometros)
	{
		if (!arrancado)
			System.out.println("Error: Para conducir el coche debe estar arrancado y con velocidad superior a 0");
		else if (velocidad == 0)
			System.out.println("La velocidad es de 0 km/h. Acelerar primero antes de conducir");
		else
		{
			double combustibleNecesario = kilometros * consumo; 
	        if (combustible >= combustibleNecesario) 
	        {
	            kilometrosTotales += kilometros;
	            System.out.printf("Se conducen %d kilómetros%n", kilometros);
	            System.out.printf("-> El depósito pasa de %.2f hasta %.2f%n", combustible, (combustible - combustibleNecesario));
	            combustible -= combustibleNecesario;
			}
			else
				System.out.println("Error: No tiene suficiente gasolina");
		}	
	}	
	/*Por último este método le sumará muevo combudtible al coche teniendo como limite 
	 * la capacidad del deposito, siempre y cuando el coche este detenido. 
	 * Si el coche ya esta arrancado se mostrará un error
	 * indicando que antes de repostar el vehiculo tiene que estar parado 
	 * y si es asi se comprueba si los litros de cobustible nuevos
	 * no supera el limite del deposito de coche si es asi se ajusta a la capacidad del deposito 
	 * maximo y si no simplemente se incrementa los nuevos litros de consumibles añadidos.
	 * */
	public void repostar (double litros)
	{
		if (arrancado == true)
			System.out.println("Error: Debe parar antes de repostar");
		else if (combustible + litros > deposito)
			System.out.printf("-> El depósito pasa de %.2f hasta %.2f%n", combustible, deposito);
		else
		{
			double combustibleActual = combustible;
			combustible += litros;
			System.out.printf("-> El depósito pasa de %.2f hasta %.2f%n", combustibleActual, deposito);
		}
	}
	/*Este metodo básicamente printea y muestra por pantalla un resumen de los atributos del objeto al final del programa*/
	public String toString ()
	{
		return String.format("Modelo: %s, velocidad=%d, deposito=%.1f, consumo=%.1f, kilometros=%.0f, estaArrancado=%b",
		        modelo, velocidad, deposito, consumo * 100, kilometrosTotales, arrancado);
	}
	/*Este metodo muestra por pantalla el total de obejtos creados al finalizar el programa gracias a 
	 * la variable statica que incrementa cada vez que se genera un objeto nuevo*/
	public static void CuentaCoches()
	{
		System.out.println("Total coches: " + cantidadCochesFabricados);
	}
}
