package ActividadCoche;
public class PruebaCoche 
{
	public static void main(String[] args) 
	{
		Coche Coche1 = new Coche ("BMW M4 Cabrio", 40, 10.2);
		Coche1.arrancar();
		Coche1.acelerar(120);
		Coche1.conducir(150);
		Coche1.frenar(90);
		Coche1.conducir(100);
		Coche1.frenar(0);
		Coche1.parar();
		Coche1.repostar(2.5);
		Coche1.toString();
		System.out.println(Coche1);
		System.out.println("--------------------");
		Coche Coche2 = new Coche ("BMW M135i xDrive", 30.00, 7.4);
		Coche2.parar();
		Coche2.acelerar(100);
		Coche2.frenar(50);
		Coche2.conducir(20);
		Coche2.arrancar();
		Coche2.repostar(10.0);
		Coche2.acelerar(150);
		Coche2.acelerar(100);
		Coche2.parar();
		Coche2.conducir(1000);
		Coche2.conducir(150);
		Coche2.frenar(-50);
		Coche2.frenar(0);
		Coche2.parar();
		Coche2.parar();
		Coche2.repostar(22.8);
		Coche2.toString();
		System.out.println(Coche2);
		System.out.println("--------------------");
		Coche.CuentaCoches();
	}
}
